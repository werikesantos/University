# Criando um banco de dados
DROP DATABASE avaliacoes;

# Ativando o banco de dados;
USE avaliacoes;

# Criando tabela 'ALUNO'
CREATE TABLE aluno(
codigo integer (11),
nome VARCHAR(50),
nascimento DATE
);