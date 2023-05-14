package com.reckue.ms.model;

import com.reckue.ms.entity.IndicatorType;
import lombok.Data;

import java.util.UUID;

@Data
public class IndicatorDto extends CollectedAuditDto {

    private UUID id;

    private double value;

    private IndicatorType type;

    private UUID equipmentId;
}
