package com.reckue.ms.service.impl;

import com.reckue.ms.service.MetricCalculationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetricCalculationServiceImpl implements MetricCalculationService {

    @Override
    public double sce(double totalOfPrimaryServicesOfServer, double totalOfAllServicesOfServer) {
        if (totalOfAllServicesOfServer <= 0) {
            throw new RuntimeException("There is not working services");
        }
        return totalOfPrimaryServicesOfServer / totalOfAllServicesOfServer;
    }

    @Override
    public double dcce(List<Integer> totalOfAllServicesOfAllServers, List<Integer> totalOfPrimaryServicesOfAllServers) {
        double dcce = 0;
        for (int i = 0; i < totalOfAllServicesOfAllServers.size(); i++) {
            dcce += (double) totalOfPrimaryServicesOfAllServers.get(i) / totalOfAllServicesOfAllServers.get(i);
        }
        return dcce;
    }
}
