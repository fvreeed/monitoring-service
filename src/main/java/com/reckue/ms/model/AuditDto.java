package com.reckue.ms.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AuditDto {

    private LocalDateTime createdAt;

    private String createdBy;

    private LocalDateTime modifiedAt;

    private String modifiedBy;
}
