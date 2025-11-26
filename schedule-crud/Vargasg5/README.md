# Spring Boot CRUD Application with DTO Pattern

## Project Information
- **Author:** Vargas
- **Group Name:** GirlCode
- **Group ID:** com.appdevg5
- **Artifact ID:** girlcode
- **Project Name:** springboot-crud

## Description
This project implements CRUD (Create, Read, Update, Delete) functionality for ImportData entity using Spring Boot with DTO (Data Transfer Object) pattern.

## Features
- ✅ Complete CRUD operations
- ✅ DTO pattern implementation for data transfer
- ✅ RESTful API endpoints
- ✅ MySQL database integration
- ✅ JPA/Hibernate for ORM
- ✅ Proper separation of concerns (Controller, Service, Repository layers)

## Technologies Used
- Java 17
- Spring Boot 3.5.6
- Spring Data JPA
- MySQL
- Maven

## Project Structure
```
src/main/java/com/appdev/girlcode/vargasg5/
├── controller/
│   ├── DataController.java
│   └── ImportDataController.java
├── dto/
│   ├── ImportDataDTO.java
│   └── ImportDataResponseDTO.java
├── entity/
│   ├── DataEntity.java
│   └── ImportDataEntity.java
├── repository/
│   ├── DataRepository.java
│   └── ImportDataRepository.java
├── service/
│   ├── DataService.java
│   └── ImportDataService.java
└── Vargasg5Application.java
```

## API Endpoints

### ImportData CRUD Operations
- **POST** `/api/import-data` - Create new import data
- **GET** `/api/import-data` - Get all import data
- **GET** `/api/import-data/{id}` - Get import data by ID
- **PUT** `/api/import-data/{id}` - Update import data
- **DELETE** `/api/import-data/{id}` - Delete import data

### Data CRUD Operations
- **POST** `/api/data` - Create new data
- **GET** `/api/data` - Get all data
- **PUT** `/api/data/{id}` - Update data
- **DELETE** `/api/data/{id}` - Delete data

## Database Configuration
Update `application.properties` with your MySQL credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/data_db
spring.datasource.username=root
spring.datasource.password=123456
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## Running the Application
1. Clone the repository
2. Configure MySQL database
3. Update database credentials in `application.properties`
4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
   Or using Maven wrapper:
   ```bash
   ./mvnw spring-boot:run
   ```

## DTO Pattern Implementation
The project uses DTOs to separate the internal entity representation from the API contract:
- **ImportDataDTO** - Used for incoming requests (Create/Update)
- **ImportDataResponseDTO** - Used for responses (includes ID)

This pattern provides:
- Better security (no direct entity exposure)
- Flexibility in API design
- Cleaner separation of concerns
- Easier versioning and maintenance

## Sample Request Body (POST/PUT)
```json
{
  "number": 1,
  "offeringDept": "CS",
  "subject": "CS101",
  "subjectTitle": "Introduction to Computer Science",
  "creditedUnits": 3,
  "section": "A",
  "schedule": "MWF 9:00-10:00",
  "room": "Room 101",
  "totalSlots": 40,
  "enrolled": 35,
  "assessed": 30,
  "isClosed": "No"
}
```

## Sample Response
```json
{
  "dataId": 1,
  "number": 1,
  "offeringDept": "CS",
  "subject": "CS101",
  "subjectTitle": "Introduction to Computer Science",
  "creditedUnits": 3,
  "section": "A",
  "schedule": "MWF 9:00-10:00",
  "room": "Room 101",
  "totalSlots": 40,
  "enrolled": 35,
  "assessed": 30,
  "isClosed": "No"
}
```

## License
This project is created for educational purposes.
