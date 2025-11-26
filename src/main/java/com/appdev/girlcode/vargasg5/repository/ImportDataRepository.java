package com.appdev.girlcode.vargasg5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appdev.girlcode.vargasg5.entity.ImportDataEntity;

@Repository
public interface ImportDataRepository extends JpaRepository<ImportDataEntity, Long> {
}
