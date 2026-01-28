
package com.example.workflow.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.workflow.entity.Request;
public interface RequestRepository extends JpaRepository<Request,Long>{}
