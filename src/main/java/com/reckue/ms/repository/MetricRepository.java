package com.reckue.ms.repository;

import com.reckue.ms.entity.Metric;
import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface MetricRepository extends JpaRepository<Metric, UUID> {

    Page<Metric> findAll(@NonNull Pageable pageable);
}
