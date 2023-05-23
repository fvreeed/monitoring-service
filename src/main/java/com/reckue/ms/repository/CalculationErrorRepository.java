package com.reckue.ms.repository;

import com.reckue.ms.entity.CalculationError;
import com.reckue.ms.entity.Indicator;
import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDateTime;
import java.util.UUID;

public interface CalculationErrorRepository extends CrudRepository<CalculationError, UUID> {

    Page<CalculationError> findAll(@NonNull Pageable pageable);

    Page<CalculationError> findByAudit_CreatedAtBetween(@NonNull Pageable pageable, LocalDateTime start, LocalDateTime end);
}
