package com.reckue.ms.handler.exception.metric;

import com.reckue.ms.handler.exception.AlreadyExistException;

import java.util.Map;

public class MetricAlreadyExistException extends AlreadyExistException {

    public MetricAlreadyExistException(String name) {
        super(
                "METRIC-0002",
                String.format("Name \"%s\" already used", name),
                Map.of("name", name)
        );
    }
}
