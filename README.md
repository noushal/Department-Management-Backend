# Employee & Department Management API

## Project Overview
This project is a **Spring Boot** application to manage **Employees** and **Departments** with a **PostgreSQL** database.  
It allows creating, listing, and querying employees by **department** or **joining month**.  
Swagger UI is integrated for **API documentation and testing**.

# Setup Instructions

## 1. Clone the Repository
```bash
git clone <repository-url>
cd Department-Management-Backend
```

## 2. Configure Database
- Install PostgreSQL
- Create a database:
```sql
CREATE DATABASE my_department;
```
- Update `application.properties`:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/my_department
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>
```

## 3. Run the Project
- Run using the command line:
```bash
mvn spring-boot:run
```
- **OR**  
  In your IDE, right-click on the main class named `DepartmentManagementApiApplication` and select `Run`.

## 4. Access Swagger UI
- Open your browser:
```
http://localhost:8090/swagger-ui/index.html#/
```
