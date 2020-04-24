# FALTA TERMINAR ESTE BANCO DE DADOS!!!

# CRIANDO O BANCO DE DADOS CHAMADO 'COMPANHIA'
CREATE DATABASE Companhia;

# ATIVAR O BANCO
USE Companhia;

# CRIANDO A TABLELA 'DEPARTAMENTO'
CREATE TABLE departamento (
	id INT PRIMARY KEY NOT NULL,
	nome VARCHAR(30) NOT NULL,
    numero VARCHAR(100) NOT NULL
);

# MOSTRAR A TABELA 'DEPARTAMENTO'
SELECT * FROM departamento;

# CRIANDO A TABELA 'PROJETO'
CREATE TABLE projeto(
	id INT PRIMARY KEY NOT NULL,
    nome VARCHAR(30) NOT NULL,
    tempo_desenvolver INT NOT NULL,
    
     # Criando uma chave estrangeira 
    fk_departamento_id INT NOT NULL,
    # Referência:
    FOREIGN KEY (fk_departamento_id) REFERENCES departamento (id)
);

# MOSTRAR A TABELA 'PROJETO'
SELECT * FROM projeto;

# CRIAR TABELA 'PESQUISADOR'
CREATE TABLE pesquisador(
	id_pesquisador INT PRIMARY KEY NOT NULL,
    salario FLOAT(4,2) NOT NULL,
    
	# Criando uma chave estrangeira 
    fk_funcionario_id INT NOT NULL,
    # Referência:
    FOREIGN KEY (fk_funcionario_id) REFERENCES funcionario (id),
    
    # Criando uma chave estrangeira 
    fk_projeto_id INT NOT NULL,
    # Referência:
    FOREIGN KEY (fk_projeto_id) REFERENCES projeto (id)
); 

# MOSTRAR A TABELA 'PESQUISADOR'
SELECT * FROM pesquisador;

# CRIAR TABELA 'SECRETARIO'
CREATE TABLE secretario(
	id_secretario INT PRIMARY KEY NOT NULL,
    salario FLOAT(4,2) NOT NULL,
    grau_escolar VARCHAR(30) NOT NULL,
    
    # Criando uma chave estrangeira 
    fk_funcionario_id INT NOT NULL,
    # Referência:
    FOREIGN KEY (fk_funcionario_id) REFERENCES funcionario (id)
); 

# MOSTRAR A TABELA 'SECRETARIO'
SELECT * FROM secretario;

# CRIAR TABELA 'LIMPEZA'
CREATE TABLE limpeza(
	id INT PRIMARY KEY NOT NULL,
    cargo VARCHAR(30) NOT NULL,
    jornada_trabalho INT NOT NULL,
    
    # Criando uma chave estrangeira 
    fk_funcionario_id INT NOT NULL,
    # Referência:
    FOREIGN KEY (fk_funcionario_id) REFERENCES funcionario (id)
);

# MOSTRAR A TABELA 'LIMPEZA'
SELECT * FROM limpeza;
DESCRIBE limpeza;

# CRIAR TABELA 'FUNCIONÁRIO'
CREATE TABLE Funcionario(
	id INT PRIMARY KEY NOT NULL,
    nome VARCHAR(30) NOT NULL,
    enderedeco VARCHAR(30) NOT NULL,
    sexo VARCHAR(1) NOT NULL,
    aniversario INT(10) NOT NULL 
); 

# MOSTRAR A TABELA 'FUNCIONÁRIO'
SELECT * FROM Funcionario;

#CRIAR TABELA 'DEPENDENTE'
CREATE TABLE Dependente(
	nome VARCHAR(30) NOT NULL,
    sexo VARCHAR(1) NOT NULL,
    aniversario INT(10) NOT NULL,
    grau_parentesco VARCHAR(30) NOT NULL,
    
    # Criando uma chave estrangeira 
    fk_funcionario_id INT NOT NULL,
    # Referência:
    FOREIGN KEY (fk_funcionario_id) REFERENCES funcionario (id)
);

# MOSTRAR A TABELA 'DEPENDENTE'
SELECT * FROM Dependente;