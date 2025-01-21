create database if not exists concesionario;
use concesionario;
create table Marca(
    id int primary key auto_increment,
    nombre varchar(20)
);
create table Modelo(
    id int primary key auto_increment,
    nombre varchar(20),
    id_marca int,
    foreign key (id_marca) references Marca(id) on update cascade
);
create table Version(
    id int primary key auto_increment,
    nombre varchar(20),
    potencia varchar(20),
    precio_base int,
    tipo_combustible varchar(15),
    id_modelo int,
    foreign key (id_modelo) references Modelo(id) on update cascade
);
create table Extra(
    id int primary key auto_increment,
    nombre varchar(20),
    descripcion varchar(20)
);
create table Tiene(
    precio int,
    id_version int,
    id_extra int,
    foreign key (id_version) references Version(id) on update cascade,
    foreign key (id_extra) references Extra(id) on update cascade
);
create table Cliente(
    id int primary key auto_increment,
    nombre varchar(20),
    apellido1 varchar(20),
    apellido2 varchar(20),
    telefono varchar(20),
    direccion varchar(20)
);
create table Coche_usado(
    id int primary key auto_increment,
    matricula varchar(20),
    nombre varchar(20),
    precio_tasacion int,
    fecha_entrega date,
    id_modelo int,
    id_cliente int,
    foreign key (id_modelo) references Modelo(id) on update cascade,
    foreign key (id_cliente) references Cliente(id) on update cascade
);
create table Vendedor(
    id int primary key auto_increment,
    nombre varchar(20),
    apellido1 varchar(20),
    apellido2 varchar(20),
    telefono varchar(20),
    direccion varchar(20)
);
create table Coche_nuevo(
    id int primary key auto_increment,
    matricula varchar(20),
    nombre varchar(20),
    id_version int,
    foreign key (id_version) references Version(id) on update cascade
);
create table Compra(
    id int primary key auto_increment,
    fecha date,
    id_vendedor int,
    id_coche_nuevo int,
    id_cliente int,
    foreign key (id_cliente) references Cliente(id) on update cascade,
    foreign key (id_vendedor) references Vendedor(id) on update cascade,
    foreign key (id_coche_nuevo) references Coche_nuevo(id) on update cascade
);
create table Coche_nuevo_Tiene_Extra(
    id_coche_nuevo int,
    id_extra int,
    foreign key (id_coche_nuevo) references Coche_nuevo(id) on update cascade,
    foreign key (id_extra) references Extra(id) on update cascade
);

--=============================Ejercicio 2==============================================

create database if not exists empresa;
use empresa;
create table Curso(
    id primary key auto_increment,
    nombre varchar(20),
    descripcion varchar(20),
    duracion varchar(20),
    coste int
);
create table Es_prerrequisito(
    es_obligatosio char(2),
    id_curso int,
    id_curso_prerrequisito int,
    foreign key (id_curso) references Curso(id) on update cascade,
    foreign key (id_curso_prerrequisito) references Curso(id) on update cascade
);
create table Edicion(
    id int primary key auto_increment,
    fecha_inicio date,
    fecha_fin date,
    horario varchar(20),
    lugar varchar(20),
    id_curso int,
    foreign key (id_curso) references Curso(id) on update cascade
);
create table Empleado(
    id int primary key auto_increment,
    nombre varchar(20),
    apellido1 varchar(20),
    apellido2 varchar(20),
    telefono varchar(20),
    direccion varchar(20),
    tipo varchar(20)
);
create table Recibe(
    id_empleado int,
    id_edicion int,
    foreign key (id_empleado) references Empleado(id) on update cascade,
    foreign key (id_edicion) references Edicion(id) on update cascade
);