package com.example.flink.DataStreamAPI.source;

import org.apache.flink.api.common.typeinfo.Types;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class CollectionsSourceConnector {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.fromCollection(Arrays.asList(1, 2, 3, 4, 5))
                .map(value -> value * 10, Types.INT)
                .print("collections");

        env.fromElements(1, 2, 3, 4, 5)
                .map(e -> e * 2, Types.INT)
                .print("elements");

        env.fromSequence(10, 30)
                .map(e -> {
                    TimeUnit.MINUTES.sleep(1);
                    return e * 3;
                }, Types.LONG)
                .print("sequence");

        env.execute("Java Collection Source");
    }

}
