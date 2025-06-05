# Checkpoint 2

## 📘 Disciplina
Arquitetura SOA e Web Services  
Professor: Carlos Eduardo Machado de Oliveira

## 🧑‍💻 Aluno
**Eduardo Osorio Filho**  
**RM550161**

## 📌 Objetivo
Este projeto foi desenvolvido como parte do Checkpoint 2, com o objetivo de aplicar os conceitos de arquitetura orientada a serviços (SOA) e Web Services SOAP.

Foram criadas APIs SOAP do lado **servidor** (Publisher) e consumidas por dois projetos **cliente** (Consumer), conforme instruções do roteiro fornecido.

---

## 🗂 Estrutura do Projeto

```
Checkpoint2_SOAP_Winery/
├── Publisher/
│   └── WinerySys/         # Projeto Maven que publica os Web Services
├── Consumer/
│   ├── WineStockClient/   # Cliente que consome o método getMenu
│   └── WineOrderClient/   # Cliente que consome os métodos placeOrder e sendWarn
```

---

## 🔧 Tecnologias e Ferramentas

- Java 17
- Maven
- JAX-WS (jaxws-rt)
- IDE (recomendado: IntelliJ IDEA ou Eclipse)

---

## 🚀 Instruções para Executar

### 1. Clonar o repositório ou extrair a pasta
Abra os projetos em sua IDE preferida.

---

### 2. Executar o projeto `WinerySys`

- Rode a classe `Loader.java`
- Ela irá publicar os serviços SOAP em:
  - `http://localhost:8085/WineStockService?wsdl`
  - `http://localhost:8086/WineWarningService?wsdl`

---

### 3. Executar o `WineStockClient`

- Rode a classe `ApplicationClient1.java`
- Este cliente consome o método `getMenu` do serviço de estoque

---

### 4. Executar o `WineOrderClient`

- Rode a classe `ApplicationClient2.java`
- Este cliente consome os métodos:
  - `placeOrder` do serviço de estoque
  - `sendWarn` do serviço de aviso

---

## ✅ Resultado Esperado

- Publicação dos serviços no console com as URLs
- Respostas corretas dos métodos dos serviços ao serem chamados