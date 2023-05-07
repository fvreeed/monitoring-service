package com.reckue.ms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = true)
@Embeddable
public class IndicatorAudit extends Audit {

    @Column(name = "collected_at")
    private LocalDateTime collectedAt;
}
