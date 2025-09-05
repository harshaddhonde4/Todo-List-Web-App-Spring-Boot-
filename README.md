# 📝 Todo Web Application

![Java](https://img.shields.io/badge/Java-17-orange?logo=java)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen?logo=springboot)
![Build](https://img.shields.io/badge/Build-Maven-blue?logo=apachemaven)
![Database](https://img.shields.io/badge/Database-H2%2FMySQL-lightgrey?logo=mysql)

A simple **CRUD-based Todo Web Application** built with **Spring Boot** 🚀.
This project demonstrates **REST API design**, **Spring Data JPA**, and **MVC architecture**.

---

## ✨ Features

✅ Add new todo tasks
✅ View all tasks
✅ Update tasks (edit, mark as complete/incomplete)
✅ Delete tasks
✅ Persistent storage with JPA

---

## 🏗️ Project Structure

```bash
src/main/java/com/example/todo
│
├── TodoListWebAppApplication.java   # Main entry point
├── controller/
│   └── TodoController.java          # Handles web requests (API endpoints)
├── service/
│   └── TodoService.java             # Business logic layer
├── repository/
│   └── TodoRepository.java          # Database operations
└── model/
    └── Todo.java                    # Entity class
```

---

## ⚙️ Tech Stack

* ☕ **Java 17+**
* 🍃 **Spring Boot 3.x**
* 🗄 **Spring Data JPA**
* 💾 **H2 / MySQL** (configurable)
* 🎨 **Thymeleaf / REST API** (depending on frontend choice)

---

## 🚀 Getting Started

### Prerequisites

* Install [Java 17+](https://adoptium.net/)
* Install [Maven](https://maven.apache.org/)

### Run the App

```bash
# Clone repository
git clone https://github.com/your-harshaddhonde4/todo-webapp.git
cd todo-webapp

# Run the app
mvn spring-boot:run
```

🌍 Open in browser:

```text
http://localhost:8080
```

---

## 🔑 API Endpoints

| Method | Endpoint      | Description     |
| ------ | ------------- | --------------- |
| GET    | `/todos`      | Get all todos   |
| POST   | `/todos`      | Create new todo |
| PUT    | `/todos/{id}` | Update a todo   |
| DELETE | `/todos/{id}` | Delete a todo   |

📦 Example JSON:

```json
{
  "id": 1,
  "title": "Finish Spring Boot project",
  "completed": false
}
```

---

## 🎯 Learning Goals

📌 Understand **Spring Boot setup**
📌 Build **REST APIs** with CRUD operations
📌 Learn **Spring Data JPA** for persistence
📌 Apply **MVC architecture**

---

## 💡 Future Enhancements

* [ ] Add **user authentication** 🔑
* [ ] Add **due dates & priorities** 📅
* [ ] Create a **React/Angular frontend** 🎨

---


✨ *Made with ❤️ using Spring Boot*
