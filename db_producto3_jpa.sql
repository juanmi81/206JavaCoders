-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         5.6.27-log - MySQL Community Server (GPL)
-- SO del servidor:              Win64
-- HeidiSQL Versión:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para db_producto3
DROP DATABASE IF EXISTS `db_producto3`;
CREATE DATABASE IF NOT EXISTS `db_producto3` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `db_producto3`;

-- Volcando estructura para tabla db_producto3.articulo
DROP TABLE IF EXISTS `articulo`;
CREATE TABLE IF NOT EXISTS `articulo` (
  `codArticulo` int(11) NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(300) DEFAULT NULL,
  `PVP` double NOT NULL,
  `GastosEnvio` double NOT NULL,
  `TiempoPrep` int(11) NOT NULL,
  PRIMARY KEY (`codArticulo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- Volcando datos para la tabla db_producto3.articulo: ~2 rows (aproximadamente)
DELETE FROM `articulo`;
/*!40000 ALTER TABLE `articulo` DISABLE KEYS */;
INSERT INTO `articulo` (`codArticulo`, `Descripcion`, `PVP`, `GastosEnvio`, `TiempoPrep`) VALUES
	(1, 'des1', 20, 2, 1),
	(2, 'des2', 30, 3, 2),
	(3, 'des', 23, 2, 1);
/*!40000 ALTER TABLE `articulo` ENABLE KEYS */;

-- Volcando estructura para tabla db_producto3.cliente
DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `Email` varchar(100) NOT NULL,
  `NIF` varchar(9) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Direccion` varchar(200) NOT NULL,
  `tipo` varchar(50) NOT NULL DEFAULT '',
  PRIMARY KEY (`Email`),
  UNIQUE KEY `NIF_UNIQUE` (`NIF`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla db_producto3.cliente: ~3 rows (aproximadamente)
DELETE FROM `cliente`;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`Email`, `NIF`, `Nombre`, `Direccion`, `tipo`) VALUES
	('danird@gmail.com', '34', 'Daniel', 'calle1', 'Estandar'),
	('email@gmail.com', '5645345t', 'Paco', 'Dom', 'Premium'),
	('fram@gmail.com', '656', 'Pepe', 'calle2', 'Premium');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Volcando estructura para tabla db_producto3.hibernate_sequence
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla db_producto3.hibernate_sequence: 0 rows
DELETE FROM `hibernate_sequence`;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` (`next_val`) VALUES
	(4);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;

-- Volcando estructura para tabla db_producto3.pedido
DROP TABLE IF EXISTS `pedido`;
CREATE TABLE IF NOT EXISTS `pedido` (
  `numeroPedido` int(11) NOT NULL AUTO_INCREMENT,
  `Cliente` varchar(100) NOT NULL,
  `Articulo` int(11) NOT NULL,
  `CantArticulo` int(11) NOT NULL,
  `FechaHora` datetime NOT NULL,
  PRIMARY KEY (`numeroPedido`),
  KEY `Cliente_idx` (`Cliente`),
  KEY `Articulo_idx` (`Articulo`),
  CONSTRAINT `ArticuloCod` FOREIGN KEY (`Articulo`) REFERENCES `articulo` (`codArticulo`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `ClienteEMail` FOREIGN KEY (`Cliente`) REFERENCES `cliente` (`NIF`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- Volcando datos para la tabla db_producto3.pedido: ~0 rows (aproximadamente)
DELETE FROM `pedido`;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
