# ApiContactAgenda

Projeto baseado no seguinte modelo MER: 

## Como rodar

1. Antes de qualquer coisa, mude a conexão com o banco de dados, em:

    > \oficina\src\main\resources\application.properties

## Testar

Utilize os seguintes link no thunder Client, insomnia e etc.:

### Contatos

#### Pesquisar todos os contatos

```http
GET http://localhost:9000/contatos/
```

#### Pesquisar tudo relacionado a tabela contatos

```http
GET http://localhost:9000/contatos/getall/
```

#### Inserir um novo contato

```http
POST http://localhost:9000/contatos/
```

exemplo de JSON body

```JSON
  {
    "contFirstname": "Test",
    "contLastname": "TestSobrenome",
    "dataNasc": "1800-09-18",
    "anotacoes": "This is a test"
  }
```

### Usuário

#### Pesquisar todos os usuários

```http
GET http://localhost:9000/user/
```

#### Inserir um novo usuário

```http
POST http://localhost:9000/user/
```

Exemplo Json body

```JSON
  {
    "userFirstName": "TesteNome",
    "userLastName": "TesteSobrenome",
    "userEmail": "Teste@gmail.com",
    "userPass": "12345678"
  }
```
