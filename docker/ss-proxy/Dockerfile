FROM java:8-jdk

ENV PORT=3307
ENV APP_DIR=/usr/local

# 配置文件通过挂在配置目录的形式
# -v ${workspace}/ss-conf:/usr/local/ss-proxy/conf

# 包弄进来
ADD ss-proxy.tar.gz $APP_DIR

EXPOSE $PORT

# 启动服务
ENTRYPOINT ${APP_DIR}/ss-proxy/bin/start.sh ${PORT} && tail -f ${APP_DIR}/ss-proxy/logs/stdout.log
