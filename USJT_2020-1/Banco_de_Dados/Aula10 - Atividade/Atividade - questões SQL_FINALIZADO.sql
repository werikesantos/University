USE conta;

CREATE TABLE cliente (
	cpf character(11) NOT NULL,
	nome character varying(50) NOT NULL,
	nascimento date,
	cidade character varying(50),
	estado character(2),
	
    PRIMARY KEY (cpf)
);
SELECT *FROM cliente;

CREATE TABLE gerente (
    id integer PRIMARY KEY,
    nome character varying(50)
);

SELECT * FROM gerente;


CREATE TABLE agencia (
    numero integer NOT NULL,
    nome character varying(50),
    gerente integer,

    PRIMARY KEY (numero),
    FOREIGN KEY (gerente) REFERENCES gerente(id) ON UPDATE CASCADE ON DELETE RESTRICT
);

SELECT * FROM agencia;

#ACHANDO AS AGENCIAS DO GERENTE 'Roberto C. Rocha'
SELECT
	ag.nome, ag.gerente AS 'Roberto C. Rocha'
FROM 
	agencia ag
WHERE
	ag.gerente = 2; 

CREATE TABLE conta (
	numero integer NOT NULL,
	agencia integer NOT NULL,
	saldo numeric(10,2) NOT NULL,
    PRIMARY KEY (numero, agencia),
    FOREIGN KEY (agencia) REFERENCES agencia(numero) ON UPDATE RESTRICT ON DELETE RESTRICT
);
select * from conta;

SELECT
	c.numero, c.agencia, c.saldo
FROM 
	conta c
WHERE
	c.saldo < 500.00;

# LOCALIZANDO UM DADO ESPECIFICO
SELECT 
	c.agencia, c.numero, c.saldo
FROM
	conta c
WHERE
	c.agencia = 933 AND c.numero = 38;

# DELETANDO DADOS DO ATRIBUTO (NUMERO E AGENCIA)
SET foreign_key_checks = 0; # DESATIVANDO AS VERIFICAÇÕES DA CHAVE ESTRANGEIRA
DELETE FROM conta 
WHERE numero = 38 AND agencia = 933;
SET foreign_key_checks = 1; # ATIVANDO AS VERIFICAÇÕES DA CHAVE ESTRANGEIRA
  
-- ATRIBUINDO UM DESCONTO DE R$ 10,00
SELECT
	c.saldo-10 as Desconto
FROM
	conta c
WHERE
	c.agencia = 455;

CREATE TABLE cliente_conta (
	cliente character(11) NOT NULL,
	agencia integer NOT NULL,
	conta integer NOT NULL,
    
    PRIMARY KEY (cliente, agencia, conta),
    FOREIGN KEY (cliente) REFERENCES cliente(cpf) ON UPDATE CASCADE ON DELETE RESTRICT,
    FOREIGN KEY (conta, agencia) REFERENCES conta(numero, agencia)
);

SELECT * FROM cliente_conta;

# LOCALIZANDO AS CONTAS CADASTRADAS EM UM CPF
SELECT 
	c.cliente
FROM
	cliente_conta c
WHERE
	cliente = 60781625970;

CREATE TABLE transacao (
	data timestamp NOT NULL,
	agencia integer NOT NULL,
	conta integer NOT NULL,
	cliente character(11) NOT NULL,
	valor numeric(10,2) NOT NULL,
	tipo integer NOT NULL,
    PRIMARY KEY (data, agencia, conta, cliente)
);

SELECT * FROM transacao;

# COMANDO PALA LOCALIZAR TRANSAÇÕES DE UMA DETERMINADA AGENCIA
SELECT
	t.valor, t.agencia, t.data
FROM 
	transacao t
WHERE
	t.agencia = 855;
    
#(A) POSSIVEIS TRANSAÇÕES FRAUDULENTAS 
SELECT 
	t.valor, t.tipo AS'Acima de R$ 9900.00 Tipo 2'
FROM 
	transacao t
WHERE
	t.valor > 9900.00 AND t.tipo = 2
;

#(B) POSSIVEIS TRANSAÇÕES FRAUDULENTAS 
SELECT 
	t.agencia, t.conta, t.tipo
FROM 
	transacao t
WHERE
	t.agencia = 787 AND t.conta = 23 AND t.tipo = 1
;
#numero = 23 - agencia 787 - saldo 315.02 - cfp 93778386983

#(C) POSSIVEIS TRANSAÇÕES FRAUDULENTAS 
SELECT 
	t.tipo, t.valor, t.agencia
FROM 
	transacao t
WHERE
	t.tipo = 3 AND t.valor > 9900.00 AND t.agencia = 933;

# ACHANDO TRANSAÇÕES DE UM DETERMINADO CLIENTE
SELECT 
	t.cliente, t.valor, t.tipo AS 'Maior que R$ 100,00'
FROM
	transacao t
WHERE
	t.cliente = 60781625970 AND t.valor > 100.00 AND t.tipo = 1;

#ACHANDO TRANSAÇÕES ENTRE R$1000.00 E R$10000.00
SELECT
	t.agencia, t.conta, t.cliente, t.valor
FROM
	transacao t
WHERE
	t.agencia = 855 AND t.valor >= 1000.00 AND t.valor <= 10000.00
;