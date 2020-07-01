#TRABALHANDO NA TABELA 'CADASTRO_FUNCIONARIO'
DESCRIBE cadastro_funcionario;

INSERT INTO cadastro_funcionario VALUES (NULL, 'Miguel da Fonseca', '00.000.000-0', '001.000.000-10', '1980-01-05', 'Rua Alagoas da Lagoa do Sul Nº 1653', 'Veterinário', 'Chefe', '0101/0202');
INSERT INTO cadastro_funcionario VALUES (NULL, 'Luciano Vieira Peixoto', '11.111.111-1', '112.111.111-12', '1981-02-25', 'Rua Engenho de Riacho Grande Nº 023', 'Veterinário', 'Ajudante', '0303/0404');
INSERT INTO cadastro_funcionario VALUES (NULL, 'Vagner José de Morais Barros', '22.222.222-2', '223.222.222-23', '1982-03-04', 'Travessa Engenho de Riacho Grande Nº 487', 'Zelador', 'Administrador', NULL);
INSERT INTO cadastro_funcionario VALUES (NULL, 'Manuela Ferraz de Campos Sales', '33.333.333-3', '334.333.333-34', '1983-04-15', 'Avenida Minerão Nº 0940', 'Zelador', 'Ajudante', NULL);
INSERT INTO cadastro_funcionario VALUES (NULL, 'Francisca de Paula Rodrigues Alves', '44.444.444-4', '445.444.444-45', '1984-05-18', 'Travessa Borges Arruda Nº 2323', 'Cuidador', 'Chefe', NULL);
INSERT INTO cadastro_funcionario VALUES (NULL, 'Miguelana Augusto Moreira Pena', '55.555.555-5', '556.555.555-56', '1985-06-09', 'Rua Engenho Miguelana Nº 234', 'Cuidador', 'Ajudante', NULL);
INSERT INTO cadastro_funcionario VALUES (NULL, 'Nilana Procópio Peçanha', '66.666.666-6', '667.666.666-67', '1986-07-30', 'Avenida Jota Cruz Nº 9786', 'Administração', 'Chefe', NULL);
INSERT INTO cadastro_funcionario VALUES (NULL, 'Henrique Rodrigues da Fonseca', '77.777.777-7', '778.777.777-78', '1987-08-20', 'Cruzamento Engenheiro Burgo Nº 6445', 'Administração' , 'Ajudante', NULL);
INSERT INTO cadastro_funcionario VALUES (NULL, 'Velasca Brás Pereira Gomes', '88.888.888-8', '889.888.888-89', '1988-09-22', 'Rua Riddel Nº 0978', 'Auxiliar de Limpeza', 'Chefe', NULL);
INSERT INTO cadastro_funcionario VALUES (NULL, 'Rita Rodrigues Borges', '99.999.999-9', '990.999.999-90', '1989-10-28', 'Travessa Chega Nº 756', 'Auxiliar de Limpeza', 'Ajudante', NULL);

SELECT * FROM cadastro_funcionario;

#TRABALHANDO NA TABELA 'CADASTRO_ANIMAL'
DESCRIBE cadastro_animal;

INSERT INTO cadastro_animal VALUES (NULL, 'Leão', 'Panthera leo', 'Marrom', '1.7');
INSERT INTO cadastro_animal VALUES (NULL, 'Leão-Marinho', 'Otaria bironya', 'Chocolate', '2.73');
INSERT INTO cadastro_animal VALUES (NULL, 'Zebra', 'Equus Grevys', 'Branco e Preto', '2.4');
INSERT INTO cadastro_animal VALUES (NULL, 'Girafa', 'Giraffa camelopardalis', 'amarelo-tostado', '4.2');
INSERT INTO cadastro_animal VALUES (NULL, 'Jacaré-do-pantanal', 'Caiman yacare', 'Dorso Escuro', '3.0');
INSERT INTO cadastro_animal VALUES (NULL, 'Lagarto-de-língua-azul', 'Tiliqua scincoides', 'Cinza', '0.60');
INSERT INTO cadastro_animal VALUES (NULL, 'Bico-Doce', 'Ameiva ameiva', 'Catanho', '0.55');
INSERT INTO cadastro_animal VALUES (NULL, 'Gavião-real', 'Harpia harpyja', 'Cinza-azulada', '0.90');
INSERT INTO cadastro_animal VALUES (NULL, 'Gavião-de-penacho', 'Spizaetus ornatus', 'Cinza-azulada', '0.67');
INSERT INTO cadastro_animal VALUES (NULL, 'Pica-pau-de-banda-branca', 'Dryocopus lineatus', 'Topete vermelho', '0.33');

