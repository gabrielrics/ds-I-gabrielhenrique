create database projetojava;
use projetojava;

create table usuario (
id bigint(10) auto_increment,
nome varchar(250),
sobrenome varchar(250),
cpf varchar(250),
email varchar(250),
telefone varchar(250),
dataNascimento varchar(250),
estadoCivil varchar(250),
CEP varchar(250),

primary key(id)
);

select * from usuario;