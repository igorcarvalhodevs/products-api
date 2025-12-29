# Products API

RESTful API developed in Java using Spring Boot for product management, implementing full CRUD operations with proper HTTP semantics, layered architecture, and robust validation.

---

## 🚀 Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Flyway
- H2 Database (local environment)
- Maven

---

## 📌 Implemented Features

- Create product
- Retrieve product by ID
- List all products
- Update product (partial update supported)
- Delete product
- Global exception handling
- Proper usage of HTTP status codes

---

## 📂 Project Structure

```text
src/main/java/com/igor/products_api
├── controller
├── dto
├── entity
├── exception
├── repository
├── service
└── ProductsApiApplication.java
```

---

## 🔗 Available Endpoints

### Create product
**POST** `/products`

```json
{
  "name": "Gaming Mouse",
  "description": "Mouse with 6 buttons and 12k DPI sensor",
  "priceCents": 19990
}
```
## Response:
- 201 Created

---

### Get product by ID
**GET** `/products/{id}`

## Responses:
- 200 OK
- 404 Not Found

---

### List products
**GET** `/products`

## Response:
- 200 OK

---

### Update product
**PUT** `/products/{id}`

```json
{
  "name": "Gaming Mouse Pro",
  "priceCents": 24990
}
```
## Responses:
- 200 OK
- 404 Not Found

---

### Delete product
**DELETE** `/products/{id}`

## Responses:
- 204 No Content
- 404 Not Found

---

### ⚙️ Running the Project
```bash
./mvnw spring-boot:run
```

---

### 🌐 API Base URL
```arduino
http://localhost:8080
```

---

### 🧪 Manual & Validation Tests

All endpoints were tested using Postman with real HTTP requests and automated assertions.

- Successful operations

- Validation errors (400 Bad Request)

- Resource not found scenarios (404 Not Found)

A Postman collection with automated validation tests is available in the repository:

```text
postman/products-api-validation-tests.postman_collection.json
```

---

### 📌 Notes

- The database schema is automatically initialized via Flyway migrations.

- This project is being evolved incrementally.

- The README will be further expanded at later stages of development.