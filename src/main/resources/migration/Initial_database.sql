CREATE TABLE IF NOT EXISTS equipments
(
    id          UUID        NOT NULL PRIMARY KEY,
    type        VARCHAR(50) NOT NULL,
    name        VARCHAR(50) NOT NULL,
    description VARCHAR(50),
    created_at  VARCHAR(50) NOT NULL,
    created_by  VARCHAR(50) NOT NULL,
    modified_at VARCHAR(50),
    modified_by VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS indicators
(
    id           UUID        NOT NULL PRIMARY KEY,
    equipment_id UUID        NOT NULL,
    value        DECIMAL     NOT NULL,
    type         VARCHAR(50) NOT NULL,
    collected_at VARCHAR(50) NOT NULL,
    created_at   timestamp   NOT NULL,
    created_by   VARCHAR(50) NOT NULL,
    modified_at  VARCHAR(50),
    modified_by  VARCHAR(50),
    FOREIGN KEY (equipment_id)
        REFERENCES equipments (id)
);

CREATE TABLE IF NOT EXISTS metrics
(
    id                        UUID        NOT NULL PRIMARY KEY,
    name                      VARCHAR(50) NOT NULL,
    description               VARCHAR(255),
    algorithm                 VARCHAR(255),
    is_used_cpu_usage         BOOLEAN     NOT NULL DEFAULT false,
    is_used_ram_usage         BOOLEAN     NOT NULL DEFAULT false,
    is_used_rom_usage         BOOLEAN     NOT NULL DEFAULT false,
    is_used_network_usage     BOOLEAN     NOT NULL DEFAULT false,
    is_used_temperature_usage BOOLEAN     NOT NULL DEFAULT false,
    is_used_cost_usage        BOOLEAN     NOT NULL DEFAULT false,
    created_at                timestamp   NOT NULL,
    created_by                VARCHAR(50) NOT NULL,
    modified_at               VARCHAR(50),
    modified_by               VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS metric_results
(
    id           UUID PRIMARY KEY,
    equipment_id UUID        NOT NULL,
    metric_id    UUID        NOT NULL,
    metric_value DECIMAL     NOT NULL,
    created_at   VARCHAR(50) NOT NULL,
    created_by   VARCHAR(50) NOT NULL,
    modified_at  VARCHAR(50),
    modified_by  VARCHAR(50),
    FOREIGN KEY (equipment_id)
        REFERENCES equipments (id),
    FOREIGN KEY (metric_id)
        REFERENCES metrics (id)
);


CREATE TABLE IF NOT EXISTS calculation_errors
(
    id                UUID        NOT NULL PRIMARY KEY,
    metric_results_id UUID        NOT NULL,
    code              VARCHAR(50) NOT NULL,
    message           VARCHAR(50) NOT NULL,
    reason            VARCHAR(50),
    debug_detail      VARCHAR(50),
    extra             VARCHAR(50),
    FOREIGN KEY (metric_results_id)
        REFERENCES metric_results (id)
)
