create database  banco;
use banco;
create table alunos (
id int primary key,
nome varchar (100),
numero int,
materia varchar(50)
);

create table professores (
id int primary key,
cpf int,
nome varchar (100),
numero int,
materia varchar(50)
);

create table aulas (
    alunos_id int,
    professores_id int,
    FOREIGN KEY (alunos_id) REFERENCES alunos(id),
    FOREIGN KEY (professores_id) REFERENCES professores(id)

);