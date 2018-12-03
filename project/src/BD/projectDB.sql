create database project;
create schema usuario;
create schema produto;
create schema dados;

create table dados.fatTempo(
    dia integer,
    mes integer,
    ano integer,
    valor double precision
);

create table usuario.cliente (
    cpf integer primary key,
    email varchar(50) not null,
    nome varchar(50) not null,
    bairro varchar(25) not null,
    rua varchar(30) not null,
    numero integer not null,
    senha varchar(10) not null,
    codStory integer unique
);

create table produto.alimento(
    codBarra integer primary key,
    preco double precision,
    nome varchar(20),
    descricao varchar(150),
    lote integer,
    diaVal integer,
    mesVal integer,
    anoVal integer,
    diaCompra integer,
    mesCompra integer,
    anoCompra integer
);
create table produto.roupa(
    codBarra integer primary key,
    preco double precision,
    nome varchar(20),
    descricao varchar(150),
    lote integer,
    tamanho varchar(2),
    diaCompra integer,
    mesCompra integer,
    anoCompra integer
);
create table produto.eletro(
	codBarra integer primary key,
    preco double precision,
    nome varchar(20),
    descricao varchar(150),
    lote integer,
	garantia int,
    diaCompra integer,
    mesCompra integer,
    anoCompra integer
);

