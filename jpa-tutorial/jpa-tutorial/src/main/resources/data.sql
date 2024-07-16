DROP TABLE IF EXISTS producto;

CREATE TABLE producto (
    id SERIAL NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    descripcion VARCHAR(255) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO producto (nombre, descripcion, precio) 
VALUES ('Laptop', 'Laptop de alta gama', 1500.00);

INSERT INTO producto (nombre, descripcion, precio) 
VALUES ('Smartphone', 'Smartphone con cámara de 48MP', 700.00);

INSERT INTO producto (nombre, descripcion, precio) 
VALUES ('Monitor', 'Monitor 4K de 27 pulgadas', 300.00);

INSERT INTO producto (nombre, descripcion, precio) 
VALUES ('Teclado', 'Teclado mecánico retroiluminado', 100.00);

INSERT INTO producto (nombre, descripcion, precio) 
VALUES ('Mouse', 'Mouse inalámbrico ergonómico', 50.00);