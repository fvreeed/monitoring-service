package com.reckue.ms.model;

import com.reckue.ms.entity.Audit;
import com.reckue.ms.entity.Indicator;
import com.reckue.ms.entity.MetricResult;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class EquipmentDto extends AuditDto {

    private UUID id;

    private String type;

    private String name;

    private String description;

    private Audit audit;

    private List<Indicator> indicators;

    private List<MetricResult> metricResults;
}
