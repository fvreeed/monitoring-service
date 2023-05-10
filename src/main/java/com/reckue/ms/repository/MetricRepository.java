package com.reckue.ms.repository;

import com.reckue.ms.entity.Metric;
import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MetricRepository extends CrudRepository<Metric, UUID> {

    Page<Metric> findAll(@NonNull Pageable pageable);

    boolean existsByName(String name);
}
