package com.reckue.ms.handler.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
@AllArgsConstructor
public class MonitoringException extends RuntimeException {

    private String code;

    private String message;

    private Map<String, Object> extra;
}
