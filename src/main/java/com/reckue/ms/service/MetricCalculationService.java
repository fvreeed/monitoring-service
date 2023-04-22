package com.reckue.ms.service;

import java.util.List;

public interface MetricCalculationService {

    double sce(double totalOfPrimaryServicesOfServer, double totalOfAllServicesOfServer);

    double dcce(List<Integer> totalOfAllServicesOfAllServers, List<Integer> totalOfPrimaryServicesOfAllServers);
}
