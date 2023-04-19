package com.reckue.ms.service.impl;

import com.reckue.ms.entity.Indicator;
import com.reckue.ms.handler.exception.indicator.IndicatorNotFoundException;
import com.reckue.ms.repository.IndicatorRepository;
import com.reckue.ms.service.IndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class IndicatorServiceImpl implements IndicatorService {

    private final IndicatorRepository indicatorRepository;

    @Autowired
    public IndicatorServiceImpl(IndicatorRepository indicatorRepository) {
        this.indicatorRepository = indicatorRepository;
    }

    @Override
    public Indicator add(Indicator indicator) {
        indicator.setId(UUID.randomUUID());
        return indicatorRepository.save(indicator);
    }

    @Override
    public Indicator findById(UUID id) {
        return indicatorRepository.findById(id)
                .orElseThrow(() -> new IndicatorNotFoundException(id));
    }

    @Override
    public List<Indicator> find(long limit, long offset) {
        Pageable pageable = new PageRequest((int) offset, (int) limit, Sort.unsorted());
        return indicatorRepository.findAll(pageable).getContent();
    }

    @Override
    public void deleteById(UUID id) {
        if (!indicatorRepository.existsById(id)) {
            throw new IndicatorNotFoundException(id);
        }
        indicatorRepository.deleteById(id);
    }

    @Override
    public List<Indicator> findAllByDate(long limit, long offset, LocalDateTime start, LocalDateTime end) {
        Pageable pageable = new PageRequest((int) offset, (int) limit, Sort.unsorted());
        return indicatorRepository.findByAudit_CreatedDateBetween(pageable, start, end).getContent();
    }
}
