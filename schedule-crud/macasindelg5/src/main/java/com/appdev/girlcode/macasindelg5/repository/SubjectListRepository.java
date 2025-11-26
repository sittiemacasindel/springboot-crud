package com.appdev.girlcode.macasindelg5.repository;

import com.appdev.girlcode.macasindelg5.entity.SubjectListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectListRepository extends JpaRepository<SubjectListEntity, Long> {
}
