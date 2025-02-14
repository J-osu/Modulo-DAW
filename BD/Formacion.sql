create database if not exists Formacion;
use Formacion;
create table Curso(
    id int primary key auto_increment,
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
    id_capacitado int,
    foreign key (id_curso) references Curso(id) on update cascade,
    foreign key (id_capacitado) references Capacitado(id) on update cascade
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
create table Capacitado(
    id_empleado int,
    id_curso int,
    foreign key (id_empleado) references Empleado(id) on update cascade,
    foreign key (id_curso) references Curso(id) on update cascade
);