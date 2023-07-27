package com.reckue.ms.converter;

import com.reckue.ms.entity.Equipment;
import com.reckue.ms.model.EquipmentDto;
import org.mapstruct.Mapper;

@Mapper
public interface EquipmentConverter {

    Equipment dtoToEntity(EquipmentDto indicatorDto);

    EquipmentDto entityToDto(Equipment equipment);
}
