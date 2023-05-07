package com.reckue.ms.entity;


import jakarta.persistence.Embedded;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Map;
import java.util.UUID;

@Data
public class CalculationError {

    @Id
    private UUID id;

    private String code;

    private String message;

    private String reason;

    private String debugDetail;

    private Map<String, String> extra;

    @Embedded
    private Audit audit;
}
