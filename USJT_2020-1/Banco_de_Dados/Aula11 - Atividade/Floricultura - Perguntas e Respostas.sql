#1) QUAL É O NOME CLIENTE CADASTRADO NO PRODUTO 3?
SELECT 
	cad.nome
FROM
	cliente_Compra cli, cadastro_cliente cad
WHERE
	cli.fk_produto_vendido_id = 3
    AND cad.id = 1;

#2) QUANTOS PRODUTOS NO ESTOQUE POSSUÍ O ITEM 4? E TAMBÉM MOSTRE O VALOR DO PRODUTO.
SELECT
	pro.id, pro.quantidade_estoque, pro.preco
FROM
	produto_vendido pro
WHERE 
	pro.id = 4;

#3) QUAL O PRODUTO VENDIDO MAIS BARATO E MAIS CARO?
SELECT
	MIN(pro.preco), MAX(pro.preco)
FROM
	produto_vendido pro;

#4) QUANTOS CLIENTES ESTÃO CADASTRADOS NO BANCO DE DADOS?
SELECT
	COUNT(*) AS Total #SERVE COM UM CONTADOR!
FROM
	cadastro_cliente;

#5) QUANTOS PREÇOS DISTINTOS EXITEM NA TABELA 'PRODUTO_VENDIDO'?
SELECT
	COUNT(DISTINCT(pro.preco))
FROM
	produto_vendido pro;