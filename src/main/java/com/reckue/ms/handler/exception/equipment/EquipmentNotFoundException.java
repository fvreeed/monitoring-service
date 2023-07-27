package com.reckue.ms.handler.exception.equipment;

import com.reckue.ms.handler.exception.NotFoundException;

import java.util.Map;
import java.util.UUID;

public class EquipmentNotFoundException extends NotFoundException {

    public EquipmentNotFoundException(UUID id) {
        super(
                "EQUIPMENT-0001",
                String.format("Equipment \"%s\" not found", id),
                Map.of("id", id)
        );
    }
}
