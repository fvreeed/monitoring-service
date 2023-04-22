package com.reckue.ms.entity;

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.jmx.support.MetricType;

import java.util.UUID;

@Data
@Entity
public class Metric {

    @Id
    private UUID id;

    private String name;

    private MetricType type;

    @Embedded
    private Audit audit;
}
