package com.reckue.ms.model;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class MetricResultDto extends CalculatedAuditDto {

    private UUID id;

    private UUID metricId;

    private UUID equipmentId;

    private double value;

    private List<CalculationErrorDto> errors;
}
