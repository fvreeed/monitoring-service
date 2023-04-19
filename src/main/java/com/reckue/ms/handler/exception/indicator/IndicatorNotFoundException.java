package com.reckue.ms.handler.exception.indicator;

import com.reckue.ms.handler.exception.NotFoundException;

import java.util.Map;
import java.util.UUID;

public class IndicatorNotFoundException extends NotFoundException {

    public IndicatorNotFoundException(UUID id) {
        super(
                "INDICATOR-0001",
                String.format("Indicator \"%s\" not found", id),
                Map.of("id", id)
        );
    }
}
