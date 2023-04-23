package com.reckue.ms.handler.exception.metric;

import com.reckue.ms.handler.exception.NotFoundException;

import java.util.Map;
import java.util.UUID;

public class MetricNotFoundException extends NotFoundException {

    public MetricNotFoundException(UUID id) {
        super(
                "METRIC-0001",
                String.format("Metric \"%s\" not found", id),
                Map.of("id", id)
        );
    }
}