SELECT * FROM cadastro_animal;

#TRABALHANDO NA TABELA 'CONSULTA'
DESCRIBE consulta;

INSERT INTO consulta VALUES (NULL, '2020-06-15', '16:30:00', '1', '8');
INSERT INTO consulta VALUES (NULL, '2020-06-16', '13:30:00', '2', '3');
INSERT INTO consulta VALUES (NULL, '2020-06-17', '10:30:00', '2', '2');
INSERT INTO consulta VALUES (NULL, '2020-06-18', '11:30:00', '1', '1');
INSERT INTO consulta VALUES (NULL, '2020-06-19', '20:00:00', '1', '9');
INSERT INTO consulta VALUES (NULL, '2020-06-12', '08:30:00', '2', '7');
INSERT INTO consulta VALUES (NULL, '2020-06-21', '10:30:00', '1', '6');
INSERT INTO consulta VALUES (NULL, '2020-06-22', '15:00:00', '2', '5');
INSERT INTO consulta VALUES (NULL, '2020-06-23', '18:00:00', '2', '3');
INSERT INTO consulta VALUES (NULL, '2020-06-24', '10:00:00', '1', '1');

SELECT * FROM consulta;

#TRABALHANDO NA TABELA 'CLASSE ANIMAL'
DESCRIBE classe_animal;

