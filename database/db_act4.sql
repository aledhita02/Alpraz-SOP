-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 08, 2025 at 02:45 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_act4`
--

-- --------------------------------------------------------

--
-- Table structure for table `mproduk`
--

CREATE TABLE `mproduk` (
  `kd_pesanan` varchar(255) NOT NULL,
  `customer` varchar(255) NOT NULL,
  `jenis` varchar(255) NOT NULL,
  `nama_produk` varchar(255) NOT NULL,
  `stok` int(11) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `mproduk`
--

INSERT INTO `mproduk` (`kd_pesanan`, `customer`, `jenis`, `nama_produk`, `stok`, `harga`) VALUES
('INV/002/2024', 'Alessandro P.P.S', 'Handphone', 'Iphone 16 Pro Max', 1, 25000000),
('INV/003/2024', 'C.Advenda Shapire B.', 'Handphone', 'Laptop Macbook Pro M3', 1, 30000000);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
