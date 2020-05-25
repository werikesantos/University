
CREATE DATABASE super_economico;

USE super_economico;

CREATE TABLE produto (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    valor DOUBLE NOT NULL,
    titulo VARCHAR(256) NOT NULL,
    descricao TEXT
);

CREATE TABLE pedido (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    valor_total DOUBLE NOT NULL,
    forma_pagamento VARCHAR(16) NOT NULL
);

CREATE TABLE itemprodutopedido (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    fk_pedido_id INT NOT NULL,
    fk_produto_id INT NOT NULL,
    quantidade INT NOT NULL,
    FOREIGN KEY (fk_pedido_id) REFERENCES pedido(id),
    FOREIGN KEY (fk_produto_id) REFERENCES produto(id)
);

INSERT INTO produto VALUES (null, 1199.99, 'XBOX', 'xbox one');

INSERT INTO pedido VALUES (7422, 1999.98, 'Crédito');

SELECT * FROM produto;

INSERT itemprodutopedido VALUES (null, 7422, 2, 1);

SELECT * FROM itemprodutopedido;

# Quais os nomes dos produtos que estão no pedido 7422?
SELECT 
	SUM(item.quantidade)
FROM 
	pedido pe, itemprodutopedido item, produto pr
WHERE
	item.fk_pedido_id = pe.id
    AND item.fk_produto_id = pr.id
	AND pe.id = 7422;
	