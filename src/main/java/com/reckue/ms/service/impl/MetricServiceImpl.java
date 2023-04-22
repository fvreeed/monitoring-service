package com.reckue.ms.service.impl;

import com.reckue.ms.entity.Metric;
import com.reckue.ms.repository.MetricRepository;
import com.reckue.ms.service.MetricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class MetricServiceImpl implements MetricService {

    private final MetricRepository metricRepository;

    @Autowired
    public MetricServiceImpl(MetricRepository metricRepository) {
        this.metricRepository = metricRepository;
    }

    @Override
    public Metric create(Metric metric) {
        metric.setId(UUID.randomUUID());
        return metricRepository.save(metric);
    }

    @Override
    public Metric findById(UUID id) {
        return metricRepository.findById(id)
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public List<Metric> filteredSearch(int limit, int offset) {
        Pageable pageable = new PageRequest(offset, limit, Sort.unsorted());
        return metricRepository.findAll(pageable).getContent();
    }

    @Override
    public Metric updateById(Metric metric, UUID id) {
        if (!metricRepository.existsById(id)) {
            throw new RuntimeException();
        }
        metric.setId(id);
        return metricRepository.save(metric);
    }

    @Override
    public void deleteById(UUID id) {
        if (!metricRepository.existsById(id)) {
            throw new RuntimeException();
        }
        metricRepository.deleteById(id);
    }
}
