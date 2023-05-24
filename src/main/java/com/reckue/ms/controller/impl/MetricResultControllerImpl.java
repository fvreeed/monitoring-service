package com.reckue.ms.controller.impl;

import com.reckue.ms.controller.MetricResultController;
import com.reckue.ms.converter.MetricResultConverter;
import com.reckue.ms.entity.MetricResult;
import com.reckue.ms.model.MetricResultDto;
import com.reckue.ms.service.MetricResultService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class MetricResultControllerImpl implements MetricResultController {

    @Autowired
    private MetricResultConverter metricResultConverter;

    @Autowired
    private MetricResultService metricResultService;

    @Override
    public MetricResultDto createMetric(MetricResultDto metricResultDto) {
        MetricResult metricResult = metricResultService.create(
                metricResultConverter.dtoToEntity(metricResultDto)
        );
        return metricResultConverter.entityToDto(metricResult);
    }

    @Override
    public MetricResult findMetricResultById(UUID id) {
        return metricResultService.findById(id);
    }

    @Override
    public List<MetricResult> searchCalculatedMetricByFilter(int limit, int offset) {
        return metricResultService.findByFilter(limit, offset);
    }

    @Override
    public MetricResult updateMetricResultById(MetricResult metricResult, UUID id) {
        metricResult.setId(id);
        return metricResultService.updateById(metricResult);
    }

    @Override
    public void deleteMetricResultById(UUID id) {
        metricResultService.deleteById(id);
    }
}
