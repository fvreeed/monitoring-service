package com.reckue.ms.controller;

import com.reckue.ms.entity.Indicator;
import com.reckue.ms.model.IndicatorDto;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/indicator")
public interface IndicatorControllerTest {



    @PostMapping
    Indicator add(@RequestBody IndicatorDto indicatorDto);

    @GetMapping("/{id}")
    Indicator findById(@PathVariable UUID id);

    @GetMapping
    List<Indicator> find(@RequestParam long limit, @RequestParam long offset);

    @GetMapping("/filter")
    List<Indicator> search(
            @RequestParam long limit,
            @RequestParam long offset,
            @RequestParam LocalDateTime start,
            @RequestParam LocalDateTime end
    );

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable UUID id);
}

