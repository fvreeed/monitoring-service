package com.reckue.ms.service.impl;

import com.reckue.ms.entity.Equipment;
import com.reckue.ms.handler.exception.metric.MetricNotFoundException;
import com.reckue.ms.repository.EquipmentRepository;
import com.reckue.ms.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EquipmentServiceImpl implements EquipmentService {

    private final EquipmentRepository equipmentRepository;

    @Autowired
    public EquipmentServiceImpl(EquipmentRepository equipmentRepository) {
        this.equipmentRepository = equipmentRepository;
    }

    @Override
    public Equipment create(Equipment equipment) {
        equipment.setId(UUID.randomUUID());
        return equipmentRepository.save(equipment);
    }

    @Override
    public Equipment findById(UUID id) {
        return equipmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("replace this"));
    }

    @Override
    public Equipment updateById(Equipment equipment) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }
}
