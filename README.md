# Student Project - SpringBoot Version 3.2.1

## Overview

This is a simple Spring Boot project for educational purposes.

## Project Structure

- **Main Package:** `main`
  - `dao`: Data access objects and interfaces.
  - `service`: Business logic implementation.
  - `controller`: REST controllers for JSON data.
  - `entities`: JPA entities.

## Technology Stack

- **Spring Boot:** 3.2.1
- **JDK:** 17
- **Database:** MySQL
- **Build Tool:** Maven

## Components

### Controller Layer

- REST controllers using `@RestController` annotations.

### Service Layer

- Business logic implementation.

### DAO Layer

- Interface extending `CrudRepository` for basic database operations.

## Database Configuration

- MySQL is used as the database.

## Build and Run

To build and run the project, use:

```bash
mvn clean install
mvn spring-boot:run
