package com.reckue.ms.controller.impl;

import com.reckue.ms.controller.EquipmentController;
import com.reckue.ms.converter.EquipmentConverter;
import com.reckue.ms.entity.Equipment;
import com.reckue.ms.model.EquipmentDto;
import com.reckue.ms.service.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

public class EquipmentControllerImpl implements EquipmentController {

    @Autowired
    private EquipmentConverter equipmentConverter;

    @Autowired
    private EquipmentService equipmentService;


    @Override
    public ResponseEntity<EquipmentDto> createEquipment(EquipmentDto equipmentDto) {
        Equipment equipment = equipmentService.create(
                equipmentConverter.dtoToEntity(equipmentDto)
        );
        return new ResponseEntity<>(equipmentConverter.entityToDto(equipment), HttpStatus.CREATED);
    }

    @Override
    public EquipmentDto findEquipmentById(UUID id) {
        return equipmentConverter.entityToDto(equipmentService.findById(id));
    }

    @Override
    public EquipmentDto updateEquipmentById(EquipmentDto equipmentDto, UUID id) {
        equipmentDto.setId(id);
        Equipment equipment = equipmentService.updateById(
                equipmentConverter.dtoToEntity(equipmentDto)
        );
        return equipmentConverter.entityToDto(equipment);
    }

    @Override
    public ResponseEntity<Void> deleteEquipmentById(UUID id) {
        equipmentService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
