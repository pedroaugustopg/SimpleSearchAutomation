# Simple Search Automation

## Descrição

Projeto de automação de testes desenvolvido em **Java**, utilizando **Selenium WebDriver**, **JUnit 5** e **Maven**. O objetivo é validar o comportamento funcional 
da página **Demo Simple Search**, verificando elementos da interface, interações do usuário e resultados apresentados pela aplicação.

---

## Tecnologias

* Java
* Selenium WebDriver
* JUnit 5
* Maven
* Google Chrome
* ChromeDriver
* IntelliJ IDEA

---

## Estrutura do Projeto

```text
SimpleSearchAutomation
│
├── src
│   └── test
│       └── java
│           └── tests
│               └── SearchTest.java
│
├── pom.xml
└── README.md
```

---

## Funcionalidades Testadas

### Abertura da página

* Acessa a URL da aplicação.
* Verifica se os elementos principais foram carregados corretamente.

---

### Validação do título

* Confirma se o título da página corresponde ao esperado.

---

### Digitação no campo de busca

* Localiza o campo de texto.
* Insere um valor.
* Valida se o texto foi armazenado corretamente no componente.

---

### Exibição do resultado após a pesquisa

* Digita um termo de pesquisa.
* Aciona o botão de busca.
* Verifica se o resultado é exibido ao usuário.

---

### Validação antes da pesquisa

* Confirma que o resultado não é apresentado antes da execução da busca.

---

## Conceitos Aplicados

* Organização de testes com JUnit 5
* Ciclo de vida dos testes (`@BeforeEach` e `@AfterEach`)
* Localização de elementos utilizando `By.id()`
* Interação com elementos através do Selenium WebDriver
* Asserções utilizando `assertTrue()`, `assertFalse()` e `assertEquals()`
* Estruturação de testes independentes
* Gerenciamento de dependências com Maven
* Organização do código seguindo boas práticas de legibilidade e separação por responsabilidade

---

## Dependências

* Selenium WebDriver
* JUnit Jupiter

---

## Como executar

1. Clone o repositório.
2. Abra o projeto no IntelliJ IDEA.
3. Aguarde o Maven realizar o download das dependências.
4. Execute a classe `SearchTest` como teste JUnit.

---

## Objetivo

Este projeto foi desenvolvido com fins de prática em automação de testes de interface, aplicando conceitos fundamentais de QA, Selenium WebDriver e JUnit 
em um cenário simples de validação funcional.
