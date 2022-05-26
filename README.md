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
POST   | /persona/crear | Muestra "Contenido de Admin" |  {"nombres":"gerardo","apellidos":"romero uro","email":"jgromerouro@gmail.com","fechanacimiento":"29-11-1990","telefono":"1111","domicilio":"tucumán,argentina","nacionalidad":"argentina","estadocivil":"soltero","acercade":"Me gusta programar","fotoperfil":""}
GET    | /test/usuario | Muestra "Contenido de Persona" | 
DELETE | /test/mod | Muestra "Contenido de Moderador" | 
GET    | /test/admin | Muestra "Contenido de Admin" | 
GET    | /test/admin | Muestra "Contenido de Admin" | 
OU     | /test/admin | Muestra "Contenido de Admin" | 

# Métodos de Habilidad
METODO | #Url de Habilidad | #Acción | #JSON de envio 
--- | --- | --- | --- 
POST   | /habilidad/crear | Muestra "Contenido Público" | 
GET    | /test/usuario | Muestra "Contenido de Usuario" | 
DELETE | /test/mod | Muestra "Contenido de Moderador" | 
GET    | /test/admin | Muestra "Contenido de Admin" | 
GET    | /test/admin | Muestra "Contenido de Admin" | 
OU     | /test/admin | Muestra "Contenido de Admin" | 
