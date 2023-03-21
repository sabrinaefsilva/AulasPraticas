
 
 Feature: Aprendendo schema de cenarios
  Como usuario quero montar um schema para validar login

 
  Scenario Outline: Login
    Given que acesse site "https://www.saucedemo.com/"
    When informar o usuario <usuario>
    And informar a senha <senha>
    Then valido mensagem <mensagem>

    Examples: 
      | usuario           | senha              | mensagem                                              |
      | "locked_out_user" |     "secret_sauce" | "Epic sadface: Sorry, this user has been locked out." |