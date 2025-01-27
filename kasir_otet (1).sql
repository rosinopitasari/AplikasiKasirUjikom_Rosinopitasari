-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 02 Apr 2024 pada 04.36
-- Versi server: 10.4.28-MariaDB
-- Versi PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kasir_otet`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `detailpenjualan`
--

CREATE TABLE `detailpenjualan` (
  `DetailID` varchar(11) NOT NULL,
  `ProdukID` varchar(15) NOT NULL,
  `Harga` int(11) NOT NULL,
  `JumlahProduk` int(11) NOT NULL,
  `SubTotal` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `detailpenjualan`
--

INSERT INTO `detailpenjualan` (`DetailID`, `ProdukID`, `Harga`, `JumlahProduk`, `SubTotal`) VALUES
('DIDP001', '8991389230220', 3000, 5, 15000),
('DIDP002', '8993988090069', 2500, 5, 12500),
('DIDP003', '8993988090069', 2500, 5, 12500),
('DIDP004', '8993988282044', 3000, 4, 12000),
('DIDP005', '8993988282044', 3000, 5, 15000),
('DIDP006', '8993988282044', 3000, 4, 12000),
('DIDP007', '8993988282044', 3000, 3, 9000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `LoginID` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `HakAkses` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`LoginID`, `username`, `password`, `HakAkses`) VALUES
(123, 'asri', '12345', 'Admin'),
(1234, 'rosi', '12345', 'Petugas'),
(123345, 'eca', '1234567', 'Petugas');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE `pelanggan` (
  `Pelanggan` int(11) NOT NULL,
  `NamaPelanggan` varchar(255) NOT NULL,
  `Alamat` text NOT NULL,
  `NomorTelepon` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`Pelanggan`, `NamaPelanggan`, `Alamat`, `NomorTelepon`) VALUES
(2, 'As', 'AR', '09766'),
(3, 'Lyra', 'Kp.', '087654'),
(4, 'ros', 'pel', '02164');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjualan`
--

CREATE TABLE `penjualan` (
  `PenjualanID` varchar(15) NOT NULL,
  `DetailID` varchar(15) NOT NULL,
  `TanggalPenjualan` date NOT NULL,
  `JamPenjualan` time NOT NULL,
  `TotalHarga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `penjualan`
--

INSERT INTO `penjualan` (`PenjualanID`, `DetailID`, `TanggalPenjualan`, `JamPenjualan`, `TotalHarga`) VALUES
('IDP001', 'DIDP001', '2024-04-01', '10:04:21', 15000),
('IDP002', 'DIDP002', '2024-04-01', '10:07:00', 12500),
('IDP003', 'DIDP003', '2024-04-02', '08:20:05', 12500),
('IDP004', 'DIDP004', '2024-04-02', '08:52:59', 12000),
('IDP005', 'DIDP005', '2024-04-02', '09:25:57', 15000),
('IDP006', 'DIDP006', '2024-04-02', '09:27:31', 12000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `produk`
--

CREATE TABLE `produk` (
  `ProdukID` varchar(15) NOT NULL,
  `NamaProduk` varchar(255) NOT NULL,
  `Harga` int(11) NOT NULL,
  `Stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `produk`
--

INSERT INTO `produk` (`ProdukID`, `NamaProduk`, `Harga`, `Stok`) VALUES
('8991389230220', 'buku', 3000, 20),
('8993988090069', 'penghapus', 2500, 20),
('8993988090243', 'Joyko', 2000, 0),
('8993988282044', 'pulpen', 3000, 20);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `detailpenjualan`
--
ALTER TABLE `detailpenjualan`
  ADD PRIMARY KEY (`DetailID`);

--
-- Indeks untuk tabel `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`LoginID`);

--
-- Indeks untuk tabel `pelanggan`
--
ALTER TABLE `pelanggan`
  ADD PRIMARY KEY (`Pelanggan`);

--
-- Indeks untuk tabel `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`PenjualanID`);

--
-- Indeks untuk tabel `produk`
--
ALTER TABLE `produk`
  ADD PRIMARY KEY (`ProdukID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
