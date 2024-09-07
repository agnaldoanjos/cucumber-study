# Estudo Cucumber

Este projeto demonstra o uso do **Cucumber** em combinação com **Spring Boot** e os princípios de **BDD (Behavior Driven Development)** para validar operações de endpoints REST.

## Sumário

- [Sobre o Projeto](#sobre-o-projeto)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Executando os Testes](#executando-os-testes)
- [Exemplo de Cenário](#exemplo-de-cenário)
- [Contribuindo](#contribuindo)
- [Licença](#licença)

## Sobre o Projeto

O objetivo deste projeto é mostrar como implementar uma abordagem **BDD** usando **Cucumber** para testar uma aplicação Spring Boot. O projeto tem endpoints simples para testes, incluindo validação de respostas e códigos de status HTTP.

### Principais Funcionalidades:

- **Testes de integração** utilizando Cucumber.
- BDD para descrever cenários de teste.
- Implementação de exemplo para testar endpoints REST com Cucumber.

## Tecnologias Utilizadas

Este projeto foi construído com o seguinte stack:

- **Java 21**
- **Spring Boot** (para construção dos endpoints REST)
- **Cucumber** (para escrita dos cenários de BDD)
- **JUnit 5** (para executar os testes)
- **Maven** (para gerenciar dependências)

## Estrutura do Projeto

O projeto segue uma estrutura comum de Spring Boot e Cucumber:

```plaintext
├── src
│   ├── main
│   │   ├── java
│   │   │   └── net.home (código-fonte do serviço REST)
│   ├── test
│   │   ├── java
│   │   │   └── net.home
│   │   │       ├── stepdefinitions (definições de passos do Cucumber)
│   │   │       └── runners (executores de teste do Cucumber)
│   └── resources
│       └── features (arquivos de feature do Cucumber para cenários de BDD)
```

- **Features**: Contém arquivos `.feature`, que definem os cenários de teste BDD.
- **Definições de Passos**: Classes Java que mapeiam cada linha nos arquivos `.feature` para uma implementação de teste específica.
- **Runners**: Classes JUnit configuradas para executar os testes do Cucumber.

## Executando os Testes

Para executar os testes do Cucumber, siga os passos abaixo:

1. Clone o repositório:
   ```bash
   git clone https://github.com/agnaldoanjos/cucumber-study.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd cucumber-study
   ```
3. Certifique-se de que o **Maven** está instalado. Caso não esteja, siga o [guia de instalação do Maven](https://maven.apache.org/install.html).
4. Execute os testes usando Maven:
   ```bash
   mvn clean test
   ```

Isso irá executar todos os cenários de teste definidos no diretório `features`.

## Exemplo de Cenário

Aqui está um exemplo de cenários **Cucumber** para testar os endpoints `/home`, `/hello` e `/version` fornecidos pelo serviço REST:

### Arquivo Feature - `message.feature`

```gherkin
@All
Feature: A mensagem pode ser recuperada

  Scenario: Cliente faz chamada para POST /home
    When o cliente chama /home
    Then o cliente recebe o código de status 200
    And o cliente recebe a versão do servidor "hello"

  Scenario: Cliente faz chamada para GET /hello
    Given o cliente chama /hello
    When o cliente recebe o código de status 200
    Then o cliente recebe a versão do servidor "hello"
```

### Arquivo Feature - `version.feature`

```gherkin
@All
Feature: A versão pode ser recuperada

  Scenario: Cliente faz chamada para GET /version
    When o cliente chama /version
    Then o cliente recebe o código de status 200
    And o cliente recebe a versão do servidor "1.0"
```

Esses cenários verificam se o cliente faz chamadas HTTP para os endpoints `/home`, `/hello` e `/version` e validam o código de status da resposta, bem como o valor retornado pela aplicação (neste caso, "hello" e "1.0").

## Contribuindo

Contribuições são bem-vindas! Por favor, siga os passos abaixo:

1. Faça um fork do repositório.
2. Crie uma branch para sua funcionalidade (`git checkout -b feature/FuncionalidadeIncrivel`).
3. Faça o commit das suas mudanças (`git commit -m 'Adicione uma FuncionalidadeIncrivel'`).
4. Faça o push para a branch (`git push origin feature/FuncionalidadeIncrivel`).
5. Abra um pull request.

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.
