# Backend Portfolio Argentina Programa
Spring-boot del Backend Portfolio Argentina Programa

# Llamadas a la API

URL -> https://www.backendargentinaprograma.heroku.com/api/

# Métodos de Usuario

METODO | #Url de Usuario | #Acción | #JSON de envio 
--- | --- | --- | --- 
POST | /auth/login | Iniciar sesión de usuario ADMIN | {"username":"admin","password":"123456"}
POST | /auth/login | Iniciar sesión de usuario USUARIO | {"username":"usuario","password":"123456"}
POST | /auth/registrar | Registrar un usuario FULL permiso | {"username":"admin","password":"123456","email":"admin@admin.com","rol":["ADMIN","USUARIO"],"nombres":"gerardo","apellidos":"romero","telefono":"222222","domicilio":"micasa","nacionalidad":"argentina","fotoperfil":""}
POST | /auth/logout | Cerrar sesión de usuario | 

# Métodos de Test
METODO | #Url de Test | #Acción | #JSON de envio 
--- | --- | --- | --- 
GET | /test/publico | Muestra "Contenido Público" | 
GET | /test/usuario | Muestra "Contenido de Usuario" |  
GET | /test/admin | Muestra "Contenido de Admin" | 

# Métodos de Imagen
METODO | #Url de Imagen | #Acción | #JSON de envio 
---  | --- | --- | --- 
POST | /test/upload | Cargar una imagen y se guarda en la carpeta uploads | form-data -> key: file && value: select files (POSTMAN)
GET  | /test/files | Muestra listado de imagenes (nombre y URL) | 
GET  | /test/filesget/{filename:...} | Muestra la imagen dada por la URL
GET  | /test/files/{filename:...} | Descarga la imagen dada por la URL  

# Métodos de Persona
METODO | #Url de Persona | #Acción | #JSON de envio 
--- | --- | --- | --- 
POST   | /persona/crear | Agregar nueva persona "admin" |  {"nombres":"gerardo","apellidos":"romero uro","email":"jgromerouro@gmail.com","fechanacimiento":"29-11-1990","telefono":"1111","domicilio":"tucumán,argentina","nacionalidad":"argentina","estadocivil":"soltero","acercade":"Me gusta programar","fotoperfil":""}
GET    | /persona/traer | Muestra "Contenido de Persona" todos | 
PUT    | /persona/editar/:id | Edita Persona "Admin" | 
DELETE | /persona/borrar/:id | Elimina persona "Admin" | 
GET    | /persona/buscar/:id | Busca una persona por id | 
GET     | /persona/buscar/:nombre | Buscar una persona por su nombre | 

# Métodos de Persona
METODO | #Url de Habilidad | #Acción | #JSON de envio 
--- | --- | --- | --- 
POST   | /habilidad/crear | Agregar nueva habilidad "admin" |  {"habilidad":"desarrollador Full Stack","porcentaje_habilidad":"80","persona":"1"}
GET    | /habilidad/traer | Muestra "Contenido de habilidad" todos | 
PUT    | /habilidad/editar/:id | Edita habilidad "Admin" | {lo mismo que el POST pero agrengando idPersona}
DELETE | /habilidad/borrar/:id | Elimina habilidad "Admin" | 
GET    | /habilidad/buscar/:id | Busca una habilidad por id | 
GET     | /habilidad/buscar/:nombre | Buscar una habilidad por su nombre | 

# Métodos de Educación
METODO | #Url de Educacion | #Acción | #JSON de envio 
--- | --- | --- | --- 
POST   | /educacion/crear | Agregar nueva educacion "admin" |  {"institucion":"Argentina Programa","titulo":"#SeProgramar","fechaInicio":"01-11-2021","fechaFin":"31-05-2022","porcentaje_carrera":90,"usuario":1}
GET    | /educacion/traer | Muestra "Contenido de educacion" todos | 
PUT    | /educacion/editar/:id | Edita educacion "Admin" | {lo mismo que el POST pero agrengando idEducacion}
DELETE | /educacion/borrar/:id | Elimina educacion "Admin" | 
GET    | /educacion/buscar/:id | Busca una educacion por id | 
GET     | /educacion/buscar/:nombre | Buscar una educacion por su nombre | 

# Métodos de Proyecto
METODO | #Url de Proyecto | #Acción | #JSON de envio 
--- | --- | --- | --- 
POST   | /proyecto/crear | Agregar nueva proyecto "admin" |  {"proyecto":"backendo-portfolio","tecnologia":"Spring boot Java","linkimagen":"link del logo del argentina programa","persona":1}
GET    | /proyecto/traer | Muestra "Contenido de proyecto" todos | 
PUT    | /proyecto/editar/:id | Edita proyecto "Admin" | {lo mismo que el POST pero agrengando idProyecto}
DELETE | /proyecto/borrar/:id | Elimina proyecto "Admin" | 
GET    | /proyecto/buscar/:id | Busca una proyecto por id | 
GET     | /proyecto/buscar/:nombre | Buscar una proyecto por su nombre | 

# Métodos de Experiencias Laborales
METODO | #Url de Experiencias Laborales | #Acción | #JSON de envio 
--- | --- | --- | --- 
POST   | /experiencialaboral/crear | Agregar nueva proyecto "admin" |  {"empresa":"casa","puesto":"reparador de PC","fechaInicio":"1-12-2010","fechaFin":"","descripcionTareas":"reparador de PC y Notebook","persona":1}
GET    | /experiencialaboral/traer | Muestra "Contenido de experiencia laboral" todos | 
PUT    | /experiencialaboral/editar/:id | Edita experiencia laboral "Admin" | {lo mismo que el POST pero agrengando idExperiencialaboral}
DELETE | /experiencialaboral/borrar/:id | Elimina experiencia laboral "Admin" | 
GET    | /experiencialaboral/buscar/:id | Busca una experiencia laboral por id | 
GET     | /experiencialaboral/buscar/:nombre | Buscar una experiencia laboral por su nombre | 
