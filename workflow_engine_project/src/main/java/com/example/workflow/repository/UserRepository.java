package com.example.workflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.workflow.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // Simple repository
}