package com.reckue.ms.service;

import com.reckue.ms.entity.Metric;

import java.util.List;
import java.util.UUID;

public interface MetricService {

    Metric create(Metric metric);

    Metric findById(UUID id);

    List<Metric> filteredSearch(int limit, int offset);

    Metric updateById(Metric metric, UUID id);

    void deleteById(UUID id);
}
