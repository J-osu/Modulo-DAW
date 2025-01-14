create database caso1;
use  caso1;
create table Proveedor(
codigo integer primary key,
direccion varchar,
ciudad varchar,
provincia varchar
);
create table Categoria(
codigo integer primary key,
nombre varchar
);
create table Pieza(
codigo integer primary key,
color varchar,
precio integer,
foreign key (codigo) references Categoria(codigo) on update cascade
);
create table Proveedor_Suministra(
    foreign key (codigo) references Proveedor(codigo)on update cascade
    foreign key (codigo) references Pieza(codigo)on update cascade
);