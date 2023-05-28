package com.reckue.ms.controller.impl;

import com.reckue.ms.controller.MetricController;
import com.reckue.ms.converter.MetricConverter;
import com.reckue.ms.entity.Metric;
import com.reckue.ms.model.MetricDto;
import com.reckue.ms.service.MetricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public class MetricControllerImpl implements MetricController {

    @Autowired
    private MetricService metricService;

    @Autowired
    private MetricConverter metricConverter;


    @Override
    public ResponseEntity<MetricDto> createMetric(MetricDto metricDto) {
        Metric metric = metricService.create(
                metricConverter.dtoToEntity(metricDto)
        );
        return new ResponseEntity<>(metricConverter.entityToDto(metric), HttpStatus.CREATED);
    }

    @Override
    public MetricDto findMetricById(UUID id) {
        return metricConverter.entityToDto(metricService.findById(id));
    }

    @Override
    public List<Metric> searchMetricByFilter(int limit, int offset) {
        return metricService.findByParameters(limit, offset);
    }

    @Override
    public MetricDto updateMetricById(MetricDto metricDto, UUID id) {
        metricDto.setId(id);
        Metric metric = metricService.updateById(
                metricConverter.dtoToEntity(metricDto)
        );
        return metricConverter.entityToDto(metric);
    }

    @Override
    public ResponseEntity<Void> deleteMetricById(UUID id) {
        metricService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
