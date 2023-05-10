package com.reckue.ms.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Data
@Entity
@Table(name = "calculation_errors")
public class CalculationError {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "code")
    private String code;

    @Column(name = "message")
    private String message;

    @Column(name = "reason")
    private String reason;

    @Column(name = "debug_detail")
    private String debugDetail;

    @ManyToOne
    @JoinColumn(name = "metric_results_id", nullable = false)
    private MetricResult metricResult;
}
