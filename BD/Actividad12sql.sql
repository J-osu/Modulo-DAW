use parte1;


alter table cliente
    rename column telefono to telefono_fijo;
alter table cliente
    modify telefono_fijo int default 950123456 not null;
alter table editoriales
    rename column telefono to telefono_fijo;
alter table editoriales
    modify telefono_fijo int default 950123456 not null;