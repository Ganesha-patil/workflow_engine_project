
package com.example.workflow.controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.workflow.service.WorkflowService;
import com.example.workflow.entity.*;

@RestController
@RequestMapping("/requests")
public class WorkflowController {
 private final WorkflowService service;
 public WorkflowController(WorkflowService s){service=s;}

 @PostMapping
 public Request create(@RequestParam String type,@RequestParam String user){
  return service.createRequest(type,user);
 }

 
 @PostMapping("/{id}/approve")
 public void approve(@PathVariable Long id,@RequestParam String user){
  service.approve(id,user);
 }

 @GetMapping("/history/{id}")
 public List<ApprovalHistory> history(@PathVariable Long id){
  return service.history(id);
 }
}
