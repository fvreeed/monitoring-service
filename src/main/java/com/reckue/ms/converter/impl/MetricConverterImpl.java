package com.reckue.ms.converter.impl;

import com.reckue.ms.converter.MetricConverter;
import com.reckue.ms.entity.Metric;
import com.reckue.ms.model.MetricDto;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-17T19:32:07+0300",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class MetricConverterImpl implements MetricConverter {

    @Override
    public Metric dtoToEntity(MetricDto metricDto) {
        if ( metricDto == null ) {
            return null;
        }

        Metric metric = new Metric();

        metric.setId( metricDto.getId() );
        metric.setName( metricDto.getName() );
        metric.setDescription( metricDto.getDescription() );
        metric.setAlgorithm( metricDto.getAlgorithm() );
        metric.setUsedCpuUsage( metricDto.isUsedCpuUsage() );
        metric.setUsedRamUsage( metricDto.isUsedRamUsage() );
        metric.setUsedRomUsage( metricDto.isUsedRomUsage() );
        metric.setUsedNetworkUsage( metricDto.isUsedNetworkUsage() );
        metric.setUsedTemperatureUsage( metricDto.isUsedTemperatureUsage() );
        metric.setUsedCostUsage( metricDto.isUsedCostUsage() );

        return metric;
    }

    @Override
    public MetricDto entityToDto(Metric metric) {
        if ( metric == null ) {
            return null;
        }

        MetricDto metricDto = new MetricDto();

        metricDto.setId( metric.getId() );
        metricDto.setName( metric.getName() );
        metricDto.setDescription( metric.getDescription() );
        metricDto.setAlgorithm( metric.getAlgorithm() );
        metricDto.setUsedCpuUsage( metric.isUsedCpuUsage() );
        metricDto.setUsedRamUsage( metric.isUsedRamUsage() );
        metricDto.setUsedRomUsage( metric.isUsedRomUsage() );
        metricDto.setUsedNetworkUsage( metric.isUsedNetworkUsage() );
        metricDto.setUsedTemperatureUsage( metric.isUsedTemperatureUsage() );
        metricDto.setUsedCostUsage( metric.isUsedCostUsage() );

        return metricDto;
    }
}
