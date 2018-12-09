create database project;
create schema usuario;
create schema produto;
create schema dados;

create table usuario.loja(
    cod varchar(20) primary key,
    nome varchar(35) not null
);


create table dados.pedidos{
    codPedido integer primary key,
    codCliente varchar(20),
    codLoja varchar(20),
    valor double precision,
    foreign key codCliente references usuario.cliente(cpf),
    foreign key codLoja references usuario.loja(cod)
}

create table usuario.cliente (
    cpf varchar(20) primary key,
    email varchar(50) not null unique,
    nome varchar(50) not null,
    bairro varchar(25) not null,
    rua varchar(30) not null,
    numero integer not null,
    senha varchar(10) not null,
);
create table usuario.fornecedor (
    cpf varchar(20) primary key,
    email varchar(50) not null unique,
    nome varchar(50) not null,
    bairro varchar(25) not null,
    rua varchar(30) not null,
    numero integer not null,
    senha varchar(10) not null,
    codStory varchar(20) unique,
    foreign key codStory references usuario.loja(cod)
);

create table produto.alimento(
    codBarra varchar(20) primary key,
    preco double precision,
    nome varchar(20),
    descricao varchar(150),
    lote integer,
    diaVal varchar(2),
    mesVal varchar(2),
    anoVal varchar(2),
    diaCompra varchar(2),
    mesCompra varchar(2),
    anoCompra varchar(2)
);
create table produto.roupa(
    codBarra varchar(20) primary key,
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
    codBarra varchar(20) primary key,
    preco double precision,
    nome varchar(20),
    descricao varchar(150),
    lote integer,
    garantia varchar(3),
    diaCompra varchar(2),
    mesCompra varchar(2),
    anoCompra varchar(2)
);

