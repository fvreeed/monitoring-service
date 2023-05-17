package com.reckue.ms.converter.impl;

import com.reckue.ms.converter.IndicatorConverter;
import com.reckue.ms.entity.Indicator;
import com.reckue.ms.model.IndicatorDto;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-17T19:32:07+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class IndicatorConverterImpl implements IndicatorConverter {

    @Override
    public Indicator dtoToEntity(IndicatorDto indicatorDto) {
        if ( indicatorDto == null ) {
            return null;
        }

        Indicator indicator = new Indicator();

        indicator.setId( indicatorDto.getId() );
        indicator.setValue( indicatorDto.getValue() );
        indicator.setType( indicatorDto.getType() );

        return indicator;
    }

    @Override
    public IndicatorDto entityToDto(Indicator indicator) {
        if ( indicator == null ) {
            return null;
        }

        IndicatorDto indicatorDto = new IndicatorDto();

        indicatorDto.setId( indicator.getId() );
        indicatorDto.setValue( indicator.getValue() );
        indicatorDto.setType( indicator.getType() );

        return indicatorDto;
    }
}
