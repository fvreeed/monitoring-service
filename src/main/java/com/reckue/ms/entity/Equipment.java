package com.reckue.ms.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
@Table(name = "equipments")
public class Equipment {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "type")
    private String type;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "createdAt", column = @Column(name = "created_at")),
            @AttributeOverride(name = "createdBy", column = @Column(name = "created_by")),
            @AttributeOverride(name = "modifiedAt", column = @Column(name = "modified_at")),
            @AttributeOverride(name = "modifiedBy", column = @Column(name = "modified_by")),
    })
    private Audit audit;

    @OneToMany(mappedBy = "equipment")
    private List<Indicator> indicators;

    @OneToMany(mappedBy = "equipment")
    private List<MetricResult> metricResults;
}
