package com.reckue.ms.service;

import com.reckue.ms.entity.Indicator;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public interface IndicatorService {

    Indicator add(Indicator indicator);

    Indicator findById(UUID id);

    List<Indicator> find(long limit, long offset);

    void deleteById(UUID id);

    List<Indicator> findAllByDate(long limit, long offset, LocalDateTime start, LocalDateTime end);
}
