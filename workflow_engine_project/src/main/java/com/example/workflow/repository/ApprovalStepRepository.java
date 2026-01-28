
package com.example.workflow.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.example.workflow.entity.ApprovalStep;
public interface ApprovalStepRepository extends JpaRepository<ApprovalStep,Long>{
 List<ApprovalStep> findByRequestTypeOrderByStepOrder(String type);
}
