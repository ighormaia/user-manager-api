## User Manager API

 - Api desenvolvida com o framework Spring Boot na versão 2.3.2
 - Pode ser rodado com o banco dados Postgres ou H2 (em memória)

Requisitos:
 - Java 11 ou superior
 - Maven 3.6.3 ou superior
 - Postgres 12.7 ou superior (caso escolha o perfil Prod)

O projeto está configurado com dois Profiles, podendo ser trocado ao rodar a aplicação
 - Dev | configurado com o banco H2 (por padrão é o perfil usado)
 - Prod | configurado para acessar um banco postgres


Comandos para rodar a aplicação:

### `mvn clean install`
Para instalar todas dependencias

### `mvn spring-boot:run`
Para iniciar a aplicação com o banco H2 (em memória)

### `mvn spring-boot:run -Dspring-boot.run.profiles=application-prod`
Para iniciar a aplicação com o banco Postgres


Configuração do Postgres: (pode ser alterado no arquivo "application-prod.yml")
 - database: usermanager
 - username: postgres
 - password: password


Após a execução a api estará disponível na url:
 - http://localhost:9000


As rotas seguem o padrão REST:

 - GET ALL    localhost:9000/api/v1/usuarios
 - POST       localhost:9000/api/v1/usuarios
 - PUT        localhost:9000/api/v1/usuarios
 - DELETE     localhost:9000/api/v1/usuarios/{id}
