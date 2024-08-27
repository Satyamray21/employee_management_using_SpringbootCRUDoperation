# employee_management_using_SpringbootCRUDoperation
This project is a simple employee management system implemented using Java with Spring Boot.
# Employee Management System

## Description

This project is a simple employee management system implemented using Java with Spring Boot. It provides CRUD operations for managing employee records, including creating, reading, updating, and deleting employee information.

## Features

- **Create Employee**: Add a new employee record to the system.
- **Find Employee by ID**: Retrieve an employee's details using their unique ID.
- **Find All Employees**: Retrieve a list of all employee records.
- **Update Employee Details**: Modify the details of an existing employee.
- **Delete Employee by ID**: Remove an employee record from the system using their ID.

## Technologies Used

- Java
- Spring Boot
- JPA (Java Persistence API)
- Hibernate
- Maven

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- IDE (e.g., IntelliJ IDEA, Eclipse)



### API Endpoints

- **Create Employee**
  - `POST /employees`
  - Request Body: `EmployeeDto`

- **Find Employee by ID**
  - `GET /employees/{id}`
  - Path Variable: `id`

- **Find All Employees**
  - `GET /employees`

- **Update Employee Details**
  - `PUT /employees/{id}`
  - Path Variable: `id`
  - Request Body: `EmployeeDto`

- **Delete Employee by ID**
  - `DELETE /employees/{id}`
  - Path Variable: `id`


