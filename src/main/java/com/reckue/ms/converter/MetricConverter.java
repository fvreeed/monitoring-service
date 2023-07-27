package com.reckue.ms.converter;

import com.reckue.ms.entity.Metric;
import com.reckue.ms.model.MetricDto;
import org.mapstruct.Mapper;

@Mapper
public interface MetricConverter {

    Metric dtoToEntity(MetricDto metricDto);

    MetricDto entityToDto(Metric metric);
}
