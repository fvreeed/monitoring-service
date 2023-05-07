package com.reckue.ms.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "metric_results")
public class MetricResult {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "metric_value")
    private double value;

    @OneToMany(mappedBy = "metricResult")
    private List<CalculationError> errors = new ArrayList<>();

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "createdAt", column = @Column(name = "created_at")),
            @AttributeOverride(name = "createdBy", column = @Column(name = "created_by")),
            @AttributeOverride(name = "modifiedAt", column = @Column(name = "modified_at")),
            @AttributeOverride(name = "modifiedBy", column = @Column(name = "modified_by")),
    })
    private Audit audit;

    @ManyToOne
    @JoinColumn(name = "metric_id", nullable = false)
    private Metric metric;

    @ManyToOne
    @JoinColumn(name = "equipment_id", nullable = false)
    private Equipment equipment;
}
