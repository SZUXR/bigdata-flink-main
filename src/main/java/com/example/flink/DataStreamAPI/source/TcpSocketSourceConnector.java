package com.example.flink.DataStreamAPI.source;

import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

public class TcpSocketSourceConnector {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.createLocalEnvironmentWithWebUI(new Configuration());

        env.socketTextStream("node3", 4567, '\n')
                .print();

        env.execute("TcpSourceSourceCollectorExample");
    }
}
