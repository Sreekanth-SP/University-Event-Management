# University-Event-Management
> This is a University Event Management System built using Spring Boot MVC framework. The system provides endpoints for managing events and students attending those events.
---
### Dependencies:
The following dependencies are used in this project:

* **Spring Web:** Provides support for building web applications using the Spring MVC framework.
* **Spring JPA:** Implements the Java Persistence API (JPA) for easy database access.
* **H2 Database:** An in-memory database used for development and testing purposes.
* **Lombok:** A Java library that helps to reduce boilerplate code by automatically generating getters, setters, constructors, etc.
* **Validation:** Provides support for validating input data.
* **Swagger:** Generates documentation for the RESTful APIs.
---
### Endpoints
The system exposes the following endpoints for managing events and students:

#### Event Endpoints:

* GET /events: Retrieve a list of all events.
* POST /event: Create a new event.
* PUT /event/{eventId}: Update an existing event.
* DELETE /events/{eventId}: Delete an event.

#### Student Endpoints

* GET /students: Retrieve a list of all students.
* GET /students/{studentId}: Retrieve details of a specific student.
* POST /students: Create a new student.
* PUT /student/id/{studentId}/department/{dept}: Update an existing student with a new department.
* DELETE /students/{studentId}: Delete a student.
---
### API Documentation
> The API documentation is generated using Swagger. To access the API documentation, follow these steps:

* Start the application by following the "Build and Run" instructions.
* Open a web browser and go to `http://localhost:8080/swagger-ui.html`.
* The Swagger UI will be displayed, showing the available endpoints and their details.
---
### Configuration
> The application configuration can be modified in the application.properties file located in the src/main/resources directory. We can customize the database settings, server port, and other properties according to our needs.
---
### Conclusion
> The University Event Management System is a Spring Boot MVC application that allows users to manage events and students attending those events. It utilizes various dependencies such as Spring Web, Spring JPA, H2 Database, Lombok, Validation, and Swagger to facilitate the development process
