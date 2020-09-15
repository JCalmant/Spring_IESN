package com.spring.henallux.securityProject.dataAccess.repository;

import com.spring.henallux.securityProject.dataAccess.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
    UserEntity findByUsername (String userName);
}
