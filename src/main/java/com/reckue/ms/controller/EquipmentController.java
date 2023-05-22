package com.reckue.ms.controller;

import com.reckue.ms.entity.Equipment;
import com.reckue.ms.model.EquipmentDto;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/equipment")
public interface EquipmentController {

    @PostMapping
    EquipmentDto createEquipment(@RequestBody EquipmentDto equipmentDto);

    @GetMapping("/{id}")
    Equipment findEquipmentById(@PathVariable UUID id);

    @PostMapping("/{id}")
    Equipment updateEquipmentById(@RequestBody Equipment equipment, @PathVariable UUID id);

    @DeleteMapping("/{id}")
    void deleteEquipmentById(@PathVariable UUID id);
}
