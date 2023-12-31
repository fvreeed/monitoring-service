package com.reckue.ms.controller;

import com.reckue.ms.entity.Indicator;
import com.reckue.ms.model.IndicatorDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/indicator")
public interface IndicatorController {

    @PostMapping
    ResponseEntity<IndicatorDto> createIndicator(@RequestBody IndicatorDto indicatorDto);

    @GetMapping("/{id}")
    IndicatorDto findIndicatorById(@PathVariable UUID id);

    @GetMapping
    List<Indicator> findIndicatorByFilter(@RequestParam long limit, @RequestParam long offset);

    @GetMapping("/filter")
    List<Indicator> searchIndicatorByDate(
            @RequestParam long limit,
            @RequestParam long offset,
            @RequestParam LocalDateTime start,
            @RequestParam LocalDateTime end
    );

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteIndicatorById(@PathVariable UUID id);
}

