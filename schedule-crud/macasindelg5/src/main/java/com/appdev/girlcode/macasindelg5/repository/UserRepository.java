package com.appdev.girlcode.macasindelg5.repository;

import com.appdev.girlcode.macasindelg5.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}