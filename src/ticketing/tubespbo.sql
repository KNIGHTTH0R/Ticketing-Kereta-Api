-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: May 06, 2016 at 03:36 PM
-- Server version: 5.6.20
-- PHP Version: 5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `tubespbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `gerbong`
--

CREATE TABLE IF NOT EXISTS `gerbong` (
  `namaGerbong` varchar(20) NOT NULL,
  `panjang` int(11) NOT NULL,
  `lebar` int(11) NOT NULL,
  `pilPan` int(11) NOT NULL,
  `pilLeb` int(11) NOT NULL,
  `noKereta` varchar(20) NOT NULL,
`noGerbong` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=28 ;

--
-- Dumping data for table `gerbong`
--

INSERT INTO `gerbong` (`namaGerbong`, `panjang`, `lebar`, `pilPan`, `pilLeb`, `noKereta`, `noGerbong`) VALUES
('Ekonomi', 12, 3, 0, 0, '1', 20),
('Bisnis', 11, 2, 9, 0, '1', 21),
('Ekonomi', 12, 2, 0, 0, '3', 26);

-- --------------------------------------------------------

--
-- Table structure for table `kereta`
--

CREATE TABLE IF NOT EXISTS `kereta` (
  `noKereta` varchar(20) NOT NULL,
  `namaKereta` varchar(20) NOT NULL,
  `namaMasinis` varchar(20) NOT NULL,
  `maxGerbong` int(11) NOT NULL,
  `nGerbong` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kereta`
--

INSERT INTO `kereta` (`noKereta`, `namaKereta`, `namaMasinis`, `maxGerbong`, `nGerbong`) VALUES
('1', 'sancaka', 'mala', 3, 2),
('3', 'sanjayabaru', 'nabilbagus', 3, 1);

-- --------------------------------------------------------

--
-- Table structure for table `rute`
--

CREATE TABLE IF NOT EXISTS `rute` (
  `namaRute` varchar(20) NOT NULL,
  `maxStasiun` int(11) NOT NULL,
  `nStasiun` int(11) NOT NULL,
  `noKereta` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `rute`
--

INSERT INTO `rute` (`namaRute`, `maxStasiun`, `nStasiun`, `noKereta`) VALUES
('solo', 4, 1, '1');

-- --------------------------------------------------------

--
-- Table structure for table `stasiun`
--

CREATE TABLE IF NOT EXISTS `stasiun` (
  `kodeStasiun` varchar(20) NOT NULL,
  `namaStasiun` varchar(20) NOT NULL,
  `namaRute` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stasiun`
--

INSERT INTO `stasiun` (`kodeStasiun`, `namaStasiun`, `namaRute`) VALUES
('aaa', 'fff', 'solo');

-- --------------------------------------------------------

--
-- Table structure for table `tiket`
--

CREATE TABLE IF NOT EXISTS `tiket` (
  `tanggal` varchar(20) NOT NULL,
  `namaPemesan` varchar(20) NOT NULL,
  `kelasKereta` varchar(20) NOT NULL,
  `jamBerangkat` varchar(20) NOT NULL,
  `jamDatang` varchar(20) NOT NULL,
  `hargaTiket` int(11) NOT NULL,
  `kotaAsal` varchar(20) NOT NULL,
  `kotaTujuan` varchar(20) NOT NULL,
  `noKereta` varchar(20) NOT NULL,
`noTiket` int(20) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `tiket`
--

INSERT INTO `tiket` (`tanggal`, `namaPemesan`, `kelasKereta`, `jamBerangkat`, `jamDatang`, `hargaTiket`, `kotaAsal`, `kotaTujuan`, `noKereta`, `noTiket`) VALUES
('22', 'mala', 'Bisnis', 's', 's', 200000, 's', 's', '1', 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gerbong`
--
ALTER TABLE `gerbong`
 ADD PRIMARY KEY (`noGerbong`);

--
-- Indexes for table `kereta`
--
ALTER TABLE `kereta`
 ADD PRIMARY KEY (`noKereta`);

--
-- Indexes for table `rute`
--
ALTER TABLE `rute`
 ADD PRIMARY KEY (`namaRute`);

--
-- Indexes for table `stasiun`
--
ALTER TABLE `stasiun`
 ADD PRIMARY KEY (`kodeStasiun`);

--
-- Indexes for table `tiket`
--
ALTER TABLE `tiket`
 ADD PRIMARY KEY (`noTiket`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `gerbong`
--
ALTER TABLE `gerbong`
MODIFY `noGerbong` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=28;
--
-- AUTO_INCREMENT for table `tiket`
--
ALTER TABLE `tiket`
MODIFY `noTiket` int(20) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
