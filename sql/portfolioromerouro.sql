-- MySQL dump 10.13  Distrib 8.0.25, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: portfolioargentinaprograma
-- ------------------------------------------------------
-- Server version	8.0.19-0ubuntu5

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `educacion`
--

DROP TABLE IF EXISTS `educacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `educacion` (
  `id_educacion` bigint NOT NULL AUTO_INCREMENT,
  `fecha_fin` varchar(255) DEFAULT NULL,
  `fecha_inicio` varchar(255) NOT NULL,
  `institucion` varchar(40) NOT NULL,
  `porcentaje_carrera` int NOT NULL,
  `titulo` varchar(40) NOT NULL,
  `id_persona` bigint DEFAULT NULL,
  `linkimagen` varchar(254) NOT NULL,
  PRIMARY KEY (`id_educacion`),
  KEY `FKi8xegjxjomldkv2ea4w6yb2md` (`id_persona`),
  CONSTRAINT `FKi8xegjxjomldkv2ea4w6yb2md` FOREIGN KEY (`id_persona`) REFERENCES `personas` (`id_persona`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `educacion`
--

LOCK TABLES `educacion` WRITE;
/*!40000 ALTER TABLE `educacion` DISABLE KEYS */;
INSERT INTO `educacion` VALUES (1,'2021-10-31T03:00:00.000Z','2021-08-01T03:00:00.000Z','Argentina Programa',100,'#Se programar',1,'https://yt3.ggpht.com/9upo5zbtXzvItj8IMHF1X9hI95x4YOeGCApLk1DhMQCHftmJvf2GWmbJXrC1TKCrn-AyQ2txBw=s900-c-k-c0x00ffffff-no-rj'),(3,'2022-05-31T03:00:00.000Z','2021-11-01T03:00:00.000Z','Argentina Programa',95,'#Yo Programa',1,'https://yt3.ggpht.com/9upo5zbtXzvItj8IMHF1X9hI95x4YOeGCApLk1DhMQCHftmJvf2GWmbJXrC1TKCrn-AyQ2txBw=s900-c-k-c0x00ffffff-no-rj'),(4,'2022-01-15T03:00:00.000Z','2021-05-11T03:00:00.000Z','coderhouse',100,'Curso Vue Js',1,'https://club.movistar.com.ar/system/coupons/3336_original.jpg?1640291668'),(5,'2022-05-29T03:00:00.000Z','2022-03-01T03:00:00.000Z','coderhouse',95,'Curso Angular',1,'https://club.movistar.com.ar/system/coupons/3336_original.jpg?1640291668');
/*!40000 ALTER TABLE `educacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `experienciaslaborales`
--

