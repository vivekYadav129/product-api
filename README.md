# 📝 Blog API - Spring Boot & MongoDB

![Header](./assets/header.png)

A professional, secure, and scalable RESTful API built with **Spring Boot** and **MongoDB**. This project provides a robust backend for a blogging platform, featuring JWT-based authentication and full CRUD capabilities for blog posts.

## 🚀 Features

- **JWT Authentication**: Secure user registration and login with JSON Web Tokens.
- **Post Management**: Complete CRUD operations (Create, Read, Update, Delete) for blog posts.
- **MongoDB Integration**: Flexible data storage using MongoDB Atlas or local instance.
- **Security**: Custom security filters for token validation and request authorization.
- **Clean Architecture**: Organized into Controllers, Services, Repositories, and Models.

## 🛠️ Tech Stack

- **Framework**: Spring Boot
- **Language**: Java 17
- **Database**: MongoDB
- **Security**: Spring Security & JJWT (Java JWT)
- **Build Tool**: Maven
- **Lombok**: Reduced boilerplate code

## 📂 Project Structure

```text
blogapi/
├── src/
│   ├── main/
│   │   ├── java/com/weekfour/blogapi/
│   │   │   ├── config/       # Security and App configurations
│   │   │   ├── controller/   # REST API Controllers
│   │   │   ├── model/        # Data Models (User, Post)
│   │   │   ├── repository/   # MongoDB Repositories
│   │   │   ├── security/     # JWT Filters and Utils
│   │   │   └── service/      # Business Logic
│   │   └── resources/
│   │       └── application.properties
└── pom.xml
```

## 🚥 API Endpoints

### Authentication
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/auth/register` | Register a new user |
| `POST` | `/auth/login` | Login and receive JWT token |

### Posts
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/posts` | Retrieve all posts |
| `GET` | `/posts/{id}` | Retrieve a specific post |
| `POST` | `/posts` | Create a new post |
| `PUT` | `/posts/{id}` | Update an existing post |
| `DELETE` | `/posts/{id}` | Delete a post |

## ⚙️ Setup & Installation

### Prerequisites
- **Java 17** or higher
- **Maven** installed
- **MongoDB** (Local or Atlas)

### Steps
1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd blogapi
   ```

2. **Configure MongoDB**:
   Update `src/main/resources/application.properties` with your MongoDB connection string (if needed).
   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/blogdb
   ```

3. **Build the project**:
   ```bash
   mvn clean install
   ```

4. **Run the application**:
   ```bash
   mvn spring-boot:run
   ```

The server will start at `http://localhost:8080`.

## 🔒 Security Note
The project currently has a temporary security bypass for development. Ensure to restrict `.anyRequest().authenticated()` in `SecurityConfig.java` for production use.

## 🤝 Contributing
Contributions are welcome! Please feel free to submit a Pull Request.

## 📝 License
This project is licensed under the MIT License.
