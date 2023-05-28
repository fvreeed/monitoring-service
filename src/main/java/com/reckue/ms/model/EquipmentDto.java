package com.reckue.ms.model;

import com.reckue.ms.entity.Audit;
import lombok.Data;

import java.util.UUID;

@Data
public class EquipmentDto extends AuditDto {

    private UUID id;

    private String type;

    private String name;

    private String description;

    private Audit audit;
}
