package com.reckue.ms.handler.exception;

import java.util.Map;

public class NotFoundException extends MonitoringException {

    public NotFoundException(String code, String message, Map<String, Object> extra) {
        super(code, message, extra);
    }
}
