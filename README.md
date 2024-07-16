# Integrantes:
- Álvarez Negrete Asly Del Rocío
- Banchón Plaza Cinthya Gabriela
- Granados Castro Wellington Bernard
- Mejía García Diana Chiquinquirá
- Nivela Mejía José Andrés

# Principios de JPA

En esta tarea, configuramos y creamos una aplicación Spring Boot desde cero para gestionar una colección de productos almacenados en una base de datos PostgreSQL. Esta aplicación permite realizar operaciones CRUD sobre la entidad Producto utilizando JPA para interactuar con la base de datos.

# Parte 1: Configuración del Proyecto

- Crear un Proyecto Spring Boot:

Se utilizo Spring Initializr para configurar el proyecto con Maven, Java, y Spring Boot. Y añadimos las dependencias necesarias: Spring Web, Spring Data JPA, y PostgreSQL Driver.

![Spring Initializr ](https://github.com/user-attachments/assets/deb940b6-d236-458b-92c4-a54c33c70f57)

# Parte 2: Crear la Entidad y el Repositorio

1. Crear la Entidad Producto:

Se creó un paquete llamado model que contiene una clase denominada Producto, la cual representa una entidad en la base de datos. Esta clase Producto incluye los campos id, nombre, descripcion y precio. Para mapear la clase Producto a una tabla en la base de datos, se utilizaron las anotaciones de JPA, como @Entity, @Id y @GeneratedValue

![model 1](https://github.com/user-attachments/assets/63a8e545-ee68-4edb-a87f-0bd7d4ad6055)
![model 2](https://github.com/user-attachments/assets/316e007c-72e4-4095-9087-8b09754386bc)

2. Creación del Repositorio ProductoRepository:

Se creó el paquete repository, dentro del cual se desarrolló la interfaz ProductoRepository que extiende de CrudRepository. Esta interfaz facilita la realización de operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre la entidad Producto. Además, incluye métodos adicionales para buscar productos por Id, nombre y por un rango de precios, tales como findById, findByNombre y findByPrecioBetween.

![repository](https://github.com/user-attachments/assets/8ce147df-ded8-4192-8ad3-93521640c54b)

# Parte 3: Crear el Servicio

- Creación de la Clase ProductoService:

Se creó un paquete llamado service en el proyecto, que contiene la interfaz ProductoService para definir los métodos necesarios para interactuar con los productos. 

![ProductoService](https://github.com/user-attachments/assets/9b29e4ec-89ef-4d1f-9ff4-e60b58768673)

Además, se desarrolló la clase ProductoServiceImpl que implementa esta interfaz, utilizando ProductoRepository para llevar a cabo las operaciones como buscar productos, encontrarlos por ID, buscar por nombre y filtrar por rango de precios (seach, findById, findByNombre, findByPrecioBetween).

![ProductoServiceImpl ](https://github.com/user-attachments/assets/70756f1f-45e2-4d35-893f-2d685bffe1f3)

# Parte 4: Crear el Controlador

- Creación de la Clase ProductoController:

Se creó una clase llamada ProductoController dentro del paquete controller, que define los endpoints REST para gestionar productos. Esta clase utiliza las anotaciones @RestController y @GetMapping para implementar cuatro endpoints: uno para obtener todos los productos (GET /api/productos), otro para obtener un producto por su ID (GET /api/productos/{id}), un tercero para buscar productos por nombre (GET /api/productos/search), y el último para buscar productos dentro de un rango de precios (GET /api/productos/searchByPrecio).

![ProductoController](https://github.com/user-attachments/assets/42278449-afa8-4123-aebf-168b2d0519a1)

# Parte 5: Inicializar la Base de Datos

Se configuró la base de datos en el archivo application.properties para utilizar PostgreSQL.

![application properties](https://github.com/user-attachments/assets/a7a050b0-7553-4310-8aac-8570b4aa1e5c)

Se creó un script SQL para inicializar la tabla producto y cargar datos de prueba en la base de datos. Los datos de prueba incluyen productos como Laptop, Smartphone, Monitor, Teclado y Mouse.

![data sql](https://github.com/user-attachments/assets/abdf764c-0b4f-4638-bede-2e36602a6dbd)

# Parte 6: Ejecutar y Probar la Aplicación

1. Primero ejecutamos la aplicación.
 
![ejecución  ](https://github.com/user-attachments/assets/940babad-e2a5-4ab2-af61-f41b04221c8b)

2. Luego revisamos que se allá hecho la conexión en la base de datos PostgreSQL.

![PostgreSQL](https://github.com/user-attachments/assets/81f5d639-8499-4650-8386-cefe73464d07)

3. Después utilizamos la herramienta Postman para probar los endpoints REST y verificar que todas las funcionalidades funcionan correctamente.

- localhost:8080/api/productos: devuelve todos los productos.

![productos 1](https://github.com/user-attachments/assets/40046607-4bde-48da-a3dc-97512a4f251f)
![productos 2](https://github.com/user-attachments/assets/136e7276-a6bc-4e3b-bcbb-5a3b59048ffb)

- localhost:8080/api/productos/3: busca un producto por id.

![productos id](https://github.com/user-attachments/assets/c8527a01-24f9-46c0-9c41-928835f9e451)

- localhost:8080/api/productos/search?nombre=Smartphone: busca productos por nombre.

![productos nombre](https://github.com/user-attachments/assets/7ceaab23-36c2-4264-ba19-e72074e15a98)

- localhost:8080/api/productos/searchByPrecio?preciomin=40&preciomax=400: busca productos dentro de un rango de precios.

![precio](https://github.com/user-attachments/assets/a78f83b7-c09b-4e74-b864-684e2027515a)
