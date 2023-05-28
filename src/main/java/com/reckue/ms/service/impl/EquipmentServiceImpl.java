package com.reckue.ms.service.impl;

import com.reckue.ms.entity.Equipment;
import com.reckue.ms.handler.exception.equipment.EquipmentNotFoundException;
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
                .orElseThrow(() -> new EquipmentNotFoundException(id));
    }

    @Override
    public Equipment updateById(Equipment equipment) {
        if (!equipmentRepository.existsById(equipment.getId())) {
            throw new EquipmentNotFoundException(equipment.getId());
        }
        equipment.setId(equipment.getId());
        return equipmentRepository.save(equipment);
    }

    @Override
    public void deleteById(UUID id) {
        if (!equipmentRepository.existsById(id)) {
            throw new EquipmentNotFoundException(id);
        }
        equipmentRepository.deleteById(id);
    }
}
