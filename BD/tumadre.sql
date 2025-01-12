create database tusmuertos;
use  tusmuertos;
create table  vehiculos(
id int primary key auto_increment,
placa varchar(10) not null,
marca varchar(20) not null,
modelo varchar(20) not null,
color varchar(20) not null,
tipo varchar(20) not null,
id_propietario int not null,
foreign key (id_propietario) references propietarios(id)
);
create table propietarios(
id int primary key auto_increment,
nombre varchar(30) not null,
apellido varchar(30) not null,
direccion varchar(30) not null,
telefono varchar(30) not null,
email varchar(30) not null
);