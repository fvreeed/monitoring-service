package com.reckue.ms.model;

import lombok.Data;

import java.util.List;

@Data
public class DcceDto {

    private List<Integer> totalOfPrimaryServicesOfAllServers;

    private List<Integer> totalOfAllServicesOfAllServers;
}
