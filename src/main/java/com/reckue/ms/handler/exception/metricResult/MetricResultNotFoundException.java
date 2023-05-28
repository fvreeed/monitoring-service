package com.reckue.ms.handler.exception.metricResult;

import com.reckue.ms.handler.exception.NotFoundException;

import java.util.Map;
import java.util.UUID;

public class MetricResultNotFoundException extends NotFoundException {

    public MetricResultNotFoundException(UUID id) {
        super(
                "METRES-0001",
                String.format("MetricResult \"%s\" not found", id),
                Map.of("id", id)
        );
    }
}
