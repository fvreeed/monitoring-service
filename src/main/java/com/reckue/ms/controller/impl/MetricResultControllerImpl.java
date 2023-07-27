package com.reckue.ms.controller.impl;

import com.reckue.ms.controller.MetricResultController;
import com.reckue.ms.converter.MetricResultConverter;
import com.reckue.ms.entity.MetricResult;
import com.reckue.ms.model.MetricResultDto;
import com.reckue.ms.service.MetricResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.UUID;

public class MetricResultControllerImpl implements MetricResultController {

    @Autowired
    private MetricResultConverter metricResultConverter;

    @Autowired
    private MetricResultService metricResultService;

    @Override
    public ResponseEntity<MetricResultDto> createMetric(MetricResultDto metricResultDto) {
        MetricResult metricResult = metricResultService.create(
                metricResultConverter.dtoToEntity(metricResultDto)
        );
        return new ResponseEntity<>(metricResultConverter.entityToDto(metricResult), HttpStatus.CREATED);
    }

    @Override
    public MetricResultDto findMetricResultById(UUID id) {
        return metricResultConverter.entityToDto(metricResultService.findById(id));
    }

    @Override
    public List<MetricResult> searchCalculatedMetricByFilter(int limit, int offset) {
        return metricResultService.findByFilter(limit, offset);
    }

    @Override
    public MetricResultDto updateMetricResultById(MetricResultDto metricResultDto, UUID id) {
        metricResultDto.setId(id);
        MetricResult metricResult = metricResultService.updateById(
                metricResultConverter.dtoToEntity(metricResultDto)
        );
        return metricResultConverter.entityToDto(metricResult);
    }

    @Override
    public ResponseEntity<Void> deleteMetricResultById(UUID id) {
        metricResultService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
