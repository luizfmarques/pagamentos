# API de Transações

Esta é uma API desenvolvida em Spring Boot para gerenciamento de transações. Ela permite criar e listar usuários e transações através de endpoints RESTful. 
A documentação da API foi gerada usando Swagger.

## Funcionalidades

- **Criação de usuários**: Permite criar novos usuários enviando os dados necessários no corpo da requisição.
- **Listagem de usuários**: Permite buscar todos os usuários cadastrados.
- **Criação de transações**: Permite criar novas transações enviando os dados necessários no corpo da requisição.
- **Listagem de transações**: Permite buscar todas as transações cadastradas no sistema.
- **Documentação Swagger**: Acesse a documentação detalhada da API no formato Swagger UI para entender os endpoints disponíveis.

## Tecnologias Utilizadas

- Java 17+
- Spring Boot 3+
- Swagger/OpenAPI 3.0
- Maven
- H2 Database

## Requisitos

- JDK 17+
- Maven 3.6+

## Como Rodar a Aplicação

1. **Clone o Repositório**

2. **Configure o Banco de Dados**

   Edite o arquivo `src/main/resources/application.properties` para incluir a configuração do banco de dados. Exemplo para H2 Database:

   ```properties
   spring.datasource.url=jdbc:h2:mem:testdb
   spring.datasource.driverClassName=org.h2.Driver
   spring.datasource.username=sa
   spring.datasource.password=password
   spring.h2.console.enabled=true
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Build e Execute a Aplicação**

   Compile e execute a aplicação usando Maven:

   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. **Acesse a API**

   A API estará disponível em [http://localhost:8080](http://localhost:8080).

   Você pode acessar a documentação Swagger em:

   - **Swagger UI**: [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)
   - **Documentação JSON**: [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs)