INSERT INTO classe_animal VALUES (NULL, 'Mamífero', '\nORDEM: Carnivora\nFAMÍLIA: Felidae\nNOME POPULAR: Leão\nNOME EM INGLÊS: Lion\nNOME CIENTÍFICO: Panthera leo\nDISTRIB. GEOGRÁFICA: África e Ásia\nHÁBITOS ALIMENTARES: Carnívoro\nREPRODUÇÃO: Gestação de 120 dias\nPERÍODO DE VIDA: Aproximadamente 20 anos\nHABITAT: Savanas, matas e planícies', '1');
INSERT INTO classe_animal VALUES (NULL, 'Mamífero', '\nORDEM: Carnivora\nFAMÍLIA: Otariidae\nNOME POPULAR: Leão-Marinho\nNOME EM INGLÊS: Southern Sea Lion, South American Sea Lion\nNOME CIENTÍFICO: Otaria flavescens\nDISTRIB. GEOGRÁFICA: Litoral sul do Brasil, Uruguai, Argentina e Chile, até as praias rochosas do Peru, incluindo as ilhas que ocorrem no meio deste percurso\nHÁBITOS ALIMENTARES: Carnívoro\nREPRODUÇÃO: Gestação de aproximadamente 1 ano, com apenas 1 filhote\nPERÍODO DE VIDA: 30 anos', '2');
INSERT INTO classe_animal VALUES (NULL, 'Mamífero', '\nORDEM: Perissodactyla\nFAMÍLIA: Equidae\nNOME POPULAR: Zebra-de-Grévy\nNOME EM INGLÊS: Grevy zebra\nNOME CIENTÍFICO: Equus grevyi\nDISTRIB. GEOGRÁFICA: Etiópia, Kenia e Sudão\nHÁBITOS ALIMENTARES: Herbívoro\nREPRODUÇÃO: 390 dias com apenas 1 filhote\nPERÍODO DE VIDA: 18 anos em vida livre; 30 anos em cativeiro\nHABITAT: Regiões árida e semi-árida', '3');
INSERT INTO classe_animal VALUES (NULL, 'Mamífero', '\nORDEM: Artiodactyla\nFAMÍLIA: Giraffidae\nNOME POPULAR: Girafa\nNOME EM INGLÊS: Giraffe\nNOME CIENTÍFICO: Giraffa camelopardalis\nDISTRIB. GEOGRÁFICA: África\nHÁBITOS ALIMENTARES: Herbívora\nREPRODUÇÃO: Em geral tem apenas um filhote, com gestação aproximada de 14 meses\nPERÍODO DE VIDA: Aproximadamente 25 anos\nHABITAT: Habita praticamente todo o continente, desde o sul do deserto Sahara até a província do Cabo, com exceção das florestas tropicais', '4');
INSERT INTO classe_animal VALUES (NULL, 'Réptil', '\nORDEM: Crocodylia\nFAMÍLIA: Alligatoridae\nNOME POPULAR: Jacaré-do-pantanal\nNOME EM INGLÊS: Yacare caiman\nNOME CIENTÍFICO: Caiman yacare\nDISTRIB. GEOGRÁFICA: Desde o norte da Argentina até o sul da bacia Amazônica, mas ocorre principalmente no Pantanal\nHÁBITOS ALIMENTARES: Carnívoro, alimenta-se de invertebrados aquáticos (moluscos e crustáceos), peixes e outros vertebrados, como aves e roedores\nREPRODUÇÃO: Ovíparos. Colocam entre 20 e 38 ovos que são incubados em média por 70-80 dias\nPERÍODO DE VIDA:\nHABITAT: Vive em ambientes essencialmente aquáticos, como alagados, rios, lagoas e pântanos', '5');
INSERT INTO classe_animal VALUES (NULL, 'Réptil', '\nORDEM: Squamata\nFAMÍLIA: Scincidae\nNOME POPULAR: Lagarto-de-língua-azul\nNOME EM INGLÊS: Eastern blue-tongue skink\nNOME CIENTÍFICO: Tiliqua scincoides\nDISTRIB. GEOGRÁFICA: Norte e Leste da Austrália\nHÁBITOS ALIMENTARES: Onívoro\nREPRODUÇÃO: Vivípara. Produz de 5 a 15 filhotes por ninhada após gestação de aproximadamente 100 dias\nPERÍODO DE VIDA: 20 anos\nHABITAT: florestas secas, úmidas e região costeira', '6');
INSERT INTO classe_animal VALUES (NULL, 'Réptil', '\nORDEM: Squamata\nFAMÍLIA: Teiidae\nNOME POPULAR: Bico-doce\nNOME EM INGLÊS: Jungle runner\nNOME CIENTÍFICO: Ameiva ameiva\nDISTRIB. GEOGRÁFICA: Panamá até o sul do Brasil e norte da Argentina\nHÁBITOS ALIMENTARES: Onívoro, se alimentando desde insetos até vegetais\nREPRODUÇÃO: 2 a 6 ovos por postura, que eclodem entre 60 e 90 dias de incubação\nPERÍODO DE VIDA: de 5 a 10 anos\nHABITAT: Matas e cerrados, sendo comum em áreas alteradas pela ação do homem', '7');
INSERT INTO classe_animal VALUES (NULL, 'Ave', '\nORDEM: Falconiformes\nFAMÍLIA: Accipitridae\nNOME POPULAR: Harpia\nNOME EM INGLÊS: Harpy eagle\nNOME CIENTÍFICO: Harpia harpyja\nDISTRIB. GEOGRÁFICA: América do Sul e Central\nHÁBITOS ALIMENTARES: Carnívoro\nREPRODUÇÃO: 1 ovo que eclode após 56 dias de incubação\nPERÍODO DE VIDA: Aproximadamente 40 anos\nHABITAT: Florestas neotropicais', '8');
INSERT INTO classe_animal VALUES (NULL, 'Ave', '\nORDEM: Falconiformes\nFAMÍLIA: Accipitridae\nNOME POPULAR: Gavião-de-penacho\nNOME EM INGLÊS: Ornate hawk-eagle\nNOME CIENTÍFICO: Spizaetus ornatus\nDISTRIB. GEOGRÁFICA: Norte do Paraná à América Central\nHÁBITOS ALIMENTARES: Carnívoro\nREPRODUÇÃO: postura geralmente de apenas um ovo, incubado por cerca de 50 dias\nPERÍODO DE VIDA: estimado em aproximadamente 30 anos\nHABITAT: florestas tropicais e subtropicais', '9');
INSERT INTO classe_animal VALUES (NULL, 'Ave', '\nORDEM: Piciformes\nFAMÍLIA: Picidae\nNOME POPULAR: Pica-pau-de-banda-branca ou Pica-pau-de-topete-vermelho\nNOME EM INGLÊS: Lineated Woodpecker\nNOME CIENTÍFICO: Dryocopus lineatus\nDISTRIB. GEOGRÁFICA: Brasil, Paraguai. Argentina, México à Bolívia\nHÁBITOS ALIMENTARES: Insetívoro e frugívoro\nREPRODUÇÃO: 2 a 3 ovos\nPERÍODO DE VIDA:\nHABITAT: Florestas e cerrados', '10');

