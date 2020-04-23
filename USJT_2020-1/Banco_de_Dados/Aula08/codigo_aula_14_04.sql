
#Criando um banco de dados chamado 'escola':
CREATE DATABASE escola;

#Acessar o banco de dados chamado 'escola':
USE escola;

#Criar a tabela 'professor'
CREATE TABLE professor (
	telefone VARCHAR(15),
    matricula INT PRIMARY KEY NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    nome VARCHAR(126) NOT NULL,
    data_nasc DATE NOT NULL,
    endereco VARCHAR(200)
);

# 
CREATE TABLE aluno (
	nome VARCHAR(200),
    ra INT PRIMARY KEY NOT NULL,
    email VARCHAR(120),
    
    # Criando um campo que será a chave estrangeira:
    fk_disciplina_id INT NOT NULL,
    
    # Criando a chave estrangeira entre Aluno e disciplina:
    FOREIGN KEY (fk_disciplina_id) REFERENCES disciplina(id)
);

#Listar todas as tabelas do banco 'escola':
SHOW TABLES;

#Listar todos os bancos de dados dentro do meu MySQL:
SHOW DATABASES;

#Listando as informações do esquema 'professor':
DESCRIBE professor; # DESC professor;

# Remover uma tabela do banco:
DROP TABLE aluno;

# Remover uma base de dados completa:
DROP DATABASE escola;

# Adicionando um novo campo à tabela Aluno:
ALTER TABLE aluno ADD (
	email VARCHAR(65) NOT NULL
);

# Removendo um campo de uma tabela: 
ALTER TABLE aluno DROP ( nome );

# Listando as colunas e suas propriedades:
DESCRIBE aluno;

# Criando a tabela Disciplina:
CREATE TABLE disciplina (
	id INT NOT NULL PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    semestre INT NOT NULL,
    ano YEAR NOT NULL,
    # Criando uma chave estrangeira para o
    # professor da disciplina:
    # Padrão Foreign Key:
    fk_professor_matricula INT NOT NULL,
    # Referência:
    FOREIGN KEY (fk_professor_matricula) REFERENCES professor (matricula)
        
);


SHOW TABLES;

DESC disciplina;
