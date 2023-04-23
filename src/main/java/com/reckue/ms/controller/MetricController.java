package com.reckue.ms.controller;

import com.reckue.ms.entity.Metric;
import com.reckue.ms.service.MetricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/metric")
public class MetricController {

    @Autowired
    private MetricService metricService;

    @PostMapping
    Metric create(@RequestBody Metric metric) {
        return metricService.create(metric);
    }

    @GetMapping("/{id}")
    Metric findById(@PathVariable UUID id) {
        return metricService.findById(id);
    }

    @GetMapping("/filter")
    List<Metric> filteredSearch(@RequestParam int limit, @RequestParam int offset) {
        return metricService.filteredSearch(limit, offset);
    }

    @PostMapping("/{id}")
    Metric updateById(@RequestBody Metric metric, @PathVariable UUID id) {
        metric.setId(id);
        return metricService.updateById(metric);
    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable UUID id) {
        metricService.deleteById(id);
    }
}
