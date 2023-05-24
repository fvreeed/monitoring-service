package com.reckue.ms.service.impl;

import com.reckue.ms.entity.MetricResult;
import com.reckue.ms.repository.MetricResultRepository;
import com.reckue.ms.service.MetricResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MetricResultServiceImpl implements MetricResultService {

    private MetricResultRepository metricResultRepository;

    @Autowired
    public MetricResultServiceImpl(MetricResultRepository metricResultRepository) {
        this.metricResultRepository = metricResultRepository;
    }

    @Override
    public MetricResult create(MetricResult metricResult) {
        return null;
    }

    @Override
    public MetricResult findById(UUID id) {
        return null;
    }

    @Override
    public List<MetricResult> findByFilter(int limit, int offset) {
        return null;
    }

    @Override
    public MetricResult updateById(MetricResult metricResult) {
        return null;
    }

    @Override
    public void deleteById(UUID id) {

    }
}
