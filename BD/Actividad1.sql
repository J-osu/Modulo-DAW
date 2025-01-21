use empresa;

ALTER TABLE ediciones
ADD COLUMN id_capacitado VARCHAR(20),
ADD CONSTRAINT fk_ediciones_capacitado FOREIGN KEY (id_capacitado) REFERENCES Capacitado(id);