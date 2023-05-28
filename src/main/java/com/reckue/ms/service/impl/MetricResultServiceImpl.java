package com.reckue.ms.service.impl;

import com.reckue.ms.entity.MetricResult;
import com.reckue.ms.handler.exception.metricResult.MetricResultNotFoundException;
import com.reckue.ms.repository.MetricResultRepository;
import com.reckue.ms.service.MetricResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MetricResultServiceImpl implements MetricResultService {

    private final MetricResultRepository metricResultRepository;

    @Autowired
    public MetricResultServiceImpl(MetricResultRepository metricResultRepository) {
        this.metricResultRepository = metricResultRepository;
    }

    @Override
    public MetricResult create(MetricResult metricResult) {
        metricResult.setId(UUID.randomUUID());
        return metricResultRepository.save(metricResult);
    }

    @Override
    public MetricResult findById(UUID id) {
        return metricResultRepository.findById(id)
                .orElseThrow(() -> new MetricResultNotFoundException(id));
    }

    @Override
    public List<MetricResult> findByFilter(int limit, int offset) {
        Pageable pageable = new PageRequest(offset, limit, Sort.unsorted());
        return metricResultRepository.findAll(pageable).getContent();
    }

    @Override
    public MetricResult updateById(MetricResult metricResult) {
        if (!metricResultRepository.existsById(metricResult.getId())) {
            throw new MetricResultNotFoundException(metricResult.getId());
        }
        metricResult.setId(metricResult.getId());
        return metricResultRepository.save(metricResult);
    }

    @Override
    public void deleteById(UUID id) {
        if (!metricResultRepository.existsById(id)) {
            throw new MetricResultNotFoundException(id);
        }
        metricResultRepository.deleteById(id);
    }
}
