package com.reckue.ms.repository;

import com.reckue.ms.entity.CalculationError;
import com.reckue.ms.entity.MetricResult;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CalculationErrorRepository extends CrudRepository<CalculationError, UUID> {

    CalculationError findByMetricResult(MetricResult metricResult);
}
