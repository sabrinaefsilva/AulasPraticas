
@tag
Feature: Acessar um novo site
  Como usuario quero acessar um novo site

  
  Scenario: Validar title
    Given que acesse "https://www.saucedemo.com/"
    When capturar o title
  	Then valido o title "Swag Labs"