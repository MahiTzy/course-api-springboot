### Backend Application (Java Spring Boot)

#### `README.md` for Backend

# Courses API Backend

This is a backend application built with Java Spring Boot that provides REST APIs for managing courses and course instances.

## Features

- **Create a new course**
- **List all courses**
- **View detailed information about a specific course**
- **Delete a specific course**
- **Create a new instance of a course delivery**
- **List course delivery instances by year and semester**
- **View details of a specific course instance**
- **Delete a specific course instance**

## API Endpoints

### Courses

- **POST /api/courses**
  - Create a new course
  - Request body: 
    ```json
    {
      "title": "Introduction to Computer Architecture",
      "code": "CS 102",
      "description": "This course provides a basic introduction to the architecture and algorithms of computer systems"
    }
    ```

- **GET /api/courses**
  - List all courses

- **GET /api/courses/{id}**
  - View detailed information about a course with ID `{id}`

- **DELETE /api/courses/{id}**
  - Delete a course with ID `{id}`

### Instances

- **POST /api/instances**
  - Create a new instance of a course delivery
  - Request body:
    ```json
    {
      "year": 2023,
      "semester": 1
      "course":{
        "id": 23
      }
    }
    ```

- **GET /api/instances/{year}/{semester}**
  - List courses delivered in year `{year}` and semester `{semester}`

- **GET /api/instances/{year}/{semester}/{courseId}**
  - View detailed information about an instance of a course with ID `{courseId}`, delivered in year `{year}` and semester `{semester}`

- **DELETE /api/instances/{year}/{semester}/{courseId}**
  - Delete an instance of a course with ID `{courseId}`, delivered in year `{year}` and semester `{semester}`

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/MahiTzy/course-api-springboot.git
   ```

2. Navigate to the project directory:
   ```bash
   cd course-api-springboot
   ```

3. Build the project using Maven:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## Docker

1. Build the Docker image:
   ```bash
   docker build -t yourdockerhubusername/courses-api-backend .
   ```

2. Push the Docker image to DockerHub:
   ```bash
   docker push yourdockerhubusername/courses-api-backend
   ```

## Dockerfile

The Dockerfile is located in the root directory of this repository.

## Docker-Compose

Refer to the `docker-compose.yaml` in the this repository to set up the full application stack.
