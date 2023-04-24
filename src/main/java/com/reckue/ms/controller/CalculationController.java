package com.reckue.ms.controller;


import com.reckue.ms.model.DcceDto;
import com.reckue.ms.model.SceDto;
import com.reckue.ms.service.MetricCalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculation")
public class CalculationController {

    @Autowired
    private MetricCalculationService metricCalculationService;

    @PostMapping("/sce")
    double sce(@RequestBody SceDto sce) {
        return metricCalculationService.sce(
                sce.getTotalOfPrimaryServicesOfServer(),
                sce.getTotalOfAllServicesOfServer()
        );
    }

    @PostMapping("/dcce")
    double dcce(@RequestBody DcceDto dcce) {
        return metricCalculationService.dcce(
                dcce.getTotalOfAllServicesOfAllServers(),
                dcce.getTotalOfPrimaryServicesOfAllServers()
        );
    }
}
