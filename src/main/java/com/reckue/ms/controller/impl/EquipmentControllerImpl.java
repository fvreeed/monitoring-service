package com.reckue.ms.controller.impl;

import com.reckue.ms.controller.EquipmentController;
import com.reckue.ms.converter.EquipmentConverter;
import com.reckue.ms.entity.Equipment;
import com.reckue.ms.model.EquipmentDto;
import com.reckue.ms.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

public class EquipmentControllerImpl implements EquipmentController {

    @Autowired
    private EquipmentConverter equipmentConverter;

    @Autowired
    private EquipmentService equipmentService;


    @Override
    public EquipmentDto createEquipment(EquipmentDto equipmentDto) {
        Equipment equipment = equipmentService.create(
                equipmentConverter.dtoToEntity(equipmentDto)
        );
        return equipmentConverter.entityToDto(equipment);
    }

    @Override
    public Equipment findEquipmentById(UUID id) {
        return equipmentService.findById(id);
    }

    @Override
    public Equipment updateEquipmentById(Equipment equipment, UUID id) {
        equipment.setId(id);
        return equipmentService.updateById(equipment);
    }

    @Override
    public void deleteEquipmentById(UUID id) {
        equipmentService.deleteById(id);
    }
}
