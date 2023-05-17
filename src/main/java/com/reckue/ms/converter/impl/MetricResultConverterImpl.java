package com.reckue.ms.converter.impl;

import com.reckue.ms.converter.MetricResultConverter;
import com.reckue.ms.entity.CalculationError;
import com.reckue.ms.entity.MetricResult;
import com.reckue.ms.model.MetricResultDto;

import javax.annotation.processing.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-17T19:32:07+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class MetricResultConverterImpl implements MetricResultConverter {

    @Override
    public MetricResult dtoToEntity(MetricResultDto metricResultDto) {
        if ( metricResultDto == null ) {
            return null;
        }

        MetricResult metricResult = new MetricResult();

        metricResult.setId( metricResultDto.getId() );
        metricResult.setValue( metricResultDto.getValue() );
        List<CalculationError> list = metricResultDto.getErrors();
        if ( list != null ) {
            metricResult.setErrors( new ArrayList<CalculationError>( list ) );
        }
        metricResult.setAudit( metricResultDto.getAudit() );

        return metricResult;
    }

    @Override
    public MetricResultDto entityToDto(MetricResult metricResult) {
        if ( metricResult == null ) {
            return null;
        }

        MetricResultDto metricResultDto = new MetricResultDto();

        metricResultDto.setId( metricResult.getId() );
        metricResultDto.setValue( metricResult.getValue() );
        List<CalculationError> list = metricResult.getErrors();
        if ( list != null ) {
            metricResultDto.setErrors( new ArrayList<CalculationError>( list ) );
        }
        metricResultDto.setAudit( metricResult.getAudit() );

        return metricResultDto;
    }
}
