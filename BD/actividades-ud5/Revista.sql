create database Revista;

use Revista;

create table sucursal (
    codigo int auto_increment primary key,
    direccion varchar(20) not null,
    telefono varchar(15),
    ciudad varchar(20),
    provincia varchar(20)
);
create table empleado (
    id int auto_increment primary key,
    nombre varchar(20) not null,
    puesto varchar(20),
    id_sucursal int,
    foreign key (id_sucursal) references sucursal(id)
);
create table Revista(
    id int auto_increment primary key,
    titulo varchar(20) not null,
    periodicidad varchar(20)
);
create table Sucursal_Publica_Revista(
    codigo_sucursal int not null,
    id_revista int not null,
    primary key (codigo_sucursal, id_revista),
    foreign key (codigo_sucursal) references sucursal(codig),
    foreign key (id_revista) references Revista(id)
);
create table Periodista(
    id int primary key,
    nombre varchar(20) not null,
    apellido1 varchar(20),
    apellido2 varchar(20),
    telefono varchar(15),
    especialidad varchar(20)
);
create table Periodista_escribe_Revista(
    id_periodista int not null,
    id_revista int not null,
    primary key (id_periodista, id_revista),
    foreign key (id_periodista) references Periodista(id),
    foreign key (id_revista) references Revista(id)
);
create table Seccion(
    id int auto_increment primary key,
    titulo varchar(20) not null,
    extension varchar(20),
    numero_registro_revista int,
    foreign key (numero_registro_revista) references Revista(id)
);
create table Ejemplar(
    id int auto_increment primary key,
    numero_ejemplares int,
    numero_paginas int,
    fecha date,
    numero_registro_revista int,
    foreign key (numero_registro_revista) references Revista(id)
);