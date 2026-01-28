
package com.example.workflow.entity;
import jakarta.persistence.*;
@Entity
public class ApprovalStep {
 @Id @GeneratedValue
 private Long id;
 private String requestType;
 private int stepOrder;
 private String role;
 public Long getId(){return id;}
 public String getRequestType(){return requestType;}
 public int getStepOrder(){return stepOrder;}
 public String getRole(){return role;}
}
