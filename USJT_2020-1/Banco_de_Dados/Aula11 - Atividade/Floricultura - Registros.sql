#TABALHANDO NA TABELA 'CADASTRO_CLIENTE'
DESCRIBE cadastro_cliente;

INSERT INTO cadastro_cliente VALUES (NULL, 'Deodoro da Fonseca', '000.000.000-00', '(11) 90000-0000', 'Alagoas da Lagoa do Sul');
INSERT INTO cadastro_cliente VALUES (NULL, 'Floriano Vieira Peixoto', '111.111.111-11', '(11) 91111-1111', 'Engenho de Riacho Grande');
INSERT INTO cadastro_cliente VALUES (NULL, 'Prudente José de Morais Barros', '222.222.222-22', '(11) 92222-2222', 'Cidade paulista de Mairinque');
INSERT INTO cadastro_cliente VALUES (NULL, 'Manuel Ferraz de Campos Sales', '333.333.333-33', '(11) 93333-3333', 'Campinas');
INSERT INTO cadastro_cliente VALUES (NULL, 'Francisco de Paula Rodrigues Alves', '444.444.444-44', '(11) 94444-4444', 'Guaratinguetá');
INSERT INTO cadastro_cliente VALUES (NULL, 'Afonso Augusto Moreira Pena', '555.555.555-55', '(11) 95555-5555', 'Santa Bárbara');

SELECT * FROM cadastro_cliente;

#TABALHANDO NA TABELA 'PRODUTO_VENDIDO'
DESCRIBE produto_vendido;

INSERT INTO produto_vendido VALUES (NULL, 'ARRANJO COM ROSAS', 120.00, 200);
INSERT INTO produto_vendido VALUES (NULL, 'ARRANJO COM LIRIOS', 100.00, 150);
INSERT INTO produto_vendido VALUES (NULL, 'ARRANJO COM FLORES DO CAMPO', 80.00, 400);
INSERT INTO produto_vendido VALUES (NULL, 'ARRANJO COM GIRASSOL', 130.00, 800);
INSERT INTO produto_vendido VALUES (NULL, 'ARRANJO COM ROSAS COLOMBIANAS', 90.00, 100);

SELECT * FROM produto_vendido;


#TABALHANDO NA TABELA 'CLIENTE_COMPRA'
DESCRIBE cliente_Compra;

INSERT INTO cliente_Compra VALUES (NULL, '2020-05-01', 240.00, 1, 3);
INSERT INTO cliente_Compra VALUES (NULL, '2020-04-11', 1200.00, 3, 1); 
INSERT INTO cliente_Compra VALUES (NULL, '2020-03-14', 4500.00, 5, 5); 
INSERT INTO cliente_Compra VALUES (NULL, '2020-05-16', 2600.00, 2, 4); 
INSERT INTO cliente_Compra VALUES (NULL, '2020-05-04', 800.00, 6, 2); 

SELECT * FROM cliente_Compra;


