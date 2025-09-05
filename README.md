📝 Todo Web Application

A simple Todo Web Application built using Spring Boot, following the MVC pattern. This project demonstrates how to create a CRUD-based web app with Spring Data JPA, Thymeleaf (or REST endpoints), and H2/MySQL as the database.

📌 Features

Add new todo tasks

View all tasks

Update task details (edit name, mark as complete/incomplete)

Delete tasks

Persistent storage using Spring Data JPA

🏗️ Project Structure
src/main/java/com/example/todo
│
├── TodoListWebAppApplication.java   # Main entry point (Spring Boot application)
├── controller/
│   └── TodoController.java          # Handles web requests (REST/MVC endpoints)
├── service/
│   └── TodoService.java             # Business logic for managing todos
├── repository/
│   └── TodoRepository.java          # Interface for DB operations (extends JpaRepository)
└── model/
    └── Todo.java                    # Entity class (represents Todo task)

⚙️ Tech Stack

Java 17+

Spring Boot 3+

Spring Data JPA

H2 / MySQL (configurable database)

Thymeleaf / REST API (depending on frontend choice)

🚀 Getting Started
Prerequisites

Java 17+ installed

Maven installed
