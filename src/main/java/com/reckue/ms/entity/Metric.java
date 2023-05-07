package com.reckue.ms.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "metrics")
public class Metric {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "algorithm")
    private String algorithm;

    @Column(name = "is_used_cpu_usage")
    private boolean isUsedCpuUsage;

    @Column(name = "is_used_ram_usage")
    private boolean isUsedRamUsage;

    @Column(name = "is_used_rom_usage")
    private boolean isUsedRomUsage;

    @Column(name = "is_used_network_usage")
    private boolean isUsedNetworkUsage;

    @Column(name = "is_used_temperature_usage")
    private boolean isUsedTemperatureUsage;

    @Column(name = "is_used_cost_usage")
    private boolean isUsedCostUsage;

    @OneToMany
    private List<MetricResult> metricResults = new ArrayList<>();

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "createdAt", column = @Column(name = "created_at")),
            @AttributeOverride(name = "createdBy", column = @Column(name = "created_by")),
            @AttributeOverride(name = "modifiedAt", column = @Column(name = "modified_at")),
            @AttributeOverride(name = "modifiedBy", column = @Column(name = "modified_by")),
    })
    private Audit audit;
}
