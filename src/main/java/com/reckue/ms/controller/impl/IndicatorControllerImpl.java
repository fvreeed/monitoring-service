package com.reckue.ms.controller.impl;

import com.reckue.ms.controller.IndicatorController;
import com.reckue.ms.converter.IndicatorConverter;
import com.reckue.ms.entity.Indicator;
import com.reckue.ms.model.IndicatorDto;
import com.reckue.ms.service.IndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class IndicatorControllerImpl implements IndicatorController {

    @Autowired
    private IndicatorService indicatorService;

    @Autowired
    private IndicatorConverter indicatorConverter;

    @Override
    public ResponseEntity<IndicatorDto> createIndicator(IndicatorDto indicatorDto) {
        Indicator indicator = indicatorService.create(
                indicatorConverter.dtoToEntity(indicatorDto)
        );
        return new ResponseEntity<>(indicatorConverter.entityToDto(indicator), HttpStatus.CREATED);
    }

    @Override
    public IndicatorDto findIndicatorById(UUID id) {
        return indicatorConverter.entityToDto(indicatorService.findById(id));
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
    public ResponseEntity<Void> deleteIndicatorById(UUID id) {
        indicatorService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
