# 🌱 CarbonTracker

**CarbonTracker** is a secure, scalable Spring Boot backend application designed to track and manage user data related to carbon footprints and sustainable practices. It provides RESTful APIs with JWT-based authentication, clean architecture, and modular code for easy maintenance and integration.

---

## 🚀 Features

- 🔐 **JWT Authentication** – Secure login and access token generation
- 👥 **User Management** – Create, update, delete, and retrieve users
- 💡 **Modular Codebase** – Organized by config, controller, service, repository, and model layers
- ⚠️ **Global Exception Handling** – Consistent and clean error responses
- 🔄 **Spring Data JPA** – Easy integration with databases (H2/MySQL)

---

## 🛠️ Technologies Used

- **Java **
- **Spring Boot**
- **Spring Security**
- **JWT (JSON Web Tokens)**
- **Spring Data JPA**
- **Maven**

---

## 📁 Project Structure
carbontracker/
├── config/ # Spring Security configuration
├── controller/ # REST APIs (Auth, User)
├── entity/ # JPA entities (User)
├── exception/ # Custom exception classes
├── model/ # DTOs (AuthRequest, AuthResponse)
├── repository/ # JPA repository interfaces
├── security/ # JWT filters and utilities
├── service/
│ ├── impl/ # Service implementations
│ └── # Service interfaces
└── resources/
└── application.properties
---

## 🧪 Running the Application

Make sure you have **Java 17** and **Maven** installed.

```bash
# Clone the repository
git clone https://github.com/pallavi1828/carbontracker.git
cd carbontracker

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
By default, the backend runs on:
📍 http://localhost:8080
