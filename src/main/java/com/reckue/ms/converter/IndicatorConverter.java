package com.reckue.ms.converter;

import com.reckue.ms.entity.Indicator;
import com.reckue.ms.model.IndicatorDto;
import org.mapstruct.Mapper;

@Mapper
public interface IndicatorConverter {

    Indicator dtoToEntity(IndicatorDto indicatorDto);

    IndicatorDto entityToDto(Indicator indicator);
}
