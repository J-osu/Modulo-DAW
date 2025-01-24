create database if not exists parte1;
use parte1;

create table Cliente(
    id int primary key auto_increment,
    nombre varchar(20),
    apellido1 varchar(20),
    apellido2 varchar(20),
    telefono varchar(20),
    direccion varchar(20),
    email varchar(20)
);
create table Autor(
    id int primary key auto_increment,
    nombre varchar(20),
    apellido1 varchar(20),
    apellido2 varchar(20),
    _url varchar(20),
    email varchar(20)
);
create table Editorial(
    id int primary key auto_increment,
    nombre varchar(20),
    _url varchar(20),
    email varchar(20),
    telefono varchar(20),
    direccion varchar(20)
);
create table Almacen(
    id int primary key auto_increment,
    telefono varchar(20),
    direccion varchar(20)
);
create table Cesta(
    id int primary key auto_increment,
    fecha_compra date,
    id_cliente int,
    foreign key (id_cliente) references Cliente(id) on update cascade
);
create table Libro(
    id int primary key auto_increment,
    titulo varchar(20),
    sbn varchar(20),
    ano_publicacion date,
    descripcion varchar(20)
);
create table Almacena(
    stock int,
    id_almacen int,
    id_libro int,
    foreign key (id_almacen) references Almacen(id) on update cascade,
    foreign key (id_libro) references Libro(id) on update cascade
);
create table Contiene(
    cantidad int,
    id_cesta int,
    id_libro int,
    foreign key (id_cesta) references Cesta(id) on update cascade,
    foreign key (id_libro) references Libro(id) on update cascade
);
create table Escribe(
    id_autor int,
    id_libro int,
    foreign key (id_autor) references Autor(id) on update cascade,
    foreign key (id_libro) references Libro(id) on update cascade
);
create table Papel(
    fecha_impresion date,
    precio float,
    lugar_impresion varchar(20),
    id_libro int,
    foreign key (id_libro) references Libro(id) on update cascade
);
create table Digital(
    tamano float,
    precio float,
    id_libro int,
    foreign key (id_libro) references Libro(id) on update cascade
);
create table Publica(
    id_libro int,
    id_editorial int,
    foreign key (id_libro) references Libro(id) on update cascade,
    foreign key (id_editorial) references Editorial(id) on update cascade
);
create table Provincia(
    id int primary key,
    nombre varchar (20),
    id_localidad int,
    foreign key (id_localidad) references Localidad(id) on update cascade
);
create table Localidad(
    id int primary key,
    nombre varchar(20),
    id_cliente int,
    id_autor int,
    id_editorial int,
    id_almacen int,
    foreign key (id_cliente) references Cliente(id) on update cascade,
    foreign key (id_autor) references Autor(id) on update cascade,
    foreign key (id_editorial) references Editorial(id) on update cascade,
    foreign key (id_almacen) references Almacen(id) on update cascade
);


--===================================PARTE2==================================================

create database if not exists parte2;
use parte2;

create table Usuario(
    id int primary key auto_increment
);
create table Canal(
    id int primary key auto_increment,
    nombre varchar(20),
    descripcion varchar(20),
    fecha_creacion date
);
create table Play_list(
    id int primary key auto_increment,
    nombre varchar(20),
    estado varchar(20),
    fecha_creacion date,
    id_usuario int,
    foreign key (id_usuario) references Usuario(id) on update cascade
);
create table Video(
     id int primary key auto_increment
);
create table Comentario(
    id int primary key auto_increment,
    texto varchar(20),
    fecha date,
    id_usuario int,
    id_video int,
    foreign key (id_usuario) references Usuario(id) on update cascade,
    foreign key (id_video) references Video(id) on update cascade
);
create table Etiqueta(
    id int primary key auto_increment,
    nombre varchar(20)
);
create table Video_relacionado(
    id_video int,
    id_video_relacionado int,
    foreign key (id_video) references Video(id) on update cascade,
    foreign key (id_video_relacionado) references Video(id) on update cascade
);
create table Se_suscriben(
    id_canal int,
    id_usuario int,
    foreign key (id_canal) references Canal(id) on update cascade,
    foreign key (id_usuario) references Usuario(id) on update cascade
);
create table Valora_video(
    fecha_hora date,
    valoracion int,
    id_usuario int,
    id_video int,
    foreign key (id_usuario) references Usuario(id) on update cascade,
    foreign key (id_video) references Video(id) on update cascade
);
create table Valora_comentario(
    fecha_hora date,
    valoracion int,
    id_usuario int,
    id_comentario int,
    foreign key (id_usuario) references Usuario(id) on update cascade,
    foreign key (id_comentario) references Comentario(id) on update cascade
);
create table Tiene_etiqueta(
    id_video int,
    id_etiqueta int,
    foreign key (id_video) references Video(id) on update cascade,
    foreign key (id_etiqueta) references Etiqueta(id) on update cascade
);
create table Tiene_video(
    id_video int,
    id_play_list int,
    foreign key (id_video) references Video(id) on update cascade,
    foreign key (id_play_list) references Play_list(id) on update cascade
);


