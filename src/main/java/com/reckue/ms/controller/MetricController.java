package com.reckue.ms.controller;

import com.reckue.ms.entity.Metric;
import com.reckue.ms.model.MetricDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/metric")
public interface MetricController {

    @PostMapping
    ResponseEntity<MetricDto> createMetric(@RequestBody MetricDto metricDto);

    @GetMapping("/{id}")
    MetricDto findMetricById(@PathVariable UUID id);

    @GetMapping("/filter")
    List<Metric> searchMetricByFilter(@RequestParam int limit, @RequestParam int offset);

    @PostMapping("/{id}")
    MetricDto updateMetricById(@RequestBody MetricDto metricDto, @PathVariable UUID id);

    @DeleteMapping("/{id}")
    ResponseEntity<Void> deleteMetricById(@PathVariable UUID id);
}

