package com.reckue.ms.model;

import lombok.Data;

import java.util.UUID;

@Data
public class MetricDto extends AuditDto {

    private UUID id;

    private String name;

    private String description;

    private String algorithm;

    private boolean isUsedCpuUsage;

    private boolean isUsedRamUsage;

    private boolean isUsedRomUsage;

    private boolean isUsedNetworkUsage;

    private boolean isUsedTemperatureUsage;

    private boolean isUsedCostUsage;
}
