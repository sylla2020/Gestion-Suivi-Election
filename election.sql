-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : dim. 09 jan. 2022 à 11:08
-- Version du serveur : 5.7.36
-- Version de PHP : 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `election`
--

-- --------------------------------------------------------

--
-- Structure de la table `circoncription`
--

DROP TABLE IF EXISTS `circoncription`;
CREATE TABLE IF NOT EXISTS `circoncription` (
  `Nom` varchar(50) NOT NULL,
  `Position_Geo` varchar(100) NOT NULL,
  `Nombre_Inscri` int(11) NOT NULL,
  `Suffrage_exprime` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `circoncription`
--

INSERT INTO `circoncription` (`Nom`, `Position_Geo`, `Nombre_Inscri`, `Suffrage_exprime`) VALUES
('Dakar ville', 'Dakar', 250, 20),
('Thies ville', 'Thies', 300, 250);

-- --------------------------------------------------------

--
-- Structure de la table `electeur`
--

DROP TABLE IF EXISTS `electeur`;
CREATE TABLE IF NOT EXISTS `electeur` (
  `Numero_bureau` int(11) NOT NULL,
  `N_circonscription` int(11) NOT NULL,
  `id_User` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `liste_electorale`
--

DROP TABLE IF EXISTS `liste_electorale`;
CREATE TABLE IF NOT EXISTS `liste_electorale` (
  `Nom` varchar(50) NOT NULL,
  `identifiant` varchar(50) NOT NULL,
  `id_representant` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `login`
--

DROP TABLE IF EXISTS `login`;
CREATE TABLE IF NOT EXISTS `login` (
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  PRIMARY KEY (`Username`,`Password`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `login`
--

INSERT INTO `login` (`Username`, `Password`) VALUES
('username', 'password'),
('Votre mail', 'Mot de passe'),
('Votre mail1', 'Mot de passe');

-- --------------------------------------------------------

--
-- Structure de la table `representat`
--

DROP TABLE IF EXISTS `representat`;
CREATE TABLE IF NOT EXISTS `representat` (
  `id_electeur` int(11) NOT NULL,
  `id_liste` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `Prenom` varchar(50) NOT NULL,
  `Nom` varchar(50) NOT NULL,
  `Date_naissance` varchar(50) NOT NULL,
  `Numero_CNI` varchar(50) NOT NULL,
  `Adresse` varchar(50) NOT NULL,
  `E_mail` varchar(70) NOT NULL,
  `Password` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`Prenom`, `Nom`, `Date_naissance`, `Numero_CNI`, `Adresse`, `E_mail`, `Password`) VALUES
('Votre nom', 'Votre prénom', 'Naissance 19/04/1996', 'cni', 'Thilla', 'username', 'Mot de passe'),
('Votre nom', 'Votre prénom', 'Naissance 19/04/1996', 'cni', 'Thilla', 'Votre mail', 'Mot de passe'),
('Votre nom', 'Votre prénom', 'Naissance 19/04/1996', 'cni', 'Thilla', 'Votre mail', 'Mot de passe'),
('Votre nom', 'Votre prénom', 'Naissance 19/04/1996', 'cni', 'Thilla', 'Votre mail', 'Mot de passe'),
('Votre nom', 'Votre prénom', 'Naissance 19/04/1996', 'cni', 'Thilla', 'Votre mail', 'Mot de passe');

-- --------------------------------------------------------

--
-- Structure de la table `votes`
--

DROP TABLE IF EXISTS `votes`;
CREATE TABLE IF NOT EXISTS `votes` (
  `id_electeur` int(11) NOT NULL,
  `N_bureau` int(11) NOT NULL,
  `id_liste` varchar(50) NOT NULL,
  `id_circonscription` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
