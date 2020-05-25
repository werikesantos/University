
USE avaliacoes;

# Selecionando todos os registros da tabela aluno:
SELECT 
	* # listando os atributos que eu preciso
FROM 
	aluno; # informando a origem dos dados
    
# Data de nascimento da aluna 'Mariana'
SELECT 
	nascimento
FROM
	aluno
WHERE
	nome='Mariana';


# Data de nascimento da aluna 'Mariana'
SELECT 
	nascimento AS Nasc_Mariana
FROM
	aluno
WHERE
	nome='Mariana';

# Utilizando expressão como coluna do banco:
SELECT 
	codigo_aluno, numero_prova, nota, nota*0.1 AS Bonus
FROM 
	avaliacao
;

# Utilizando constantes no resultado:
SELECT 
	codigo_aluno, "Excelente aluno!" AS Resultado
FROM
	avaliacao
WHERE
	nota > 9.0;


# Qual o nome e a data de nascimento dos alunos que fizeram a prova 1?
SELECT
	a.nome, a.nascimento, av.numero_prova, av.nota
FROM
	aluno a, avaliacao av
WHERE 
	a.codigo = av.codigo_aluno
    AND av.numero_prova = 1
    AND (a.nome='Ana' OR a.nome='Pedro')
;

# Qual o nome e a nota dos alunos da turma 2 que fizeram a avaliação 1?
SELECT
	a.nome
FROM
	aluno a, turma t
WHERE 
	av.codigo_aluno = a.codigo
	AND a.codigo = t.codigo_aluno
    AND t.codigo = 2
    AND av.numero_prova = 1;

#
SELECT
	a.*, av.*
FROM
	aluno a, avaliacao av
WHERE
	a.codigo = av.codigo_aluno
    AND nota > 8;

# 

SELECT 
	a.*
FROM 
	avaliacao av, aluno a
WHERE 
	av.numero_prova = 1
    AND a.codigo = av.codigo_aluno;

#
SELECT 
	DISTINCT(codigo)
FROM 
	turma;

# Lista as provas que foram realizadas,
# sem repetir o código.
SELECT 
	DISTINCT(numero_prova)
FROM 
	avaliacao;

# Operadores vazios:
# Listar apenas os alunos com data de nascimento vazio:
SELECT
	a.*
FROM
	aluno a
WHERE
	a.nascimento IS NULL;-- IS NOT NULL


# Qual a maior nota de todas as avaliações?
SELECT 
	MAX(av.nota)
FROM
	avaliacao av
WHERE
	av.numero_prova = 2;

# Qual a média das notas da prova 1?
SELECT
	AVG(av.nota)
FROM 
	avaliacao av
WHERE 
	av.numero_prova = 1;

# Qual a menor nota da prova 1?
SELECT 
	MIN(av.nota)
FROM
	avaliacao av
WHERE
	av.numero_prova = 1;

# SUB-CONSULTAS
# Qual o nome do aluno que tirou 
# a menor nota na prova 1?
SELECT 
	*
FROM 
	avaliacao av2, aluno a
WHERE 
	av2.codigo_aluno = a.codigo
	AND av2.nota = 
    (SELECT 
		MIN(av.nota)
	FROM
		avaliacao av
	WHERE
		av.numero_prova = 1);
        
SELECT * FROM avaliacao;


#
SELECT 
	MAX(av.nota), MIN(av.nota)
FROM 
	avaliacao av, aluno a, turma t
WHERE 
	av.numero_prova = 2
    AND t.codigo = 1
    AND av.codigo_aluno = a.codigo
    AND t.codigo_aluno = a.codigo;

# operador de TOTAL DE REGISTROS?
# Quantos alunos estão cadastrados no banco?
SELECT 
	COUNT(*) AS Total
FROM 
	aluno a
WHERE
	a.nascimento IS NULL;
    

# Contagem sem elementos repetidos:
# Quantas turmas diferentes existem no banco?
SELECT
	COUNT(DISTINCT (t.codigo))
FROM 
	turma t;







