CREATE DATABASE zoologico;

USE zoologico;

CREATE TABLE cadastro_funcionario(
	id_cadastro_funcionario INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    rg VARCHAR(12) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    data_nascimento DATE, #aaaa-mm-dd
    endereco VARCHAR(200) NOT NULL, 
    setor VARCHAR(100) NOT NULL, 
    cargo VARCHAR(100) NOT NULL,
    crmv VARCHAR(9) NOT NULL
);

CREATE TABLE cadastro_animal(
	id_cadastro_animal INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    especie VARCHAR(30) NOT NULL,
    cor VARCHAR(30) NOT NULL,
    altura DOUBLE NOT NULL
);

CREATE TABLE consulta(
	id_consulta INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    dia DATE NOT NULL, #aaaa-mm-dd
    horas TIME NOT NULL, #hh;mm:ss
    
    #CHAVES ESTRANGEIRAS
    fk_cadastro_funcionario_id_cadastro_funcionario INT NOT NULL,
    fk_cadastro_animal_id_cadastro_animal INT NOT NULL,
    
    FOREIGN KEY (fk_cadastro_funcionario_id_cadastro_funcionario) REFERENCES cadastro_funcionario(id_cadastro_funcionario),
    FOREIGN KEY (fk_cadastro_animal_id_cadastro_animal) REFERENCES cadastro_animal(id_cadastro_animal)
);

CREATE TABLE classe_animal(
	id_classe_animal INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    tipo_classe VARCHAR(50) NOT NULL,
    descricao TEXT NOT NULL,
    
    #CHAVES ESTRANGEIRAS
    fk_cadastro_animal_id_cadastro_animal INT NOT NULL,
    
    FOREIGN KEY (fk_cadastro_animal_id_cadastro_animal) REFERENCES cadastro_animal(id_cadastro_animal)
);

CREATE TABLE conteiner(
	id_conteiner INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    tipo_conteiner VARCHAR(50) NOT NULL,
    localizacao VARCHAR(100) NOT NULL,
	
    #CHAVES ESTRANGEIRAS
    fk_cadastro_animal_id_cadastro_animal INT NOT NULL,
    
    FOREIGN KEY (fk_cadastro_animal_id_cadastro_animal) REFERENCES cadastro_animal(id_cadastro_animal)
);

CREATE TABLE agendar_limpeza(
	id_agendar_limpeza INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	dia DATE NOT NULL, #aaaa-mm-dd
    horas TIME NOT NULL, #hh;mm:ss
	
    #CHAVES ESTRANGEIRAS
    fk_conteiner_id_conteiner INT NOT NULL,
    
    FOREIGN KEY (fk_conteiner_id_conteiner) REFERENCES conteiner(id_conteiner)
);
