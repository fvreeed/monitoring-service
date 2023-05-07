package com.reckue.ms.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Embeddable
public class IndicatorAudit extends Audit {

    private LocalDateTime collectedAt;
}
