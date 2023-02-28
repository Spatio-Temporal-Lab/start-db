/*
 * Copyright 2022 ST-Lab
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License version 3 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 */

package org.urbcomp.cupid.db.spark.livy;

import lombok.extern.slf4j.Slf4j;
import org.urbcomp.cupid.db.config.DynamicConfig;
import org.urbcomp.cupid.db.spark.ISparkSubmitter;
import org.urbcomp.cupid.db.util.SparkSqlParam;

import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 维持至少有一个livy session运行
 *
 * @author jimo
 **/
@Slf4j
public class LivySubmitter implements ISparkSubmitter {

    private int sessionId;
    private final String DEFAULT_KIND = "spark";
    private final String SPLITTER = "_";
    /**
     * 每次轮询的间隔时长
     */
    private final int sleepMs;
    /**
     * 最大同步等待时长
     */
    private final int maxWaitTimeMs;

    private final LivyRestApi restApi;

    /**
     * 控制在session更新或不可用时，执行语句必须等待
     */
    private final ReentrantReadWriteLock sessionLock = new ReentrantReadWriteLock();
    private final ReentrantReadWriteLock.ReadLock sessionReadLock = sessionLock.readLock();
    private final ReentrantReadWriteLock.WriteLock sessionWriteLock = sessionLock.writeLock();

    public LivySubmitter() {
        this(new LivyRestApi(), true);
    }

    public LivySubmitter(LivyRestApi restApi, boolean checkSession) {
        this.sleepMs = 3000;
        this.maxWaitTimeMs = 120 * 1000;
        this.restApi = restApi;

        if (checkSession) {
            createNewSession();
            ScheduledExecutorService pool = Executors.newSingleThreadScheduledExecutor();
            pool.scheduleAtFixedRate(new CheckSessionTask(), 0, 3, TimeUnit.SECONDS);
        }
    }

    private class CheckSessionTask implements Runnable {

        @Override
        public void run() {
            log.info("Check Livy Session Start, current sessionId={}", sessionId);
            LivySessionState state = LivySessionState.not_started;
            try {
                final LivySessionResult session = restApi.getSession(sessionId);
                state = LivySessionState.valueOf(session.getState());
            } catch (RuntimeException e) {
                log.warn("Session Not Exists:{}", e.getMessage());
            }
            try {
                log.info("Check Livy Session current sessionId={}, state={}", sessionId, state);
                if (!state.ok()) {
                    // 先锁住，然后重新选择或创建一个session
                    sessionWriteLock.lock();
                    try {
                        boolean chosen = false;
                        final List<LivySessionResult> sessions = restApi.getSessions();
                        log.info("Check Livy Session get Sessions={}", sessions);
                        for (LivySessionResult s : sessions) {
                            final LivySessionState theState = LivySessionState.valueOf(
                                s.getState()
                            );
                            if (theState.ok()) {
                                sessionId = s.getId();
                                chosen = true;
                                break;
                            }
                        }
                        if (!chosen) {
                            createNewSession();
                        }
                    } finally {
                        sessionWriteLock.unlock();
                    }
                }
            } catch (Exception e) {
                log.warn("Check Livy Session Error", e);
            }
            log.info("Check Livy Session Finished, current sessionId={}", sessionId);
        }

    }

    private void createNewSession() {
        final LivySessionParam param = LivySessionParam.builder()
            .kind(DEFAULT_KIND)
            .driverCores(DynamicConfig.getSparkDriverCores())
            .driverMemory(DynamicConfig.getSparkDriverMemory())
            .numExecutors(DynamicConfig.getSparkNumExecutors())
            .executorCores(DynamicConfig.getSparkExecutorCores())
            .executorMemory(DynamicConfig.getSparkExecutorMemory())
             .jars(DynamicConfig.getDbSparkJars())
            .build();
        log.info("Check Livy Session create new Session,param={}", param);
        final LivySessionResult res = restApi.createSession(param);
        waitSessionOk(res.getId());
        sessionId = res.getId();
    }

    private void waitSessionOk(int id) {
        int attemptTime = 0;
        while (attemptTime < maxWaitTimeMs) {
            final LivySessionResult res = restApi.getSession(id);
            final LivySessionState state = LivySessionState.valueOf(res.getState());
            if (state.ok()) {
                return;
            }
            try {
                TimeUnit.MILLISECONDS.sleep(sleepMs);
            } catch (InterruptedException e) {
                log.warn("Wait Interrupted", e);
            }
            attemptTime += sleepMs;
            log.info("Check Livy Session wait session={} ready, current state={}", id, state);
        }
        log.warn("Check Livy Session wait session exceed maxWaitTimeMs={}", maxWaitTimeMs);
    }

    private String buildSqlId(int statementId) {
        return System.currentTimeMillis() + SPLITTER + statementId;
    }

    private int extractStatementId(String sqlId) {
        final String[] items = sqlId.split(SPLITTER);
        if (items.length == 2) {
            return Integer.parseInt(items[1]);
        }
        throw new IllegalArgumentException("InValid SqlId:" + sqlId);
    }

    @Override
    public String submit(SparkSqlParam param) {
        sessionReadLock.lock();
        try {
            String code = buildCode(param);
            final LivyStatementResult res = restApi.executeStatement(
                sessionId,
                LivyStatementParam.builder().kind(DEFAULT_KIND).code(code).build()
            );
            return buildSqlId(res.getId());
        } finally {
            sessionReadLock.unlock();
        }
    }

    /**
     * TODO 调用 CupidSparkDriver的main方法，需要序列化参数
     */
    private String buildCode(SparkSqlParam param) {
        return param.getSql();
    }

    @Override
    public void waitToFinish(String id) throws TimeoutException {
        final int statementId = extractStatementId(id);

        int attemptTime = 0;
        try {
            while (attemptTime < maxWaitTimeMs) {
                sessionReadLock.lock();
                final LivyStatementResult res;
                try {
                    res = restApi.getStatement(sessionId, statementId);
                } finally {
                    sessionReadLock.unlock();
                }
                final LivyStatementState state = LivyStatementState.valueOf(res.getState());
                switch (state) {
                    case available:
                        return;
                    case error:
                    case cancelling:
                    case cancelled:
                        throw new RuntimeException("Execute Failed: " + res);
                    default:
                }
                attemptTime += sleepMs;
                TimeUnit.MILLISECONDS.sleep(sleepMs);
            }
            throw new TimeoutException("Exceed maxWaitTime:" + maxWaitTimeMs);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
