package com.reckue.ms.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Embeddable
public class Equipment {

    @Id
    private UUID id;

    private String name;

    private String description;

    private String algorithm;

    @Embedded
    private Audit audit;
}
