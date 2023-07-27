package com.reckue.ms.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CalculatedAuditDto extends AuditDto {

    private LocalDateTime calculatedAt;
}
