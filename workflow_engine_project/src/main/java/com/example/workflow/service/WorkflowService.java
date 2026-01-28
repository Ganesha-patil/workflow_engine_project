
package com.example.workflow.service;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import com.example.workflow.repository.*;
import com.example.workflow.entity.*;

@Service
public class WorkflowService {
 private final RequestRepository reqRepo;
 private final ApprovalStepRepository stepRepo;
 private final ApprovalHistoryRepository histRepo;

 public WorkflowService(RequestRepository r,ApprovalStepRepository s,ApprovalHistoryRepository h){
  reqRepo=r;
  stepRepo=s;
  histRepo=h;
 }

 @Transactional
 public Request createRequest(String type,String user){
  Request r=new Request();
  r.setType(type);
  r.setStatus("PENDING_1");
  r.setCreatedBy(user);
  return reqRepo.save(r);
 }

 // new changes for approveval
 @Transactional
 public void approve(Long id, String user) {
     Request r = reqRepo.findById(id)
         .orElseThrow(() -> new RuntimeException("Request not found with ID: " + id));
     
     // Simple approver check
     if (user == null || !user.toLowerCase().contains("approver")) {
         throw new RuntimeException("Only users with 'approver' in their name can approve requests. Your username: " + user);
     }
     
     histRepo.save(new ApprovalHistory(id, "APPROVED", user));
     r.setStatus("COMPLETED");
     reqRepo.save(r);
 }
 
 
// some issue in this need to change it later 
 public List<ApprovalHistory> history(Long id){
  return histRepo.findByRequestId(id);
 }
 
 
}
