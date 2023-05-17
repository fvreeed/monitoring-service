package com.reckue.ms.converter.impl;

import com.reckue.ms.converter.EquipmentConverter;
import com.reckue.ms.entity.Equipment;
import com.reckue.ms.entity.Indicator;
import com.reckue.ms.entity.MetricResult;
import com.reckue.ms.model.EquipmentDto;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-17T19:32:07+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class EquipmentConverterImpl implements EquipmentConverter {

    @Override
    public Equipment dtoToEntity(EquipmentDto indicatorDto) {
        if ( indicatorDto == null ) {
            return null;
        }

        Equipment equipment = new Equipment();

        equipment.setId( indicatorDto.getId() );
        equipment.setType( indicatorDto.getType() );
        equipment.setName( indicatorDto.getName() );
        equipment.setDescription( indicatorDto.getDescription() );
        equipment.setAudit( indicatorDto.getAudit() );
        List<Indicator> list = indicatorDto.getIndicators();
        if ( list != null ) {
            equipment.setIndicators( new ArrayList<Indicator>( list ) );
        }
        List<MetricResult> list1 = indicatorDto.getMetricResults();
        if ( list1 != null ) {
            equipment.setMetricResults( new ArrayList<MetricResult>( list1 ) );
        }

        return equipment;
    }

    @Override
    public EquipmentDto entityToDto(Equipment equipment) {
        if ( equipment == null ) {
            return null;
        }

        EquipmentDto equipmentDto = new EquipmentDto();

        equipmentDto.setId( equipment.getId() );
        equipmentDto.setType( equipment.getType() );
        equipmentDto.setName( equipment.getName() );
        equipmentDto.setDescription( equipment.getDescription() );
        equipmentDto.setAudit( equipment.getAudit() );
        List<Indicator> list = equipment.getIndicators();
        if ( list != null ) {
            equipmentDto.setIndicators( new ArrayList<Indicator>( list ) );
        }
        List<MetricResult> list1 = equipment.getMetricResults();
        if ( list1 != null ) {
            equipmentDto.setMetricResults( new ArrayList<MetricResult>( list1 ) );
        }

        return equipmentDto;
    }
}