DROP TABLE IF EXISTS `experienciaslaborales`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `experienciaslaborales` (
  `id_experiencia_laboral` bigint NOT NULL AUTO_INCREMENT,
  `descripcion_tareas` varchar(255) NOT NULL,
  `empresa` varchar(50) NOT NULL,
  `fecha_fin` varchar(40) DEFAULT NULL,
  `fecha_inicio` varchar(40) NOT NULL,
  `puesto` varchar(255) NOT NULL,
  `id_persona` bigint DEFAULT NULL,
  PRIMARY KEY (`id_experiencia_laboral`),
  KEY `FKgj3niglyx19cvhlepmrjfn5xj` (`id_persona`),
  CONSTRAINT `FKgj3niglyx19cvhlepmrjfn5xj` FOREIGN KEY (`id_persona`) REFERENCES `personas` (`id_persona`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `experienciaslaborales`
--

LOCK TABLES `experienciaslaborales` WRITE;
/*!40000 ALTER TABLE `experienciaslaborales` DISABLE KEYS */;
INSERT INTO `experienciaslaborales` VALUES (2,'Servicios Infórmaticos','Dirección Provincial de Vialidad Tucumán','','2019-02-01T03:00:00.000Z','Administrativo',1),(3,'Reparar Pc de Escritorios y Notebooks','Por mi cuenta','','2018-11-01T03:00:00.000Z','Reparación de Pc',1);
/*!40000 ALTER TABLE `experienciaslaborales` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habilidades`
--

DROP TABLE IF EXISTS `habilidades`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `habilidades` (
  `id_habilidad` bigint NOT NULL AUTO_INCREMENT,
  `habilidad` varchar(40) NOT NULL,
  `porcentaje_habilidad` int NOT NULL,
  `id_persona` bigint DEFAULT NULL,
  PRIMARY KEY (`id_habilidad`),
  UNIQUE KEY `UKjlrvfo77f892y1288g8o5nbq6` (`habilidad`),
  KEY `FKe3kawc3hars7x7we4c4q20jpc` (`id_persona`),
  CONSTRAINT `FKe3kawc3hars7x7we4c4q20jpc` FOREIGN KEY (`id_persona`) REFERENCES `personas` (`id_persona`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habilidades`
--

LOCK TABLES `habilidades` WRITE;
/*!40000 ALTER TABLE `habilidades` DISABLE KEYS */;
INSERT INTO `habilidades` VALUES (1,'Desarrollo de backend Spring Boot',80,NULL),(2,'Desarrollo de frontend Angular',85,NULL),(3,'desarrollador de base de datos MySQL',85,NULL),(5,'Git',65,NULL),(6,'Desarrollo de frontend Vue js',75,1);
/*!40000 ALTER TABLE `habilidades` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `personas`
--

DROP TABLE IF EXISTS `personas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `personas` (
  `id_persona` bigint NOT NULL AUTO_INCREMENT,
  `acercade` varchar(255) NOT NULL,
  `apellidos` varchar(40) NOT NULL,
  `domicilio` varchar(60) NOT NULL,
  `email` varchar(100) NOT NULL,
  `estadocivil` varchar(40) NOT NULL,
  `fechanacimiento` varchar(255) NOT NULL,
  `foto_perfil` varchar(100) DEFAULT NULL,
  `nacionalidad` varchar(40) NOT NULL,
  `nombres` varchar(40) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  PRIMARY KEY (`id_persona`),
  UNIQUE KEY `UKlrw7flsg11d8nhgyvueqtnp8e` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `personas`
--

LOCK TABLES `personas` WRITE;
/*!40000 ALTER TABLE `personas` DISABLE KEYS */;
INSERT INTO `personas` VALUES (1,'Me interesa la programación','Romero Uro','Tucumán, Argentina','jgromerouro@gmail.com','soltero','1990-11-29T02:00:00.000Z','fotoPerfil20220525222357.webp','Argentina','Juan Gerardo','381-3845430'),(2,'Me interesa la programación','perez','leales','fabip@gmail.com','soltero','1993-12-23 00:00:00.000000','prueba55','argentina','fabian','111111');
/*!40000 ALTER TABLE `personas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proyectos`
--

DROP TABLE IF EXISTS `proyectos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proyectos` (
  `id_proyecto` bigint NOT NULL AUTO_INCREMENT,
  `proyecto` varchar(40) NOT NULL,
  `tecnologia` varchar(40) NOT NULL,
  `id_persona` bigint DEFAULT NULL,
  `linkrepositorio` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`id_proyecto`),
  KEY `FKrvply3kkwwscqqrw41bc9b0kg` (`id_persona`),
  CONSTRAINT `FKrvply3kkwwscqqrw41bc9b0kg` FOREIGN KEY (`id_persona`) REFERENCES `personas` (`id_persona`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proyectos`
--

LOCK TABLES `proyectos` WRITE;
/*!40000 ALTER TABLE `proyectos` DISABLE KEYS */;
INSERT INTO `proyectos` VALUES (1,'Backend #YO PROGRAMO Argentina Programa','Angular 13, Spring boot java, Mysql',NULL,'https://github.com/jgromerou/backend'),(3,'Frontend #YO PROGRAMO Argentina Programa','Angular 13, Spring Boot Java, MySQL',NULL,'https://github.com/jgromerou/frontend-portfolio'),(14,'Curso Vue Js','Vue Js',1,'https://github.com/jgromerou/proyecto-final-romerouro'),(15,'Curso Angular','Angular, Angular Material',1,'https://github.com/jgromerou/PF-RomeroUro');
/*!40000 ALTER TABLE `proyectos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `roles`
--

DROP TABLE IF EXISTS `roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `roles` (
  `id_rol` int NOT NULL AUTO_INCREMENT,
  `rol` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_rol`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `roles`
--

LOCK TABLES `roles` WRITE;
/*!40000 ALTER TABLE `roles` DISABLE KEYS */;
INSERT INTO `roles` VALUES (1,'ROLE_USUARIO'),(2,'ROLE_ADMIN');
/*!40000 ALTER TABLE `roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id_usuario` bigint NOT NULL AUTO_INCREMENT,
  `password` varchar(100) NOT NULL,
  `username` varchar(40) NOT NULL,
  PRIMARY KEY (`id_usuario`),
  UNIQUE KEY `UKm2dvbwfge291euvmk6vkkocao` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'$2a$10$GxZtgfH2HUQuLiRY7wiQNeaBz.K9.XVQgM97CISqDu3iX1M6Wr9IW','admin'),(2,'$2a$10$g0RRJNGa3tB1jPjXfpc8mO8OJpRoVia8BmvtjVLpn20j1C9wlpeya','usuario');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios_roles`
--

DROP TABLE IF EXISTS `usuarios_roles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios_roles` (
  `id_usuario` bigint NOT NULL,
  `id_rol` int NOT NULL,
  PRIMARY KEY (`id_usuario`,`id_rol`),
  KEY `FKhcbndx0dnk4c3ww8jfg98k7el` (`id_rol`),
  CONSTRAINT `FKhcbndx0dnk4c3ww8jfg98k7el` FOREIGN KEY (`id_rol`) REFERENCES `roles` (`id_rol`),
  CONSTRAINT `FKt5th9sao5wjukq9ij7154ktuw` FOREIGN KEY (`id_usuario`) REFERENCES `usuarios` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios_roles`
--

LOCK TABLES `usuarios_roles` WRITE;
/*!40000 ALTER TABLE `usuarios_roles` DISABLE KEYS */;
INSERT INTO `usuarios_roles` VALUES (2,1),(1,2);
/*!40000 ALTER TABLE `usuarios_roles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'portfolioargentinaprograma'
--

--
-- Dumping routines for database 'portfolioargentinaprograma'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-25 22:36:41
