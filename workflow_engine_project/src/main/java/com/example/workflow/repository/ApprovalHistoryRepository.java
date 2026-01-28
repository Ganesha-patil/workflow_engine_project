
package com.example.workflow.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.example.workflow.entity.ApprovalHistory;
public interface ApprovalHistoryRepository extends JpaRepository<ApprovalHistory,Long>{
 List<ApprovalHistory> findByRequestId(Long id);
}
