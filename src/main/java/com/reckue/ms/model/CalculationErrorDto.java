package com.reckue.ms.model;

import java.util.Map;
import java.util.UUID;

public class CalculationErrorDto {

    private UUID id;

    private String code;

    private String message;

    private String reason;

    private String debugDetail;

    private Map<String, String> extra;
}
