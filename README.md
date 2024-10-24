Step 1 **Home Page**:
![1](https://github.com/user-attachments/assets/3ddca19d-2e9f-4f96-b43a-c0f5f01b0197)


Step 2 **Addition of Employee in the List**:
![2](https://github.com/user-attachments/assets/03e43723-1c1a-4482-b478-7ecf06ce8c68)

Step 3 **View of the Employee**:
![4](https://github.com/user-attachments/assets/8a1c1de6-53b6-4b6f-8c47-16baa5116ee3)

Step 4 **Updation of Employee Details**:
![3](https://github.com/user-attachments/assets/ddda7523-c87c-4187-8ac5-afd8fc7e7d0d)

Step 5 **Updated Details**:
![5](https://github.com/user-attachments/assets/7eb72b21-bafa-4dc8-a4b3-055d9bfee3c6)


1. **Angular (Frontend)**:
   - Contains files like `angular.json`, `package.json`, and TypeScript configuration files (`tsconfig.app.json`, etc.).
   - The `src` directory holds the main source code for the frontend.

2. **Spring Boot (Backend)**:
   - Includes files like `pom.xml` (for Maven configuration), and the `src` directory for backend code.

Based on this, here is a sample README for your project:

---

# Employee Management System

This is a full-stack Employee Management System built using **Angular** for the frontend and **Spring Boot** for the backend. The project demonstrates CRUD (Create, Read, Update, Delete) operations for managing employee records. It follows a modular structure where the Angular application serves the user interface and the Spring Boot application handles business logic and database interactions.

## Features
- Employee management: Add, update, delete, and view employee details.
- RESTful APIs for communication between the frontend and backend.
- Responsive design for a smooth user experience.
- Data persistence using a database connected to the backend (Spring Boot).

## Technologies Used
### Frontend:
- **Angular**: Handles the client-side logic and user interface.
- **HTML/CSS**: For designing the UI.
- **TypeScript**: The main programming language for the Angular framework.

### Backend:
- **Spring Boot**: Provides the API and handles business logic.
- **Maven**: For dependency management in the Spring Boot application.
- **RESTful APIs**: For backend and frontend communication.
- **JPA/Hibernate**: For data persistence with the database.

## Folder Structure
### Angular (Frontend):
```
Angular/
│-- src/                   # Contains the frontend source code
│-- package.json           # Node package manager dependencies
│-- angular.json           # Angular configuration file
│-- tsconfig.json          # TypeScript configuration
│-- ... other Angular-related config files
```

### Spring Boot (Backend):
```
spring_Boot/
│-- src/                   # Contains the backend source code (Java, controllers, services)
│-- pom.xml                # Maven configuration and dependencies
│-- mvnw, mvnw.cmd         # Maven wrapper scripts for Linux/Windows
│-- ... other Spring Boot configuration files
```

## Getting Started

### Prerequisites
- **Node.js** (for Angular development)
- **Java** (for running the Spring Boot application)
- **Maven** (for managing Spring Boot dependencies)
- **MySQL/PostgreSQL** or any preferred relational database

### Installation

1. **Backend (Spring Boot)**:
   - Navigate to the `spring_Boot` folder.
   - Run `mvn install` to download dependencies.
   - Run `mvn spring-boot:run` to start the Spring Boot server.
   
2. **Frontend (Angular)**:
   - Navigate to the `Angular` folder.
   - Run `npm install` to download dependencies.
   - Run `ng serve` to start the Angular development server.

### Running the Application
- After starting both the frontend and backend servers, open a browser and navigate to `http://localhost:4200` to interact with the Employee Management System.

## Future Improvements
- Implement authentication and authorization.
- Enhance the UI with modern design principles.
- Add unit and integration testing.

---
