# 📜 README

<h1>Sistema de Controle de Estoque</h1>

Este é um projeto simples de controle de estoque desenvolvido em Java. Ele inclui classes que representam produtos, estoque e uma fachada para interagir com o estoque de forma simplificada atraves do <strong>Padrão de projetos - Facade</strong>.

<h2>Classes do Projeto</h2>
<h3>1. Product</h3>
A classe Product representa um produto no sistema. Ela possui atributos como ID, nome e quantidade, juntamente com métodos para acessar e modificar esses atributos.

<h3>2. Stock</h3>
A classe Stock é responsável por armazenar e gerenciar os produtos em estoque. Ela fornece métodos para adicionar novos produtos, atualizar a quantidade de produtos existentes, obter informações sobre um produto específico e gerar um relatório de estoque.

<h3>3. StockFacade</h3>
A classe StockFacade é uma fachada que simplifica o acesso e a manipulação do estoque. Ela encapsula as operações fornecidas pela classe Stock, oferecendo métodos convenientes para adicionar produtos, atualizar a quantidade de produtos, consultar um produto específico e gerar um relatório de estoque.

<h3>4. Main</h3>
O arquivo Main.java é o ponto de entrada do programa. Ele contém o método main onde são realizadas as operações de exemplo utilizando a classe StockFacade.

<h2>Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.</h2>
