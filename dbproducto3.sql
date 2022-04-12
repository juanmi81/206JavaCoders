-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.22-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para db_producto3
DROP DATABASE IF EXISTS `db_producto3`;
CREATE DATABASE IF NOT EXISTS `db_producto3` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `db_producto3`;

-- Volcando estructura para tabla db_producto3.articulo
DROP TABLE IF EXISTS `articulo`;
CREATE TABLE IF NOT EXISTS `articulo` (
  `codArticulo` int(11) NOT NULL AUTO_INCREMENT,
  `Descripción` varchar(300) DEFAULT NULL,
  `PVP` double NOT NULL,
  `GastosEnvio` double NOT NULL,
  `TiempoPrep` int(11) NOT NULL,
  PRIMARY KEY (`codArticulo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla db_producto3.cliente
DROP TABLE IF EXISTS `cliente`;
CREATE TABLE IF NOT EXISTS `cliente` (
  `Email` varchar(100) NOT NULL,
  `NIF` varchar(9) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `Direccion` varchar(200) NOT NULL,
  `isPremium` bit(1) NOT NULL,
  PRIMARY KEY (`Email`),
  UNIQUE KEY `NIF_UNIQUE` (`NIF`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla db_producto3.estandar
DROP TABLE IF EXISTS `estandar`;
CREATE TABLE IF NOT EXISTS `estandar` (
  `Cliente` varchar(100) NOT NULL,
  PRIMARY KEY (`Cliente`),
  CONSTRAINT `Cliente_id` FOREIGN KEY (`Cliente`) REFERENCES `cliente` (`Email`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

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

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla db_producto3.premium
DROP TABLE IF EXISTS `premium`;
CREATE TABLE IF NOT EXISTS `premium` (
  `cliente` varchar(100) NOT NULL,
  `cuota` float DEFAULT NULL,
  `descuento` float DEFAULT NULL,
  PRIMARY KEY (`cliente`) USING BTREE,
  CONSTRAINT `Clienteid` FOREIGN KEY (`Cliente`) REFERENCES `cliente` (`Email`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
