package com.appdev.girlcode.macasindelg5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.appdev.girlcode.macasindelg5.entity.ScheduleEntity;

@Repository
public interface ScheduleRepository extends JpaRepository<ScheduleEntity, Integer> {

    // public ScheduleEntity findByScheduleName(String schedule_name);
}
