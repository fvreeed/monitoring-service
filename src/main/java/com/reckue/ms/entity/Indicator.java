package com.reckue.ms.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "indicators")
public class Indicator {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "value")
    private double value;

    @Column(name = "type")
    private IndicatorType type;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "collectedAt", column = @Column(name = "collected_at")),
            @AttributeOverride(name = "createdAt", column = @Column(name = "created_at")),
            @AttributeOverride(name = "createdBy", column = @Column(name = "created_by")),
            @AttributeOverride(name = "modifiedAt", column = @Column(name = "modified_at")),
            @AttributeOverride(name = "modifiedBy", column = @Column(name = "modified_by")),
    })
    private IndicatorAudit audit;

    @ManyToOne
    @JoinColumn(name = "equipment_id", nullable = false)
    private Equipment equipment;
}
