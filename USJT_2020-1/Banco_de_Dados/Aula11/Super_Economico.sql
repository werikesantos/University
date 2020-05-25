CREATE DATABASE super_economico;

USE super_economico;

CREATE TABLE produto(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    valor DOUBLE NOT NULL,
    titulo VARCHAR(256) NOT NULL,
    descricao TEXT
);

CREATE TABLE pedido(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    valor_total DOUBLE NOT NULL,
    forma_pagamento VARCHAR (16) NOT NULL
);

CREATE TABLE itemprodutopedido(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    quantidade INT NOT NULL,
    
    #CHAVES ESTRANGEIRAS
    fk_pedido_id INT NOT NULL,
    fk_produto_id INT NOT NULL,
    
    FOREIGN KEY (fk_pedido_id) REFERENCES pedido(id),
    FOREIGN KEY (fk_produto_id) REFERENCES produto(id)
);

SHOW TABLES;

#INSERINDO DADOS NA TABELA 'PRODUTO'
DESCRIBE produto;

INSERT INTO produto VALUES (null, 799.99, 'TV 29', 'Ótima TV');
INSERT INTO produto VALUES (null, 1199.99, 'X BOX', 'Xbox One');

SELECT
	*
FROM
	produto;
	
#INSERINDO DADOS NA TABELA 'PEDIDO'
DESCRIBE pedido;

INSERT INTO pedido VALUES (null, 799.99, 'Boleto');
INSERT INTO pedido VALUES (null, 1999.98, 'C.Crédito');

SELECT * FROM pedido;

#INSERINDO DADOS NA TABELA 'ITEMPRODUTOPEDIDO'
DESCRIBE itemprodutopedido;

#NULL - QUANTIDADE - FK_PEDIDO_ID - FK_PRODUTO_ID
INSERT INTO itemprodutopedido VALUES (null, 1, 1, 1);
INSERT INTO itemprodutopedido VALUES (null, 1, 2, 2);
INSERT INTO itemprodutopedido VALUES (null, 1, 2, 1);

SELECT * FROM produto;
SELECT * FROM pedido;
SELECT * FROM itemprodutopedido;
    

# BUSCA: QUAIS OS NOMES DOS PEDIDOS QUE ESTÃO NO PEDIDO 1?
SELECT
	pr.titulo
FROM
	pedido p, itemprodutopedido item, produto pr
WHERE 
	item.fk_pedido_id = p.id
    AND item.fk_produto_id = pr.id
    AND p.id = 2;
    
# CONT... BUSCA: QUANTIDADE DE CADA ITEM COMPRADO?
SELECT
	pr.titulo, item.quantidade
FROM
	pedido p, itemprodutopedido item, produto pr
WHERE 
	item.fk_pedido_id = p.id
    AND item.fk_produto_id = pr.id
    AND p.id = 2;
    
# CONT... BUSCA: PREÇO UNITÁRIO DE CADA PRODUTO COMPRADO?
SELECT
	pr.titulo, item.quantidade, pr.valor
FROM
	pedido p, itemprodutopedido item, produto pr
WHERE 
	item.fk_pedido_id = p.id
    AND item.fk_produto_id = pr.id
    AND p.id = 2;

# CONT... BUSCA: REALIZANDO A SOMA DOS VALORES DOS PRODUTOS?
SELECT
	SUM(pr.valor)
FROM
	pedido p, itemprodutopedido item, produto pr
WHERE 
	item.fk_pedido_id = p.id
    AND item.fk_produto_id = pr.id
    AND p.id = 2;
    
# CONT... BUSCA: REALIZANDO A SOMA DOS ELEMENTOS?
SELECT
	SUM(item.quantidade)
FROM
	pedido p, itemprodutopedido item, produto pr
WHERE 
	item.fk_pedido_id = p.id
    AND item.fk_produto_id = pr.id
    AND p.id = 2;
      