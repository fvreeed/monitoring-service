package com.reckue.ms.controller;

import com.reckue.ms.entity.MetricResult;
import com.reckue.ms.model.MetricResultDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/metricResult")
public interface MetricResultController {

    @PostMapping
    ResponseEntity<MetricResultDto> createMetric(@RequestBody MetricResultDto metricResultDto);

    @GetMapping("/{id}")
    MetricResultDto findMetricResultById(@PathVariable UUID id);

    @GetMapping("/filter")
    List<MetricResult> searchCalculatedMetricByFilter(@RequestParam int limit, @RequestParam int offset);

    @PostMapping("/{id}")
    MetricResultDto updateMetricResultById(@RequestBody MetricResultDto metricResultDto, @PathVariable UUID id);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteMetricResultById(@PathVariable UUID id);
}
