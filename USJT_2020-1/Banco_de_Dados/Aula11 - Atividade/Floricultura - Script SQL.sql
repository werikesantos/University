CREATE DATABASE floricultura;

Use floricultura;

CREATE TABLE cadastro_cliente(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    rg VARCHAR(14),
    telefone VARCHAR(15) NOT NULL,
    endereco VARCHAR(200) 
);

CREATE TABLE produto_vendido(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	nome_produto TEXT NOT NULL,
	preco DOUBLE NOT NULL, 
	quantidade_estoque INT NOT NULL
);

CREATE TABLE cliente_Compra(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	data_compra DATE NOT NULL,
	valor_total DOUBLE NOT NULL,
    
    #CHAVES ESTRANGEIRAS
    fk_cadastro_cliente_id INT NOT NULL,
    fk_produto_vendido_id INT NOT NULL,
    
    FOREIGN KEY (fk_cadastro_cliente_id) REFERENCES cadastro_cliente(id),
    FOREIGN KEY (fk_produto_vendido_id) REFERENCES produto_vendido(id)
);

SHOW TABLES;


