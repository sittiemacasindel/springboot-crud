package com.appdev.girlcode.vargasg5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appdev.girlcode.vargasg5.entity.DataEntity;

@Repository
public interface DataRepository extends JpaRepository<DataEntity, Long> {
}
