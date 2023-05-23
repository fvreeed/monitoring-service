package com.reckue.ms.repository;

import com.reckue.ms.entity.Equipment;
import com.reckue.ms.entity.Indicator;
import lombok.NonNull;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EquipmentRepository extends CrudRepository<Equipment, UUID> {

    Page<Equipment> findAll(@NonNull Pageable pageable);
}