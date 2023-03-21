@tag
Feature: Validar inclusao de produto no carrinho
Como ususario
Quero incluir produto no carrinho
Para validar a inclusao de produtos


  @tag1
    Scenario: Validar a iclusao de produtos no carrinho
    Given que esteja logado
    When adicionar um produto no carrinho
    And acessar o carrinho
    Then valido o produto adicionado
    
	Scenario: Continuar adicionando produto
    Given que esteja logado
    When adicionar um produto no carrinho
    And acessar o carrinho
    And clicar para continuar adicionando produtos 
    Then  valido que estou na tela de produtos 