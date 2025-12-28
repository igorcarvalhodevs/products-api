# Products API

API REST desenvolvida em Java com Spring Boot para gerenciamento de produtos, implementando operações CRUD completas com semântica HTTP adequada.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Flyway
- H2 Database (ambiente local)
- Maven

---

## 📌 Funcionalidades Implementadas

- Criar produto
- Buscar produto por ID
- Listar todos os produtos
- Atualizar produto (update parcial)
- Remover produto
- Tratamento global de erros
- Uso correto de status HTTP

---

## 📂 Estrutura do Projeto

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

## 🔗 Endpoints Disponíveis

### Criar produto
**POST** `/products`

```json
{
  "name": "Mouse Gamer",
  "description": "Mouse com 6 botões e sensor 12k DPI",
  "priceCents": 19990
}
```
Status: 201 Created

---

### Buscar produto por ID
**GET** `/products/{id}`

Status: 200 OK
Erro: 404 Not Found

---

### Listar produtos
**GET** `/products`

Status: 200 OK

---

### Atualizar produto
**PUT** `/products/{id}`

```json
{
  "name": "Mouse Gamer Pro",
  "priceCents": 24990
}
```
Status: 200 OK
Erro: 404 Not Found

---

### Remover produto
**DELETE** `/products/{id}`

Status: 204 No Content
Erro: 404 Not Found

---

### ⚙️ Como Executar o Projeto
```bash
./mvnw spring-boot:run
```

---

### A API estará disponível em:
```arduino
http://localhost:8080
```

---

### 🧪 Testes Manuais

Os endpoints foram testados via Postman utilizando requisições HTTP reais.

---

### 📌 Observações

- O banco de dados é inicializado automaticamente via Flyway.

- Este projeto será evoluído incrementalmente.

- O README será expandido ao final do desenvolvimento.