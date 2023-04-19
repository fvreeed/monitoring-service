package com.reckue.ms.handler;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Getter
@Builder
public class ErrorResponse {

    private String code;

    private String message;

    private Map<String, Object> extra;
}
