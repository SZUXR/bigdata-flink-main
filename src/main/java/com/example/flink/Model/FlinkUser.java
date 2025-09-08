package com.example.flink.Model;

import lombok.Data;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonDeserialize
@Data
public class FlinkUser {
    @JsonProperty("ID")
    private int id;
    @JsonProperty("USERNAME")
    private String username;
    @JsonProperty("AGE")
    private int age;
}
