# SELECIONANDO o banco de dados para trabalhar
USE escola;

# LISTAR todos os registros da tabela 'professor'
SELECT * FROM professor;

# Utilizando o comando INSERT para INSERIR um novo registro na tabela:
INSERT INTO professor # PARTE 1: em qual tabela inserir os dados?
	(telefone, matricula, cpf, nome, data_nasc, endereco) #PARTE 2: quais os campos preencheremos?
    VALUES
    ("11 98595-0519", 455, "444.444.672-20", "Werike", "1993-08-25", "Rua Antonio Pires"); # PARTE 3: informando os valores

# DESCREVE os campos da tabela
DESCRIBE professor;
    
# Inserindo um registro na tabela DISCIPLINA:
INSERT INTO disciplina(id, nome, semestre, ano, fk_professor_matricula)
VALUES(04, "Desenho Técnico", 02, 2020, 455);

# LISTAR todos os registros da tabela 'disciplina'
SELECT * FROM disciplina;

# DESCREVE os campos da tabela
DESCRIBE disciplina;
    
# INSERINDO um registro na tabela ALUNO:
INSERT INTO aluno(nome, ra, email, fk_disciplina_id)
VALUES("Rafael", 7780, "rafael@gmail.com", 04);

# LISTAR todos os registros da tabela 'aluno'
SELECT * FROM aluno;

# DESCREVE os campos da tabela
DESCRIBE aluno;

# ATUALIZANDO um registro na tabela 'ALUNO'
UPDATE aluno
SET email = "rafael.oliveira@hotmail.com", nome = "Rafael Oliveira"
WHERE ra = 7780;

# (REMOVENDO 'UM' DETERMINADO) registro da tabela:
DELETE FROM aluno
WHERE ra = 7780;

# (REMOVENDO 'TODOS') os registros da tabela:
DELETE FROM aluno; #NÃO EXECUTAR ESTE COMANDO. (O MESMO PODE NÃO FUNCIONAR, MAS NO TERMINAL ELE EXECUTA!)













