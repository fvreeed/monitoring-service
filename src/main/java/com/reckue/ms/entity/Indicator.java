package com.reckue.ms.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "indicators")
public class Indicator {

    @Id
    private UUID id;

    private String name;

    private double value;

    private IndicatorType type;

    @Embedded
    private Audit audit;
}
