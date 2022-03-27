CREATE DATABASE  IF NOT EXISTS `db_producto3` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_producto3`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: db_producto3
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `artículo`
--

DROP TABLE IF EXISTS `artículo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `artículo` (
  `codArticulo` int NOT NULL AUTO_INCREMENT,
  `Descripción` varchar(300) DEFAULT NULL,
  `PVP` double NOT NULL,
  `GastosEnvio` double NOT NULL,
  `TiempoPrep` int NOT NULL,
  PRIMARY KEY (`codArticulo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `artículo`
--

LOCK TABLES `artículo` WRITE;
/*!40000 ALTER TABLE `artículo` DISABLE KEYS */;
/*!40000 ALTER TABLE `artículo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clinete`
--

DROP TABLE IF EXISTS `clinete`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clinete` (
  `Email` varchar(100) NOT NULL,
  `NIF` varchar(9) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Dirección` varchar(200) NOT NULL,
  PRIMARY KEY (`Email`),
  UNIQUE KEY `NIF_UNIQUE` (`NIF`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clinete`
--

LOCK TABLES `clinete` WRITE;
/*!40000 ALTER TABLE `clinete` DISABLE KEYS */;
/*!40000 ALTER TABLE `clinete` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedido` (
  `numeroPedido` int NOT NULL AUTO_INCREMENT,
  `Cliente` varchar(100) NOT NULL,
  `Articulo` int NOT NULL,
  `CantArticulo` int NOT NULL,
  `FechaHora` datetime NOT NULL,
  PRIMARY KEY (`numeroPedido`),
  KEY `Cliente_idx` (`Cliente`),
  KEY `Articulo_idx` (`Articulo`),
  CONSTRAINT `ArticuloCod` FOREIGN KEY (`Articulo`) REFERENCES `artículo` (`codArticulo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ClienteEMail` FOREIGN KEY (`Cliente`) REFERENCES `clinete` (`NIF`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'db_producto3'
--

--
-- Dumping routines for database 'db_producto3'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-03-27  1:25:45
