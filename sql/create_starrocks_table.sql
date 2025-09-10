-- 在 StarRocks 中创建流量看板表
CREATE TABLE IF NOT EXISTS dashboard_traffic_1 (
    window_start DATETIME,
    window_end DATETIME,
    pv_amt BIGINT,
    uv_amt BIGINT,
    ses_amt BIGINT
) ENGINE=OLAP
DUPLICATE KEY(window_start, window_end)
DISTRIBUTED BY HASH(window_start) BUCKETS 10
PROPERTIES (
    "replication_num" = "1"
);