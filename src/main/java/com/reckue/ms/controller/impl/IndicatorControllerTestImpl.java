package com.reckue.ms.controller.impl;

import com.reckue.ms.controller.IndicatorControllerTest;
import com.reckue.ms.converter.IndicatorConverter;
import com.reckue.ms.entity.Indicator;
import com.reckue.ms.model.IndicatorDto;
import com.reckue.ms.service.IndicatorService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class IndicatorControllerTestImpl implements IndicatorControllerTest {

    @Autowired
    private IndicatorService indicatorService;

    @Autowired
    private IndicatorConverter indicatorConverter;

    @Override
    public Indicator add(IndicatorDto indicatorDto) {
        return indicatorService.add(indicatorDto);
    }

    @Override
    public Indicator findById(UUID id)  {
        return indicatorService.findById(id);
    }

    @Override
    public List<Indicator> find(long limit, long offset) {
        return indicatorService.find(limit, offset);
    }

    @Override
    public List<Indicator> search(long limit, long offset, LocalDateTime start, LocalDateTime end) {
        return indicatorService.findAllByDate(limit, offset, start, end);
    }

    @Override
    public void deleteById(UUID id)  {
        indicatorService.deleteById(id);
    }
}
