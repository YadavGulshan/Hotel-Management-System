-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 29, 2021 at 09:35 AM
-- Server version: 10.6.5-MariaDB
-- PHP Version: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `Current User`
--

CREATE TABLE `Current User` (
  `Id` int(11) NOT NULL,
  `Room Number` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Phone` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Address` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `CheckIn` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Bill Amount` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `Current User`
--

INSERT INTO `Current User` (`Id`, `Room Number`, `Name`, `Phone`, `Email`, `Address`, `CheckIn`, `Bill Amount`) VALUES
(6, '202', 'Ramesh Mahajan', '1234567890', 'ramesh@mail.com', 'Pune, Maharashtra', '2021-11-29', '2000'),
(7, '122', 'Raja Ram Bhanushali', '9283028434', 'raja@mail.com', 'Jaipur, Rajasthan', '2021-11-29', '5000');

-- --------------------------------------------------------

--
-- Table structure for table `History`
--

CREATE TABLE `History` (
  `Id` int(11) NOT NULL,
  `Name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Phone` int(11) NOT NULL,
  `Email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Address` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `RoomNumber` int(200) NOT NULL,
  `Check In Date` datetime NOT NULL,
  `Check out date` datetime NOT NULL,
  `Bill amount` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `History`
--

INSERT INTO `History` (`Id`, `Name`, `Phone`, `Email`, `Address`, `RoomNumber`, `Check In Date`, `Check out date`, `Bill amount`) VALUES
(5, 'Ramesh', 1234567890, 'ramesh@mail.com', 'Thane, Maharastra', 101, '2021-11-28 00:00:00', '2021-11-28 00:00:00', 2000);

-- --------------------------------------------------------

--
-- Table structure for table `Receptionist`
--

CREATE TABLE `Receptionist` (
  `E_id` int(11) NOT NULL,
  `Name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Phone` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Email` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Address` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
  `is_Admin` int(1) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `Receptionist`
--

INSERT INTO `Receptionist` (`E_id`, `Name`, `Phone`, `Email`, `password`, `Address`, `is_Admin`) VALUES
(69, 'Admin', 'admin', 'admin', 'admin', 'Admin', 1),
(101, 'rahul', '1234567890', 'rahul@mail.com', '1234', 'Bhiwandi thane', 0);

-- --------------------------------------------------------

--
-- Table structure for table `rooms`
--

CREATE TABLE `rooms` (
  `roomNumber` int(11) NOT NULL,
  `roomType` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `bed` varchar(20) COLLATE utf8mb4_unicode_ci NOT NULL,
  `price` int(11) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `rooms`
--

INSERT INTO `rooms` (`roomNumber`, `roomType`, `bed`, `price`, `status`) VALUES
(101, 'Normal', 'Single', 1000, 0),
(102, 'VIP', 'Double', 3000, 0),
(103, 'Normal', 'Triple', 3000, 0),
(104, 'VIP', 'Single', 2000, 0),
(105, 'Normal', 'Single', 1000, 0),
(106, 'Economy', 'Single', 2000, 0),
(107, 'Economy', 'Single', 2000, 0),
(112, 'Economy', 'Double', 3000, 0),
(113, 'Economy', 'Double', 3000, 0),
(114, 'Economy', 'Triple', 4000, 0),
(115, 'Economy', 'Triple', 4000, 0),
(116, 'Economy', 'Triple', 4000, 0),
(117, 'Economy', 'Triple', 4000, 0),
(118, 'Economy', 'Triple', 4000, 0),
(119, 'VIP', 'Single', 3000, 0),
(120, 'VIP', 'Double', 4000, 0),
(121, 'VIP', 'Double', 4000, 0),
(122, 'VIP', 'Triple', 5000, 1),
(123, 'VIP', 'Triple', 5000, 0),
(124, 'Normal', 'Triple', 3000, 0),
(125, 'Normal', 'Triple', 3000, 0),
(201, 'Normal', 'Single', 1000, 0),
(202, 'Normal', 'Double', 2000, 1),
(203, 'Normal', 'Double', 2000, 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `Current User`
--
ALTER TABLE `Current User`
  ADD UNIQUE KEY `Id` (`Id`),
  ADD UNIQUE KEY `Room Number` (`Room Number`);

--
-- Indexes for table `History`
--
ALTER TABLE `History`
  ADD UNIQUE KEY `Id` (`Id`);

--
-- Indexes for table `Receptionist`
--
ALTER TABLE `Receptionist`
  ADD UNIQUE KEY `E_id` (`E_id`);

--
-- Indexes for table `rooms`
--
ALTER TABLE `rooms`
  ADD UNIQUE KEY `roomNumber` (`roomNumber`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `Current User`
--
ALTER TABLE `Current User`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `Receptionist`
--
ALTER TABLE `Receptionist`
  MODIFY `E_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=102;

--
-- AUTO_INCREMENT for table `rooms`
--
ALTER TABLE `rooms`
  MODIFY `roomNumber` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=204;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
