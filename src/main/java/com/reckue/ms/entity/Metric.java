package com.reckue.ms.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.jmx.support.MetricType;

import java.util.UUID;

@Data
@Entity
@Embeddable
public class Metric {

    @Id
    private UUID id;

    private String name;

    private String description;

    private String algorithm;

    private boolean isUsedUsage;

    private boolean isUsedCpuUsage;

    private boolean isUsedRamUsage;

    private boolean isUsedRomUsage;

    private boolean isUsedNetworkUsage;

    private boolean isUsedTemperatureValue;

    private MetricType type;

    @Embedded
    private Audit audit;
}
