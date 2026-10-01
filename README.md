# Task Manager — Cadastro de tarefas

Gerenciador simples de tarefas: listar e cadastrar, com validação de formulário.

Projeto de estudo desenvolvido durante o curso de **Análise e Desenvolvimento de Sistemas** (SENAI-SP Vila Leopoldina), na disciplina de desenvolvimento web com Spring Boot.

## Stack

- Java 21
- Spring Boot (Spring Web + Thymeleaf)
- Bean Validation (Jakarta)
- Lombok
- Maven

Os dados ficam **em memória** (uma `List` dentro do repositório). Não há banco de dados — ao reiniciar a aplicação, os registros são perdidos.

## Como rodar

```bash
./mvnw spring-boot:run
```

Ou abra o projeto no IntelliJ e execute a classe `TaskManagerApplication`.

Depois acesse: **http://localhost:8080/task**

## Rotas

| Método | Rota | O que faz |
|---|---|---|
| GET | `/task` | Lista todas as tarefas |
| GET | `/task/new` | Exibe o formulário de cadastro |
| POST | `/task` | Valida e salva a tarefa |

## Estrutura

```
src/main/java/org/example/taskmanager/
├── models/Task.java
├── service/TaskService.java
└── controllers/TaskController.java
src/main/resources/templates/
├── index.html
└── criarTarefa.html
```

## O que esse projeto exercita

- Formulário com `th:object` e `th:field`
- Bean Validation (`@NotBlank`, `@Size`) com `@Valid` + `BindingResult`
- Exibição de mensagens de erro com `th:errors`
- Padrão POST → Redirect → GET
- Campo booleano com `<input type="checkbox">`
