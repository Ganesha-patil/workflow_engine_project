
package com.example.workflow.entity;
import jakarta.persistence.*;
import java.time.LocalDateTime;
@Entity
public class ApprovalHistory {
 @Id @GeneratedValue
 private Long id;
 private Long requestId;
 private String action;
 private String actionBy;
 private LocalDateTime actionAt;
 public ApprovalHistory(){}
 public ApprovalHistory(Long r,String a,String b){
  requestId=r;action=a;actionBy=b;actionAt=LocalDateTime.now();
 }
}
