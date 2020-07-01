#20 consultas (que envolvam ao menos duas tabelas):

#1 QUAIS ESPÉCIES LOCALIZADAS EM CONTÊINER DE FOSSA?
SELECT
	especie, tipo_conteiner #coluna
FROM
	cadastro_animal ca #tabela
JOIN
	conteiner co #tabela
	ON ca.id_cadastro_animal = co.id_conteiner #chaves
WHERE 
	tipo_conteiner = 'Fosso'; #condição


#2 QUAIS ESPÉCIES LOCALIZADAS EM CONTÊINER DE TANQUE?
SELECT
	especie, tipo_conteiner 
FROM
	cadastro_animal ca
JOIN
	conteiner co 
	ON ca.id_cadastro_animal = co.id_conteiner 
WHERE 
	tipo_conteiner = 'Tanque';


#3 Quais espécies localizadas em contêiner de jaula?
SELECT
	especie, tipo_conteiner 
FROM
	cadastro_animal ca
JOIN
	conteiner co 
	ON ca.id_cadastro_animal = co.id_conteiner 
WHERE 
	tipo_conteiner = 'Jaula'; 
    
    
#4 Quais espécies localizadas na ala norte do Zoológico?
SELECT
	especie, localizacao 
FROM
	cadastro_animal ca 
JOIN
	conteiner co
	ON ca.id_cadastro_animal = co.id_conteiner 
WHERE 
	localizacao = 'Norte'; 


#5 Quais espécies localizadas na ala sul do Zoológico?
SELECT
	especie, localizacao 
FROM
	cadastro_animal ca 
JOIN
	conteiner co
	ON ca.id_cadastro_animal = co.id_conteiner 
WHERE 
	localizacao = 'Sul'; 


#6 Quais espécies localizadas na ala leste do Zoológico?
SELECT
	especie, localizacao 
FROM
	cadastro_animal ca 
JOIN
	conteiner co
	ON ca.id_cadastro_animal = co.id_conteiner 
WHERE 
	localizacao = 'Leste'; 


#7 Quais espécies localizadas na ala oeste do Zoológico?
SELECT
	especie, localizacao 
FROM
	cadastro_animal ca 
JOIN
	conteiner co
	ON ca.id_cadastro_animal = co.id_conteiner 
WHERE 
	localizacao = 'Oeste'; 
    

#8 Qual contêiner será limpo às 09:00hrs? 
SELECT
	tipo_conteiner, horas 
FROM
	conteiner co 
JOIN
	agendar_limpeza ag 
	ON co.id_conteiner = ag.id_agendar_limpeza 
WHERE 
	horas = '09:00:00'; 


#9 Existem quantos agendamentos de limpeza na ala Sul?
SELECT
	COUNT(id_agendar_limpeza), localizacao
FROM
	conteiner co 
JOIN
	agendar_limpeza ag 
	ON co.id_conteiner = ag.id_agendar_limpeza 
WHERE 
	localizacao = 'Sul'; 


#10 Quais os nomes e espécies dos tipos mamífero existem no zoológico?
SELECT
	nome, especie, tipo_classe AS 'Mamíferos'
FROM	
	cadastro_animal ca
JOIN
	classe_animal cl
    ON ca.id_cadastro_animal = cl.id_classe_animal
WHERE
	tipo_classe = 'Mamífero';


#11 Qual nome e especiel dos mamiferos do zoológico ?
SELECT
	nome, especie, tipo_classe
FROM
	cadastro_animal ca
JOIN
	classe_animal cl
    ON ca.id_cadastro_animal = cl.id_classe_animal
WHERE
	tipo_classe = 'Mamífero';


#12 Qual veterinario vai atender a consulta 01?
SELECT
	id_consulta, nome, setor #coluna
FROM
	consulta co #tabela
JOIN
	cadastro_funcionario cf 
	ON co.id_consulta = cf.id_cadastro_funcionario
WHERE 
	co.id_consulta = 1; #condição
    
    
#13 Qual o nome de todos os funcionários e espécies do zoológico?
SELECT
	cf.nome, ca.especie  
FROM
	cadastro_funcionario cf 
JOIN
	cadastro_animal ca 
	ON cf.id_cadastro_funcionario = ca.id_cadastro_animal; 


#14 Qual o nome do veterinário agendado pelo número identificador (05)? 
SELECT
	nome AS 'Agendamento 05'
FROM
	consulta co
JOIN
	cadastro_funcionario cf
    ON co.id_consulta = cf.id_cadastro_funcionario
WHERE
	id_cadastro_funcionario = 1;
    

#15 O veterinário responsável pelo Gavião Real, possuí CRMV?
SELECT
	*
FROM
	consulta co
JOIN
	cadastro_funcionario cf
    ON co.id_consulta = cf.id_cadastro_funcionario
WHERE
	id_cadastro_funcionario = 1;


#16 Qual a descrição do Gavião-real?
#17 Qual a descrição e classe do Gavião-de-penacho?
#18 Quais os dados do funcionário e animal cadastrados no agendamento número (04)?
#19 O identificador de classe animal número (05) é uma Ave?
#20 Qual o nome científico do animal que possui um identificador de classe número (05)?

