package com.reckue.ms.controller;

import com.reckue.ms.entity.MetricResult;
import com.reckue.ms.model.MetricResultDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/metricResult")
public interface MetricResultController {

    @PostMapping
    MetricResultDto createMetric(@RequestBody MetricResultDto metricResultDto);

    @GetMapping("/{id}")
    MetricResult findMetricResultById(@PathVariable UUID id);

    @GetMapping("/filter")
    List<MetricResult> searchCalculatedMetricByFilter(@RequestParam int limit, @RequestParam int offset);

    @PostMapping("/{id}")
    MetricResult updateMetricResultById(@RequestBody MetricResult metricResult, @PathVariable UUID id);

    @DeleteMapping("/{id}")
    void deleteMetricResultById(@PathVariable UUID id);
}
