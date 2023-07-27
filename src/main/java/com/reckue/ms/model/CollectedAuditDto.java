package com.reckue.ms.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CollectedAuditDto extends AuditDto {

    private LocalDateTime collectedAt;
}
