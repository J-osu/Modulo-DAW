create database Alquiler;

use Alquiler;

create table Agencia (
    id int primary key,
    nombre varchar(20) not null,
    direccion varchar(20),
    telefono varchar(15)
);
create table Propietario(
    id int primary key,
    nombre varchar(20) not null,
    apellido1 varchar(20),
    apellido2 varchar(20),
    direccion varchar(20),
    telefono varchar(15)
);
create table Vivienda(
    id int primary key,
    descripcion varchar(20),
    numero int,
    codigo_postal int,
    poblacion varchar(20),
    piso varchar(20),
    id_agencia int,
    id_propietario int,
    foreign key (id_propietario) references Propietario(id),
    foreign key (id_agencia) references agencia(id)
);
create table Inquilino(
    id int primary key,
    nombre varchar(20) not null,
    apellido1 varchar(20),
    apellido2 varchar(20),
    direccion varchar(20),
    telefono varchar(15),
    fecha_nacimiento date
);
create table Alquiler (
    id int auto_increment primary key,
    fecha_inicio date not null,
    fecha_fin date not null,
    fehca_firma date,
    fianza int,
    importe int,
    id_inquilino int,
    id_vivienda int,
    foreign key (id_inquilino) references Inquilino(id),
    foreign key (id_vivienda) references Vivienda(id)
);
create table Renovada(
    id int primary key,
    id_alquiler int,
    foreign key (id_alquiler) references alquiler(id)
);