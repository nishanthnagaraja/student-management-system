# 🎓 Student Management System

A beginner-friendly Spring Boot application to manage student data with full CRUD operations, RESTful APIs, and Swagger documentation. Ideal for learning backend development and showcasing on your resume.

## 🚀 Features

- Add, update, delete, and fetch student data
- REST API built with Spring Boot
- MySQL database integration using Spring Data JPA
- Swagger UI for API testing and documentation
- Clean layered architecture (Controller, Service, Repository)
- Optional: Spring Security for role-based access (can be added)

---

## 🛠️ Technologies Used

| Tech              | Description                    |
|-------------------|--------------------------------|
| Java 17           | Programming language           |
| Spring Boot 3.2.x | Main backend framework         |
| Spring Web        | RESTful web services           |
| Spring Data JPA   | ORM and database interaction   |
| MySQL             | Relational database            |
| Swagger / OpenAPI | API documentation and testing  |
| Maven             | Dependency management          |
| Lombok            | Boilerplate reduction          |

---

## 📁 Project Structure

src
├── main
│ ├── java
│ │ └── com.nishanth.studentmanagement
│ │ ├── controller
│ │ ├── model
│ │ ├── repository
│ │ ├── service
│ │ └── StudentManagementApplication.java
│ └── resources
│ ├── application.properties
│ └── ...
└── test

---

## 🔧 Setup Instructions

### ✅ Prerequisites

- Java 17+
- MySQL installed and running
- Maven installed
- IDE like IntelliJ or VS Code

### 📝 Steps

1.Clone the Repository 
   ```bash
   git clone https://github.com/nishanthnagaraja/student-management-system.git
   cd student-management-system

2.Create MySQL Database
    CREATE DATABASE student_db;
      
3.Update application.properties
    Set your DB username & password:
    spring.datasource.url=jdbc:mysql://localhost:3306/student_db
    spring.datasource.username=YOUR_USERNAME
    spring.datasource.password=YOUR_PASSWORD
    spring.jpa.hibernate.ddl-auto=update
    
    
 4.Run the App
    mvn spring-boot:run
5.Test APIs on Swagger UI
    Visit: http://localhost:8080/swagger-ui/index.html


📌 API Endpoints
| Method | Endpoint             | Description       |
| ------ | -------------------- | ----------------- |
| GET    | `/api/students`      | Get all students  |
| GET    | `/api/students/{id}` | Get student by ID |
| POST   | `/api/students`      | Add new student   |
| PUT    | `/api/students/{id}` | Update student    |
| DELETE | `/api/students/{id}` | Delete student    |


🧠 Learnings
Basics of Spring Boot and RESTful API
Using Spring Data JPA for CRUD operations
API documentation with Swagger
Layered backend architecture

🙌 Acknowledgements
Thanks to the Spring Boot community and open-source resources that helped in learning and building this project.




