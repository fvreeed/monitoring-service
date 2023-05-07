package com.reckue.ms.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class MetricResult {

    @Id
    private UUID id;

    private double value;

    @Embedded
    private List<CalculationError> errors;

    @Embedded
    private Audit audit;

    @Embedded
    private Metric metric;
}
