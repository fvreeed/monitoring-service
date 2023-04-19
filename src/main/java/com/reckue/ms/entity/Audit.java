package com.reckue.ms.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Embeddable
public class Audit {

    private LocalDateTime createdDate;

    private String createdBy;
}
