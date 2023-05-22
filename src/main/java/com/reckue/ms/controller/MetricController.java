package com.reckue.ms.controller;

import com.reckue.ms.entity.Metric;
import com.reckue.ms.model.MetricDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/metric")
public interface MetricController {

    @PostMapping
    MetricDto createMetric(@RequestBody MetricDto metricDto);

    @GetMapping("/{id}")
    Metric findMetricById(@PathVariable UUID id);

    @GetMapping("/filter")
    List<Metric> searchMetricByFilter(@RequestParam int limit, @RequestParam int offset);

    @PostMapping("/{id}")
    Metric updateMetricById(@RequestBody Metric metric, @PathVariable UUID id);

    @DeleteMapping("/{id}")
    void deleteMetricById(@PathVariable UUID id);
}

