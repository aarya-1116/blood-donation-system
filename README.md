# 🩸 Blood Donation System

## About the Project

The **Blood Donation System** is a web-based application designed to help connect blood donors with people who need blood. The goal is to make it easier to find potential donors based on their blood group and manage blood requests efficiently.

This project is currently under development. The backend is being built using Java and Spring Boot, with MySQL for data storage.

## 🎯 Project Objectives

- Maintain donor information, including blood group and contact details.
- Allow users to create and manage blood requests.
- Help identify potential donors based on blood requirements.
- Provide a foundation for a more accessible and efficient blood donation platform.

## ⚙️ Technologies Used

- **Java** — Backend programming language
- **Spring Boot** — Backend application framework
- **Spring Web** — REST API development
- **Spring Data JPA** — Database operations
- **MySQL** — Database management
- **Maven** — Dependency management and build automation
- **HTML** — Frontend prototype

## ✨ Current Features

- Donor-related API endpoints
- Blood request API endpoints
- Donor and blood request data models
- Repository layer for database operations
- Initial sample data for development and testing
- MySQL database connectivity

*The available functionality is still being developed and may change as the project progresses.*

## 🗂️ Project Structure

```text
demo/
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── config/
│   │   │   ├── controller/
│   │   │   ├── entity/
│   │   │   ├── repository/
│   │   │   └── DemoApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## 🧪 Current Data and Limitations

**The project currently uses sample/seed data for development and testing.** This data is intended to demonstrate the application's functionality and is not a verified list of real blood donors or active blood requests.

The current dataset is temporary and will be expanded or replaced as the project develops. No real donor availability or actual blood inventory is guaranteed by the current prototype.

## 🚀 Future Scope

- Integrate verified, real-world donor data with appropriate consent.
- Enable donor registration and blood request submission through the frontend.
- Implement search and filtering by blood group and location.
- Add user authentication and role-based access for administrators.
- Introduce request status tracking and notifications.
- Improve data validation, security, and privacy protections.
- Test and deploy the application for wider accessibility.

## ▶️ Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Maven or the included Maven Wrapper
- MySQL Server
- Git

### Setup

1. Clone the repository:

   ```bash
   git clone https://github.com/aarya-1116/blood-donation-system.git
   ```

2. Open the backend project directory containing `pom.xml`.

3. Create the MySQL database:

   ```sql
   CREATE DATABASE blood_donation;
   ```

4. Configure the database connection in `src/main/resources/application.properties`. Set your database username and provide your password securely through an environment variable such as `DB_PASSWORD`.

5. Run the application on Windows:

   ```powershell
   .\mvnw.cmd spring-boot:run
   ```

6. Once started successfully, the backend will generally be available at:

   `http://localhost:8080`

   API endpoints depend on the controllers implemented in the project.

## 🔐 Data Privacy

Database credentials and other secrets should not be committed to version control. Real donor contact information must be handled securely and shared only with appropriate consent.

## 📌 Project Status

**In Development** — The backend and prototype are being developed incrementally. Real-world data integration, additional functionality, testing, and deployment are planned for future iterations.

## 🤝 Contributions

Contributions, suggestions, and feedback are welcome as the project evolves.

## 📄 License

A license has not yet been specified for this project.

