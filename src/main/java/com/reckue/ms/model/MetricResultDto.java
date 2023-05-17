package com.reckue.ms.model;

import com.reckue.ms.entity.Audit;
import com.reckue.ms.entity.CalculationError;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class MetricResultDto extends CalculatedAuditDto {

    private UUID id;

    private double value;

    private List<CalculationError> errors;

    private Audit audit;

    private UUID metricId;

    private UUID equipmentId;
}
