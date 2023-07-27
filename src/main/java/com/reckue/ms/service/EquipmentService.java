package com.reckue.ms.service;

import com.reckue.ms.entity.Equipment;

import java.util.UUID;

public interface EquipmentService {

    Equipment create(Equipment equipment);

    Equipment findById(UUID id);

    Equipment updateById(Equipment equipment);

    void deleteById(UUID id);
}
