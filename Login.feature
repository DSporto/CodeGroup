
@tag
Feature: Como usuario
         Quero acessar a aplicacao
         Para fazer login

  @tag1
  Scenario: Efetuando login
    Given que esteja na tela de login
    When informar os dados de login
    And selecionar o button login
    Then visualizo a tela inicial da aplicacao 
    

 
