-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-11-2025 a las 03:51:51
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

--
-- Volcado de datos para la tabla `ambiente`
--

INSERT INTO `ambiente` (`IDAM`, `IDH`, `intensidad_solar`, `temperatura_ambiente`, `angulo`, `direccion_sol`, `fecha_registro`) VALUES
(3, 5, 'Baja', 70, 990, 'Sur', '2025-10-24'),
(4, 8, 'Alta', 20, 20, 'Oeste', '2025-10-11'),
(5, 9, 'Alta', 4, 14, 'Norte', '2025-11-07'),
(6, 10, 'Media', 8, 8, 'Sur', '2025-11-07');

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

--
-- Volcado de datos para la tabla `funcionamiento`
--

INSERT INTO `funcionamiento` (`IDF`, `IDH`, `temperatura_interna`, `tiempo_coccion`, `tipo_alimento`, `estado_horno`, `fecha_operacion`, `hora_operacion`) VALUES
(6, 0, 0, '13:05:38', 'Carnes y Aves', '', '2025-10-10', '13:05:38'),
(7, 0, 0, '13:05:38', 'Carnes y Aves', '', '2025-10-10', '13:05:38'),
(9, 0, 0, '13:05:38', 'Carnes y Aves', '', '2025-10-10', '13:05:38'),
(10, 0, 0, '13:05:38', 'Carnes y Aves', '', '2025-10-10', '13:05:38'),
(13, 7, 7, '06:05:38', 'Carnes y Aves', '', '2025-10-10', '13:05:38'),
(17, 0, 0, '13:57:11', 'Carnes y Aves', '', '2025-10-10', '13:57:12'),
(18, 10, 10, '13:57:11', 'Carnes y Aves', '', '2025-10-10', '13:57:12'),
(26, 8, 16, '14:06:03', 'Carnes y Aves', '', '2025-10-10', '14:06:03'),
(27, 8, 200, '14:06:03', 'Carnes y Aves', '', '2025-10-10', '22:06:03'),
(28, 9, 200, '14:06:03', 'Carnes y Aves', '', '2025-10-10', '22:06:03'),
(29, 9, 200, '14:06:03', 'Carnes y Aves', '', '2025-10-10', '22:06:03'),
(31, 9, 9, '11:09:40', 'Carnes y Aves', '', '2025-11-07', '11:09:40');

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

--
-- Volcado de datos para la tabla `hornos`
--

INSERT INTO `hornos` (`IDH`, `tipo`, `materiales`, `dimensiones`, `sistema_aislamiento`, `reflectores`, `fecha_creacion`) VALUES
(0, '123', '123', 231, '312', '123', '2025-10-10'),
(7, 'wqe', 'nse yoeq', 234, 'Doble cubierta transparente', '3', '2025-10-24'),
(8, '234', '234', 24, 'Doble cubierta transparente', '324', '2025-10-04'),
(9, 'q', '21', 312, 'Aislamiento reflectante', '123', '2025-10-03'),
(10, '21', 'q', 2, 'Doble cubierta transparente', '12', '2025-10-11'),
(11, 'ew', '342', 43, 'Doble cubierta transparente', '234', '2025-11-07'),
(12, 'ew', '342', 43, 'Doble cubierta transparente', '234', '2025-11-07'),
(13, '34', '34', 324, 'Doble cubierta transparente', '234', '2025-11-03');

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
-- Volcado de datos para la tabla `mantenimientos`
--

INSERT INTO `mantenimientos` (`IDM`, `IDH`, `detalles_reparacion`, `materiales_remplazados`, `fecha_creacion`) VALUES
(6, 0, 'a', 'a', '2025-10-03'),
(7, 0, 'a', 'a', '2025-10-03'),
(8, 0, 'a', 'a', '2025-10-03'),
(9, 0, 'yo', '213', '2025-10-03'),
(10, 0, 'yo', '213', '2025-10-03'),
(11, 8, 'eqw', 'qwe', '2025-10-04'),
(13, 9, 'qq', '132', '2025-10-04'),
(15, 7, 'q', '234', '2025-11-07'),
(16, 7, 'q', '234', '2025-11-07'),
(18, 8, 'qqeqw', '321', '2025-11-13'),
(22, 13, '42', '234', '2025-11-01');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ambiente`
--
ALTER TABLE `ambiente`
  ADD PRIMARY KEY (`IDAM`),
  ADD UNIQUE KEY `IDH` (`IDH`);

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
  MODIFY `IDAM` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `autosustentable`
--
ALTER TABLE `autosustentable`
  MODIFY `IDAU` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `funcionamiento`
--
ALTER TABLE `funcionamiento`
  MODIFY `IDF` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `hornos`
--
ALTER TABLE `hornos`
  MODIFY `IDH` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `mantenimientos`
--
ALTER TABLE `mantenimientos`
  MODIFY `IDM` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Restricciones para tablas volcadas
--

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
