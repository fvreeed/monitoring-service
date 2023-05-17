package com.reckue.ms.converter;

import com.reckue.ms.entity.MetricResult;
import com.reckue.ms.model.MetricResultDto;
import org.mapstruct.Mapper;

@Mapper
public interface MetricResultConverter {

    MetricResult dtoToEntity(MetricResultDto metricResultDto);

    MetricResultDto entityToDto(MetricResult metricResult);
}
