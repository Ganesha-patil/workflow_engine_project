# Configurable Approval Workflow Engine (Spring Boot)

## Overview
This project implements a configurable approval workflow engine where
requests go through dynamic approval steps based on request type and roles.

Admins define workflow steps.
Users create requests.
Approvers act based on role and step order.

The system automatically moves requests through steps and updates status.

---

## Architecture

Layered Architecture:

Controller → Repository  → Service → Database

Technologies:
- Java 22
- Spring Boot 3
- Spring Data JPA
- H2 In-Memory Database
- Maven

Entities:
- Request
- ApprovalStep
- ApprovalHistory
- user

---

## Workflow Example

For request type: LEAVE

approver approve request it then  → Status = COMPLETED

Flow:
User creates request → approver → Status = COMPLETED

---

## API Endpoints

Create Request  
POST /requests

Approve Request  
POST /requests/{id}/approve?role=MANAGER

Reject Request  
POST /requests/{id}/reject?role=HR

View All Requests  
GET /requests

---

## Running the Application

1. Install Java 17+  
2. Install Maven  
3. Clone repository



JDBC URL: jdbc:h2:mem:workflowdb 
Username: sa 
Password: (blank) 

---

## Database Configuration

H2 in-memory database is used for simplicity.
Tables are auto-created by Hibernate.


run as spring Boot App
open browser paste -> http://localhost:8080/
