# ATIVIDADE: PESQUISAS DE POKEMONS

# 01: Quais os Pokemons que possuem Combate Power (cp) acima de 1000?
SELECT
	idPokemon, nome, cp
FROM 
	Tipo t
JOIN
	Pokemon P
	ON p.idTipo = t.idTipo
WHERE
	cp > 1000;
    
SELECT * FROM pokemon;
SELECT * FROM tipo;
  
# 02: Quais Pokemons do tipo água capturados em 2018 com cp acima de 600? 
SELECT
	nome, dataCaptura, cp, nomeTipo
FROM 
	Pokemon P
JOIN
	Tipo t
	ON p.idTipo = t.idTipo
WHERE
	p.idTipo = 2; 
    
SELECT * FROM pokemon;
SELECT * FROM tipo;
  
# 03: Quais são os Pokemons capturados do tipo grama?
SELECT
	nomeTipo, nome
FROM 
	Tipo t
JOIN
	Pokemon P
	ON p.idTipo = t.idTipo
WHERE
	t.idTipo = 3; 
  
SELECT * FROM pokemon;
SELECT * FROM tipo;

#04: Qual o Pokemon do tipo fogo mais forte?
SELECT
	nome, MAX(cp) AS 'Over Powerful'
FROM 
	Tipo t
JOIN
	Pokemon P
	ON p.idTipo = t.idTipo
WHERE
	nomeTipo = "Fogo"; 
    
#05: Qual o total de Pokemons capturados?
SELECT
	COUNT(*) AS 'Pokemons Capturados'
FROM 
	Tipo t
JOIN
	Pokemon P
	ON p.idTipo = t.idTipo;