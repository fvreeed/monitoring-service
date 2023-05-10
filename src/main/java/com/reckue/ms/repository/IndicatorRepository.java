package com.reckue.ms.repository;

import com.reckue.ms.entity.Indicator;
import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.UUID;

@Repository
public interface IndicatorRepository extends CrudRepository<Indicator, UUID> {

    Page<Indicator> findAll(@NonNull Pageable pageable);

    Page<Indicator> findByAudit_CreatedAtBetween(@NonNull Pageable pageable, LocalDateTime start, LocalDateTime end);
}
