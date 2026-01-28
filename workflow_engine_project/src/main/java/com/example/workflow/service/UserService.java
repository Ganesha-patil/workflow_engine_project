package com.example.workflow.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.workflow.entity.User;
import com.example.workflow.repository.UserRepository;
import jakarta.annotation.PostConstruct;

@Service
public class UserService {
    
    private final UserRepository userRepository;
    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @PostConstruct  // This runs ONCE when app starts
    @Transactional
    public void initUsers() {
        // Check if users already exist
        if (userRepository.count() == 0) {
            System.out.println("📝 Creating initial users...");
            
            // Create ADMIN user
            User admin = new User();
            admin.setUsername("admin");
            admin.setPassword("admin123");
            admin.setRole("ADMIN");
            admin.setName("admin");
            userRepository.save(admin);
            
            // Create APPROVER user
            User approver = new User();
            approver.setUsername("approver");
            approver.setPassword("approver123");
            approver.setRole("APPROVER");
            approver.setName("manager");
            userRepository.save(approver);
            
            System.out.println("✅ Created 2 users: admin and approver");
        }
    }
}