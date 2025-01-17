create database if not exists caso4;
use  caso4;
create table Agencia(
id int primary key,
nombre varchar(20),
direccion varchar(40),
telefono varchar(8)
);
create table Propietario(
    id int primary key,
    nombre varchar(20),
    apellido varchar(20),
    direccion varchar(40),
    telefono varchar(8)
    email varchar(30)
);
create table Vivienda(
    id int primary key,
    calle varchar(20),
    numero int,
    codigo_postal int,
    piso int,
    poblacion int,
    
    id_propietario int,
    foreign key (id_propietario) references Propietario(id)
);