SELECT * FROM classe_animal;

#TRABALHANDO NA TABELA 'CONTÊINER'
DESCRIBE conteiner;

INSERT INTO conteiner VALUES (NULL, 'Fosso', 'Norte', '1');
INSERT INTO conteiner VALUES (NULL, 'Tanque', 'Norte', '2');
INSERT INTO conteiner VALUES (NULL, 'Fosso', 'Sul', '3');
INSERT INTO conteiner VALUES (NULL, 'Fosso', 'Sul', '4');
INSERT INTO conteiner VALUES (NULL, 'Fosso', 'Leste', '5');
INSERT INTO conteiner VALUES (NULL, 'Tanque', 'Leste', '6');
INSERT INTO conteiner VALUES (NULL, 'Tanque', 'Leste', '7');
INSERT INTO conteiner VALUES (NULL, 'Jaula', 'Oeste', '8');
INSERT INTO conteiner VALUES (NULL, 'Jaula', 'Oeste', '9');
INSERT INTO conteiner VALUES (NULL, 'Jaula', 'Oeste', '10');

SELECT * FROM conteiner;

#TRABALHANDO NA TABELA 'AGENDAR LIMPEZA'
DESCRIBE agendar_limpeza;

INSERT INTO agendar_limpeza VALUES (NULL, '2020-06-01', '08:30:00', '1');
INSERT INTO agendar_limpeza VALUES (NULL, '2020-06-02', '08:00:00', '2');
INSERT INTO agendar_limpeza VALUES (NULL, '2020-06-03', '08:10:00', '3');
INSERT INTO agendar_limpeza VALUES (NULL, '2020-07-04', '10:30:00', '4');
INSERT INTO agendar_limpeza VALUES (NULL, '2020-07-05', '10:00:00', '5');
INSERT INTO agendar_limpeza VALUES (NULL, '2020-07-06', '10:20:00', '6');
INSERT INTO agendar_limpeza VALUES (NULL, '2020-08-07', '09:30:00', '7');
INSERT INTO agendar_limpeza VALUES (NULL, '2020-08-08', '09:00:00', '8');
INSERT INTO agendar_limpeza VALUES (NULL, '2020-08-09', '09:00:00', '9');
INSERT INTO agendar_limpeza VALUES (NULL, '2020-09-10', '11:00:00', '10');

SELECT * FROM agendar_limpeza;