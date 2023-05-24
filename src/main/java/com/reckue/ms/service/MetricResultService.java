package com.reckue.ms.service;

import com.reckue.ms.entity.MetricResult;

import java.util.List;
import java.util.UUID;

public interface MetricResultService {

    MetricResult create(MetricResult metricResult);

    MetricResult findById(UUID id);

    List<MetricResult> findByFilter(int limit, int offset);

    MetricResult updateById(MetricResult metricResult);

    void deleteById(UUID id);
}
