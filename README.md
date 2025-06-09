# 🛍️ Mudi - Aplicação Web de Gerenciamento de Produtos com Spring MVC

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-blue?logo=java" />
  <img src="https://img.shields.io/badge/Spring%20Boot-3.2.3-brightgreen?logo=spring" />
  <img src="https://img.shields.io/badge/Thymeleaf-template%20engine-orange?logo=thymeleaf" />
  <img src="https://img.shields.io/badge/MySQL-Database-blue?logo=mysql" />
  <img src="https://img.shields.io/badge/Bootstrap-5-purple?logo=bootstrap" />
</p>

## 📌 Visão Geral

**Mudi** é uma aplicação web desenvolvida com **Spring MVC** e **Thymeleaf** que permite a criação e gerenciamento de solicitações de produtos. Os usuários podem cadastrar novos produtos com informações como nome, URL, imagem e descrição.

---

## 🧰 Tecnologias Utilizadas

- Java 17  
- Spring Boot 3.2.3  
- Spring MVC  
- Spring Data JPA  
- Thymeleaf  
- MySQL  
- Bootstrap 5  
- Maven  

---

## ⚙️ Funcionalidades

- Visualização de uma lista de pedidos de produtos  
- Cadastro de novos pedidos com validação  
- Armazenamento de informações em banco de dados MySQL  
- Navegação entre páginas com UI baseada em Bootstrap  

---

## 📁 Estrutura do Projeto

### 🔑 Componentes Principais

#### 🧩 Models
- `Pedido`: Entidade que representa um pedido de produto (nome, URL, imagem, preço etc.)

#### 📦 Controllers
- `HomeController`: Controla a página inicial e a listagem de produtos  
- `PedidoController`: Gerencia a criação de pedidos e submissão do formulário  

#### 🗄 Repositórios
- `PedidoRepository`: Interface JPA para operações no banco de dados  

#### 📤 DTOs
- `RequisicaoNovoPedido`: Objeto de transferência de dados usado nos formulários  

#### 🖼 Views (Templates)
- `home.html`: Página principal com os pedidos  
- `formulario.html`: Formulário para cadastrar novos pedidos  

---

## 🗃️ Configuração do Banco de Dados

A aplicação utiliza um banco de dados **MySQL**, com a seguinte configuração (definida em `application.properties`). Certifique-se de criar um banco chamado `mudi` antes de iniciar a aplicação.

---

## ▶️ Como Executar

1. Certifique-se de ter o **Java 17** e **Maven** instalados  
2. Crie o banco de dados MySQL com o nome `mudi`  
3. Clone este repositório:
```bash
git clone https://github.com/EmanuelSergio/Spring-MVC-Thymeleaf.git
cd mudi
```

4. Execute a aplicação com Maven:
```bash
./mvnw spring-boot:run
```

5. Acesse o sistema em: [http://localhost:8080/home](http://localhost:8080/home)

---

## ✅ Validação de Formulários

A aplicação utiliza **Jakarta Validation** com anotações como `@NotBlank` para validar os campos do formulário. As mensagens de erro são configuradas no arquivo `messages.properties`.

---

## 🔄 Fluxo da Aplicação

- A listagem de pedidos pode ser acessada em `/home`  
- Novos pedidos podem ser criados clicando em **"Novo"** ou acessando `/pedido/formulario`  
- A validação garante que os campos obrigatórios sejam preenchidos corretamente  
- Após o envio, o pedido é salvo no banco de dados  
- A página inicial exibe todos os pedidos cadastrados  

---

## 👨‍💻 Sobre o Projeto

Este projeto foi desenvolvido com o objetivo de praticar conceitos do **Spring MVC**, **Thymeleaf**, **JPA** e **validações de formulário**, com foco em uma estrutura simples, limpa e funcional.

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Perfil-blue?logo=linkedin)](https://www.linkedin.com/in/emanuel-girardi-99320421a/)
