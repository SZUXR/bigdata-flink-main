# Flink 1.15.2 快速开始项目

基于 Apache Flink 1.15.2 的 Maven 项目模板。

## 项目结构

```
src/
├── main/
│   ├── java/com/example/flink/
│   │   └── StreamingWordCount.java       # 流处理WordCount示例
│   └── resources/
│       └── log4j2.properties       # 日志配置
└── pom.xml                         # Maven 配置
```

## 快速开始

### 编译项目
```bash
mvn clean compile
```

### 运行示例
```bash

# 运行流处理示例
mvn exec:java -Dexec.mainClass="com.example.flink.StreamingWordCount"
```

### 打包项目
```bash
mvn clean package
```

## 技术栈

- Apache Flink 1.15.2
- Java 8+
- Maven 3.x
- Log4j2

## 许可证

Apache License 2.0