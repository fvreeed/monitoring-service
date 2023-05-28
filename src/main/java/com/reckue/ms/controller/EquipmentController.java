package com.reckue.ms.controller;

import com.reckue.ms.model.EquipmentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/equipment")
public interface EquipmentController {

    @PostMapping
    ResponseEntity<EquipmentDto> createEquipment(@RequestBody EquipmentDto equipmentDto);

    @GetMapping("/{id}")
    EquipmentDto findEquipmentById(@PathVariable UUID id);

    @PostMapping("/{id}")
    EquipmentDto updateEquipmentById(@RequestBody EquipmentDto equipmentDto, @PathVariable UUID id);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteEquipmentById(@PathVariable UUID id);
}