--==============================EJERCICIOS======================================
--Crea una copia de la tabla libro_ebook que se llame libro_pdf
use parte1;
create table libro_pdf like digital;

--Renombra la tabla Editorial a Editoriales
rename table Editorial to Editoriales;

/*Modifica el campo cantidad de la tabla cestaContieneLibros (o como la hayas
llamado) para que el valor por defecto sea 1 y se compruebe que NO puede ser
negativo */

alter table Contiene modify cantidad int default 1 not null;

--Elimina en el orden correcto la tabla Libro

alter table almacena
	drop constraint almacena_ibfk_2;
alter table contiene
	drop constraint contiene_ibfk_2;
alter table publica
	drop constraint publica_ibfk_1;
alter table escribe
	drop constraint escribe_ibfk_2;
alter table papel
	drop constraint papel_ibfk_1;
alter table digital
	drop constraint digital_ibfk_1;
drop table Libro;

/*Elimina la restricción de clave externa de id_cliente de la tabla Cesta y añádela de
nuevo con opción de actualizar en las tablas con FK*/
alter table Cesta
	drop constraint Cesta_ibfk_1;

alter table Cesta
	add constraint Cesta_ibfk_1 foreign key (id_cliente) references Cliente(id) on update cascade;

/*Introduce un campo “descuento” en Cesta entre id y fecha_compra con un valor por
defecto del 0,05*/
alter table Cesta
	add descuento float default 0.05 not null;
alter table Cesta
    ALTER TABLE parte1.cesta CHANGE descuento descuento float DEFAULT 0.05 NOT NULL AFTER id;

/*Crea un índice en la tabla Cliente sobre los campos id y email*/
create index indice_cliente on Cliente(id, email);

/*Crea una vista de la tabla Almacén con: select telefono, direccion from Almacen.*/
create view vista_almacen as select telefono, direccion from Almacen;

/*Crea un campo “población” de tipo varchar(30) en la tabla Cliente entre los campos
dirección y email*/
alter table Cliente
	add poblacion varchar(30) after direccion;

/*Quita la clave primaria de Digital y después coloca una nueva donde todos sus
atributos sean clave primaria*/
alter table Digital
	drop primary key;

alter table Digital
	add primary key (id_libro);

/*Cambia el nombre del campo ano_publicación en Libro por fechaPublicacion*/
alter table Libro
    rename column ano_publicacion to fechaPublicacion;

/*Coloca un campo “licencia” como char(3) en la tabla Ebook al principio.*/
alter table libro_pdf
	add licencia char(3) first;

/*Cambia el nombre de atributo teléfono de las tablas por teléfono_fijo y añade
restricciones de valor por defecto 950123456 y que no pueda ser nulo*/
alter table Almacen
    rename column telefono to telefono_fijo;
alter table Almacen
    modify telefono_fijo int default 950123456 not null;
alter table cliente
    rename column telefono to telefono_fijo;
alter table cliente
    modify telefono_fijo int default 950123456 not null;
alter table editoriales
    rename column telefono to telefono_fijo;
alter table editoriales
    modify telefono_fijo int default 950123456 not null;