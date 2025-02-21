create database Alquiler;

use Alquiler;

create table Agencia (
    id int primary key,
    nombre varchar(20),
    direccion varchar(20),
    telefono varchar(15)
);

insert into agencia values (1, 'Agencia 1', 'Calle 1', '123456789');
insert into agencia values (2, 'Agencia 2', 'Calle 2', '987654321');
insert into agencia values (3, 'Agencia 3', 'Calle 3', '456789123');
insert into agencia values (4, 'Agencia 4', 'Calle 4', '321654987');

create table Propietario(
    id int primary key,
    nombre varchar(20),
    apellido1 varchar(20),
    apellido2 varchar(20),
    direccion varchar(20),
    telefono varchar(15)
);

insert into Propietario values (1, 'Propietario 1', 'Apellido 1', 'Apellido 2', 'Calle 1', '123456789');
insert into Propietario values (2, 'Propietario 2', 'Apellido 1', 'Apellido 2', 'Calle 2', '987654321');
insert into Propietario values (3, 'Propietario 3', 'Apellido 1', 'Apellido 2', 'Calle 3', '456789123');
insert into Propietario values (4, 'Propietario 4', 'Apellido 1', 'Apellido 2', 'Calle 4', '321654987');

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

insert into Vivienda values (1, 'Vivienda 1', 1, 12345, 'Poblacion 1', 'Piso 1', 1, 1);
insert into Vivienda values (2, 'Vivienda 2', 2, 54321, 'Poblacion 2', 'Piso 2', 2, 1);
insert into Vivienda values (3, 'Vivienda 3', 3, 98765, 'Poblacion 3', 'Piso 3', 1, 3);
insert into Vivienda values (4, 'Vivienda 4', 4, 67890, 'Poblacion 4', 'Piso 4', 2, 4);

create table Inquilino(
    id int primary key,
    nombre varchar(20),
    apellido1 varchar(20),
    apellido2 varchar(20),
    direccion varchar(20),
    telefono varchar(15),
    fecha_nacimiento date
);

insert into Inquilino values (1, 'Inquilino 1', 'Apellido 1', 'Apellido 2', 'Calle 1', '123456789', '1990-01-01');
insert into Inquilino values (2, 'Inquilino 2', 'Apellido 1', 'Apellido 2', 'Calle 2', '987654321', '1991-02-02');
insert into Inquilino values (3, 'Inquilino 3', 'Apellido 1', 'Apellido 2', 'Calle 3', '456789123', '1992-03-03');
insert into Inquilino values (4, 'Inquilino 4', 'Apellido 1', 'Apellido 2', 'Calle 4', '321654987', '1993-04-04');

create table Alquiler (
    id int primary key,
    fecha_inicio date,
    fecha_fin date,
    fehca_firma date,
    fianza int,
    importe int,
    id_inquilino int,
    id_vivienda int,
    foreign key (id_inquilino) references Inquilino(id),
    foreign key (id_vivienda) references Vivienda(id)
);

insert into Alquiler values (1, '2020-01-01', '2020-12-31', '2020-01-01', 1000, 100000, 1, 1);
insert into Alquiler values (2, '2021-01-01', '2021-12-31', '2021-01-01', 2000, 200000, 2, 2);
insert into Alquiler values (3, '2022-01-01', '2022-12-31', '2022-01-01', 3000, 300000, 3, 3);
insert into Alquiler values (4, '2023-01-01', '2023-12-31', '2023-01-01', 4000, 400000, 4, 4);

create table Renovada(
    id int primary key,
    id_alquiler int,
    foreign key (id_alquiler) references alquiler(id)
);

insert into Renovada values (1, 1);
insert into Renovada values (2, 2);
insert into Renovada values (3, 3);
insert into Renovada values (4, 4);


-- Obtener los alquileres que han sido renovados.
select * from renovada;

--¿Qué propietario tiene más viviendas?