package com.reckue.ms.handler.exception;

import java.util.Map;

public class AlreadyExistException extends MonitoringException {

    public AlreadyExistException(String code, String message, Map<String, Object> extra) {
        super(code, message, extra);
    }
}
