-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-11-2025 a las 03:26:17
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
  `IDH` int(11) NOT NULL,
  `intensidad_solar` varchar(20) NOT NULL,
  `temperatura_ambiente` int(11) NOT NULL,
  `angulo` int(11) NOT NULL,
  `direccion_sol` varchar(20) NOT NULL,
  `fecha_registro` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `autosustentable`
--

CREATE TABLE `autosustentable` (
  `IDAU` int(11) NOT NULL,
  `IDF` int(11) NOT NULL,
  `eficiencia_termica` double NOT NULL,
  `energia_solar_recibida` varchar(20) NOT NULL,
  `consumo_energetico` int(11) NOT NULL,
  `energia_almacenada` int(11) NOT NULL,
  `fecha_evaluacion` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `funcionamiento`
--

CREATE TABLE `funcionamiento` (
  `IDF` int(11) NOT NULL,
  `IDH` int(11) NOT NULL,
  `temperatura_interna` int(11) NOT NULL,
  `tiempo_coccion` time NOT NULL,
  `tipo_alimento` varchar(50) NOT NULL,
  `estado_horno` varchar(50) NOT NULL,
  `fecha_operacion` date NOT NULL,
  `hora_operacion` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hornos`
--

CREATE TABLE `hornos` (
  `IDH` int(100) NOT NULL,
  `tipo` varchar(25) NOT NULL,
  `materiales` varchar(50) NOT NULL,
  `dimensiones` double NOT NULL,
  `sistema_aislamiento` varchar(30) NOT NULL,
  `reflectores` varchar(50) NOT NULL,
  `fecha_creacion` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mantenimientos`
--

CREATE TABLE `mantenimientos` (
  `IDM` int(11) NOT NULL,
  `IDH` int(11) NOT NULL,
  `detalles_reparacion` varchar(100) NOT NULL,
  `materiales_remplazados` varchar(100) NOT NULL,
  `fecha_creacion` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ambiente`
--
ALTER TABLE `ambiente`
  ADD PRIMARY KEY (`IDAM`),
  ADD KEY `IDH` (`IDH`);

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
  ADD PRIMARY KEY (`IDH`);

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
  MODIFY `IDAM` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `autosustentable`
--
ALTER TABLE `autosustentable`
  MODIFY `IDAU` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `funcionamiento`
--
ALTER TABLE `funcionamiento`
  MODIFY `IDF` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `hornos`
--
ALTER TABLE `hornos`
  MODIFY `IDH` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `mantenimientos`
--
ALTER TABLE `mantenimientos`
  MODIFY `IDM` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ambiente`
--
ALTER TABLE `ambiente`
  ADD CONSTRAINT `ambiente_ibfk_1` FOREIGN KEY (`IDH`) REFERENCES `hornos` (`IDH`) ON DELETE CASCADE;

--
-- Filtros para la tabla `autosustentable`
--
ALTER TABLE `autosustentable`
  ADD CONSTRAINT `autosustentable_ibfk_1` FOREIGN KEY (`IDF`) REFERENCES `funcionamiento` (`IDF`) ON DELETE CASCADE;

--
-- Filtros para la tabla `funcionamiento`
--
ALTER TABLE `funcionamiento`
  ADD CONSTRAINT `funcionamiento_ibfk_1` FOREIGN KEY (`IDH`) REFERENCES `hornos` (`IDH`) ON DELETE CASCADE;

--
-- Filtros para la tabla `mantenimientos`
--
ALTER TABLE `mantenimientos`
  ADD CONSTRAINT `mantenimientos_ibfk_1` FOREIGN KEY (`IDH`) REFERENCES `hornos` (`IDH`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
