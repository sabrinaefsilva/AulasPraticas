@tag
Feature: Validar inclusao de produto no carrinho usando string
Como ususario
Quero incluir produto no carrinho usando string
Para validar a inclusao de produtos

	Background: Fazer o login
	Given que esteja logadocom usuario "standard_user" e senha "secret_sauce"
	When adicionar um produto no carrinho
  And acessar o carrinho
    
    
  @tag1
    Scenario: Validar a iclusao de produtos no carrinho
      Then valido o produto adicionado
    
	Scenario: Continuar adicionando produto
    And clicar para continuar adicionando produtos 
    Then  valido que estou na tela de produtos 