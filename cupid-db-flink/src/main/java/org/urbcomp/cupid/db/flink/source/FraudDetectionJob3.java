package org.urbcomp.cupid.db.flink.source;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class FraudDetectionJob3 {

    public static void main(String[] args) throws Exception {
        // 设置流执行环境
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        // 设置自定义数据源。参数false指定创建的是流数据源
        DataStream<Transaction> transactions =
                env.addSource(new MyTransactionSource(true)).name("transactions");

        // 输出查看
        transactions.print();

        // 执行流程序
        env.execute("Transaction Stream");
    }
}
