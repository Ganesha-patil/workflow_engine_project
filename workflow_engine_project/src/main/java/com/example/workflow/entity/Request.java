
package com.example.workflow.entity;
import jakarta.persistence.*;
@Entity
public class Request {
 @Id @GeneratedValue
 private Long id;
 private String type;
 private String status;
 private String createdBy;
 public Long getId(){return id;}
 public String getType(){return type;}
 public void setType(String t){this.type=t;}
 public String getStatus(){return status;}
 public void setStatus(String s){this.status=s;}
 public String getCreatedBy(){return createdBy;}
 public void setCreatedBy(String c){this.createdBy=c;}
}
