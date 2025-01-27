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



--====================================================================

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
    tamaño float,
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


--=============================================================================================

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

--=========================================================================
