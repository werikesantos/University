# CRIANDO O BANCO DE DADOS CHAMADO 'LIVRARIA'
CREATE DATABASE Livraria;

use Livraria;
# CRIANDO A TABLELA 'LIVRO'
CREATE TABLE livro (
	codigo INT PRIMARY KEY NOT NULL,
    titulo VARCHAR(100) NOT NULL,
	idioma VARCHAR(40) NOT NULL,
    ano_lancamento INT NOT NULL,
    
    # Criando uma chave estrangeira 
    fk_autor_id INT NOT NULL,
    # Referência:
    FOREIGN KEY (fk_autor_id) REFERENCES autor (id)
); 

# MOSTRAR A TABELA 'LIVRO'
SELECT * FROM livro;

# CRIANDO A TABELA 'AUTOR'
CREATE TABLE autor(
	id INT PRIMARY KEY NOT NULL,
	nome_nascimento VARCHAR(30) NOT NULL,
    pseudonimo VARCHAR(30) NOT NULL,
    ano_nascimento INT NOT NULL,
    pais_origem VARCHAR(30) NOT NULL,
    biografia VARCHAR(300) NOT NULL
); 

# MOSTRAR A TABELA 'AUTOR'
SELECT * FROM autor;

# CRIAR TABELA 'EDITORA'
CREATE TABLE editora(
	id INT PRIMARY KEY NOT NULL,
	nome VARCHAR(30) NOT NULL,
    razao_social VARCHAR(30) NOT NULL,
    endereço VARCHAR(30) NOT NULL,
    telefone VARCHAR(14) NOT NULL,
    
    # Criando uma chave estrangeira 
    fk_autor_id INT NOT NULL,
    # Referência:
    FOREIGN KEY (fk_autor_id) REFERENCES autor (id)
); 

# MOSTRAR A TABELA 'EDITORA'
SELECT * FROM editora;

# CRIAR TABELA 'EDIÇÃO'
CREATE TABLE edicao(
	isbn INT PRIMARY KEY NOT NULL,
    preco_venda FLOAT(10,2) NOT NULL,
    ano_publicacao INT NOT NULL,
    numero_pagina INT NOT NULL,
    estoque INT NOT NULL,
   
   # Criando uma chave estrangeira 
    fk_livro_codigo INT NOT NULL,
    # Referência:
    FOREIGN KEY (fk_livro_codigo) REFERENCES livro (codigo)
); 

# MOSTRAR A TABELA 'EDIÇÃO'
SELECT * FROM edicao;

# MOSTRAR TODAS AS TABELAS
SHOW TABLES;

#DESCREVER CADA TABELA:
DESCRIBE livro;