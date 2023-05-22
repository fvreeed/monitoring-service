package com.reckue.ms.controller.impl;

import com.reckue.ms.controller.IndicatorController;
import com.reckue.ms.converter.IndicatorConverter;
import com.reckue.ms.entity.Indicator;
import com.reckue.ms.model.IndicatorDto;
import com.reckue.ms.service.IndicatorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class IndicatorControllerImpl implements IndicatorController {

    @Autowired
    private IndicatorService indicatorService;

    @Autowired
    private IndicatorConverter indicatorConverter;

    @Override
    public IndicatorDto createIndicator(IndicatorDto indicatorDto) {
        Indicator indicator = indicatorService.create(
                indicatorConverter.dtoToEntity(indicatorDto)
        );
        return indicatorConverter.entityToDto(indicator);
    }

    @Override
    public Indicator findIndicatorById(UUID id) {
        return indicatorService.findById(id);
    }

    @Override
    public List<Indicator> findIndicatorByFilter(long limit, long offset) {
        return indicatorService.findByParameters(limit, offset);
    }

    @Override
    public List<Indicator> searchIndicatorByDate(long limit, long offset, LocalDateTime start, LocalDateTime end) {
        return indicatorService.findAllByDate(limit, offset, start, end);
    }

    @Override
    public void deleteIndicatorById(UUID id) {
        indicatorService.deleteById(id);
    }
}
