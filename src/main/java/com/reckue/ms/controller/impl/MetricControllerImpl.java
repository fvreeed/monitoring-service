package com.reckue.ms.controller.impl;

import com.reckue.ms.controller.MetricController;
import com.reckue.ms.converter.MetricConverter;
import com.reckue.ms.entity.Metric;
import com.reckue.ms.model.MetricDto;
import com.reckue.ms.service.MetricService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class MetricControllerImpl implements MetricController {

    @Autowired
    private MetricService metricService;

    @Autowired
    private MetricConverter metricConverter;


    @Override
    public MetricDto createMetric(MetricDto metricDto) {
        Metric metric = metricService.create(
                metricConverter.dtoToEntity(metricDto)
        );
        return metricConverter.entityToDto(metric);
    }

    @Override
    public Metric findMetricById(UUID id) {
        return metricService.findById(id);
    }

    @Override
    public List<Metric> searchMetricByFilter(int limit, int offset) {
        return metricService.findByParameters(limit, offset);
    }

    @Override
    public Metric updateMetricById(Metric metric, UUID id) {
        metric.setId(id);
        return metricService.updateById(metric);
    }

    @Override
    public void deleteMetricById(UUID id) {
        metricService.deleteById(id);
    }
}
