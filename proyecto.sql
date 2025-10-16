-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-10-2025 a las 16:27:06
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ambiente`
--

CREATE TABLE `ambiente` (
  `IDAM` int(11) NOT NULL,
  `intensidad_solar` varchar(20) DEFAULT NULL,
  `temperatura_ambiente` int(11) DEFAULT NULL,
  `angulo` int(11) DEFAULT NULL,
  `direccion_sol` varchar(20) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autosustentable`
--

CREATE TABLE `autosustentable` (
  `IDAU` int(11) NOT NULL,
  `IDF` int(11) DEFAULT NULL,
  `eficiencia_termica` double DEFAULT NULL,
  `energia_solar_recibida` varchar(20) DEFAULT NULL,
  `consumo_energetico` int(11) DEFAULT NULL,
  `energia_almacenada` int(11) DEFAULT NULL,
  `fecha_evaluacion` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `funcionamiento`
--

CREATE TABLE `funcionamiento` (
  `IDF` int(11) NOT NULL,
  `IDH` int(11) DEFAULT NULL,
  `temperatura_interna` int(11) DEFAULT NULL,
  `tiempo_coccion` int(11) DEFAULT NULL,
  `tipo_alimento` varchar(50) DEFAULT NULL,
  `estado_horno` varchar(50) DEFAULT NULL,
  `fecha_operacion` date DEFAULT NULL,
  `hora_operacion` time DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hornos`
--

CREATE TABLE `hornos` (
  `IDH` int(100) NOT NULL,
  `IDAM` int(100) DEFAULT NULL,
  `tipo` varchar(25) DEFAULT NULL,
  `materiales` varchar(50) DEFAULT NULL,
  `dimensiones` double DEFAULT NULL,
  `sistema_aislamiento` varchar(30) DEFAULT NULL,
  `reflectores` varchar(50) DEFAULT NULL,
  `fecha_creacion` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mantenimientos`
--

CREATE TABLE `mantenimientos` (
  `IDM` int(11) NOT NULL,
  `IDH` int(11) DEFAULT NULL,
  `detalles_reparacion` varchar(100) DEFAULT NULL,
  `materiales_remplazados` varchar(100) DEFAULT NULL,
  `fecha_creacion` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ambiente`
--
ALTER TABLE `ambiente`
  ADD PRIMARY KEY (`IDAM`);

--
-- Indices de la tabla `autosustentable`
--
ALTER TABLE `autosustentable`
  ADD PRIMARY KEY (`IDAU`),
  ADD KEY `IDF` (`IDF`);

--
-- Indices de la tabla `funcionamiento`
--
ALTER TABLE `funcionamiento`
  ADD PRIMARY KEY (`IDF`),
  ADD KEY `IDH` (`IDH`);

--
-- Indices de la tabla `hornos`
--
ALTER TABLE `hornos`
  ADD PRIMARY KEY (`IDH`),
  ADD UNIQUE KEY `IDAM` (`IDAM`);

--
-- Indices de la tabla `mantenimientos`
--
ALTER TABLE `mantenimientos`
  ADD PRIMARY KEY (`IDM`),
  ADD KEY `IDH` (`IDH`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ambiente`
--
ALTER TABLE `ambiente`
  MODIFY `IDAM` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `autosustentable`
--
ALTER TABLE `autosustentable`
  MODIFY `IDAU` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `funcionamiento`
--
ALTER TABLE `funcionamiento`
  MODIFY `IDF` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `hornos`
--
ALTER TABLE `hornos`
  MODIFY `IDH` int(100) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `mantenimientos`
--
ALTER TABLE `mantenimientos`
  MODIFY `IDM` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `autosustentable`
--
ALTER TABLE `autosustentable`
  ADD CONSTRAINT `autosustentable_ibfk_1` FOREIGN KEY (`IDF`) REFERENCES `funcionamiento` (`IDF`);

--
-- Filtros para la tabla `funcionamiento`
--
ALTER TABLE `funcionamiento`
  ADD CONSTRAINT `funcionamiento_ibfk_1` FOREIGN KEY (`IDH`) REFERENCES `hornos` (`IDH`);

--
-- Filtros para la tabla `mantenimientos`
--
ALTER TABLE `mantenimientos`
  ADD CONSTRAINT `mantenimientos_ibfk_1` FOREIGN KEY (`IDH`) REFERENCES `hornos` (`IDH`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
