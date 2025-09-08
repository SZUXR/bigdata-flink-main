package com.example.flink.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserBehavior {
    private Long userId;
    private String itemId;
    private String categoryId;
    private String behavior;
    private Long timestamp;
    
    // 处理后的字段
    private String date;
    private Integer hour;
    private Long behaviorCount;
}