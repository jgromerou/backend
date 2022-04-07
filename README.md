# Backend Portfolio Argentina Programa
Spring-boot del Backend Portfolio Argentina Programa

# Llamadas a la API

URL -> https://www.backendargentinaprograma.heroku.com/api/

#Métodos de Usuario

METODO | #Url de Usuario | #Acción | #JSON de envio 
--- | --- | --- | --- 
POST | /auth/login | Iniciar sesión de usuario ADMIN | {"username":"admin","password":"123456"}
POST | /auth/login | Iniciar sesión de usuario MOD | {"username":"mod","password":"123456"}
POST | /auth/login | Iniciar sesión de usuario USUARIO | {"username":"usuario","password":"123456"}
POST | /auth/registrar | Registrar un usuario FULL permiso | {"username":"admin","password":"123456","email":"admin@admin.com","rol":["ADMIN","MOD","USUARIO"],"nombres":"gerardo","apellidos":"romero","telefono":"222222","domicilio":"micasa","nacionalidad":"argentina","fotoperfil":""}
POST | /auth/logout | Cerrar sesión de usuario | 

#Métodos de Test
METODO | #Url de Test | #Acción | #JSON de envio 
--- | --- | --- | --- 
GET | /test/publico | Muestra "Contenido Público" | 
GET | /test/usuario | Muestra "Contenido de Usuario" | 
GET | /test/mod | Muestra "Contenido de Moderador" | 
GET | /test/admin | Muestra "Contenido de Admin" | 
