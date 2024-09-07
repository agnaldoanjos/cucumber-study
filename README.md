# Estudo Cucumber

Este projeto é uma POC do uso do **Cucumber** em combinação com **Spring Boot** demonstrando a configuração necessária para validar operações simples.

## Sumário

- [Sobre o Projeto](#sobre-o-projeto)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Estrutura do Projeto](#estrutura-do-projeto)
- [Executando os Testes](#executando-os-testes)
- [Exemplo de Cenário](#exemplo-de-cenário)
- [Contribuindo](#contribuindo)
- [Licença](#licença)

## Sobre o Projeto

O objetivo deste projeto é mostrar como implementar uma abordagem **BDD** usando **Cucumber** para testar uma aplicação baseada em microserviços.

### Principais Funcionalidades:

- **Testes de integração** utilizando Cucumber.
- BDD para descrever cenários de teste.
- Implementação de exemplo para testar endpoints REST com Cucumber.
- Microserviço de Gestão de Pessoas de exemplo.

## Tecnologias Utilizadas

Este projeto foi construído com o seguinte stack:

- **Java 21**
- **Spring Boot** (para construção do microserviço de Gestão de Pessoas)
- **Cucumber** (para escrita dos cenários de BDD)
- **JUnit 5** (para executar os testes)
- **Maven** (para gerenciar dependências)

## Estrutura do Projeto

O projeto segue uma estrutura comum de Spring Boot e Cucumber:

```plaintext
├── src
│   ├── main
│   │   ├── java
│   │   │   └── net.home (código-fonte do serviço de exemplo)
│   ├── test
│   │   ├── java
│   │   │   └── net.home
│   │   │       ├── stepdefinitions (path com as definições de passos do Cucumber)
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

Se você quiser rodar apenas arquivos ou cenários de teste específicos, pode usar tags nos seus arquivos `.feature` e executar os testes com:

```bash
mvn clean test -Dcucumber.options="--tags @SuaTag"
```

## Exemplo de Cenário para uma serviço fictício de Gestão de Pessoas

Aqui está um exemplo de um cenário **Cucumber** para criar uma nova pessoa num serviço de exemplo:

```gherkin
Feature: Gestão de Pessoas

  Scenario: Criando uma nova pessoa
    Given a pessoa com nome "João Silva" e idade "30"
    When eu envio uma requisição POST para "/persons"
    Then o status da resposta deve ser 201
    And a pessoa deve ser salva no sistema
```

Este cenário fará:

1. Definir uma nova pessoa com nome e idade.
2. Enviar uma requisição POST para o endpoint `/persons`.
3. Verificar que o status da resposta é `201 Created`.
4. Garantir que a pessoa foi salva no sistema.

Outro exemplo de cenário para consultar uma pessoa por ID pode ser assim:

```gherkin
Feature: Gestão de Pessoas

  Scenario: Consultando uma pessoa por ID
    Given uma pessoa existe com o nome "Maria Souza" e idade "25"
    When eu envio uma requisição GET para "/persons/{id}"
    Then o status da resposta deve ser 200
    And o corpo da resposta deve conter os detalhes da pessoa
```

## Contribuindo

Contribuições são bem-vindas! Por favor, siga os passos abaixo:

1. Faça um fork do repositório.
2. Crie uma branch para sua funcionalidade (`git checkout -b feature/FuncionalidadeIncrivel`).
3. Faça o commit das suas mudanças (`git commit -m 'Adicione uma FuncionalidadeIncrivel'`).
4. Faça o push para a branch (`git push origin feature/FuncionalidadeIncrivel`).
5. Abra um pull request.

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.