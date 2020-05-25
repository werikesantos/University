create database aulaBD;
use aulaBD;

create table cliente(
id int auto_increment,
nome varchar (50),
fone varchar (50),
email varchar(50),
primary key(id)
);

create table alunos(
id int auto_increment,
nome varchar(50),
idade int not null,
ra int not null,
primary key(id)
);

drop table aluno;

select * from alunos;