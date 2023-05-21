package com.reckue.ms.controller;

import com.reckue.ms.converter.IndicatorConverter;
import com.reckue.ms.entity.Indicator;
import com.reckue.ms.service.IndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/indicator")
public class IndicatorController {

    @Autowired
    private IndicatorService indicatorService;

//    @Autowired
//    private IndicatorConverter indicatorConverter;

    @PostMapping
    Indicator add(@RequestBody Indicator indicator) {
        return indicatorService.add(indicator);
    }

    @GetMapping("/{id}")
    Indicator findById(@PathVariable UUID id) {
        return indicatorService.findById(id);
    }

    @GetMapping
    List<Indicator> find(@RequestParam long limit, @RequestParam long offset) {
        return indicatorService.find(limit, offset);
    }

    @GetMapping("/filter")
    List<Indicator> search(
            @RequestParam long limit,
            @RequestParam long offset,
            @RequestParam LocalDateTime start,
            @RequestParam LocalDateTime end
    ) {
        return indicatorService.findAllByDate(limit, offset, start, end);
    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable UUID id) {
        indicatorService.deleteById(id);
    }
}
