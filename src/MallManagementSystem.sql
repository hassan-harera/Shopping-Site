-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: mallmanagementsystem
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `uname` varchar(45) DEFAULT NULL,
  `aname` varchar(45) DEFAULT NULL,
  `telephone` varchar(45) DEFAULT NULL,
  `email` varchar(120) DEFAULT NULL,
  `address` varchar(300) DEFAULT NULL,
  KEY `username_idx` (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `admin_message`
--

DROP TABLE IF EXISTS `admin_message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin_message` (
  `m_id` int NOT NULL AUTO_INCREMENT,
  `from` varchar(45) DEFAULT 'Admin',
  `to_uname` varchar(45) DEFAULT NULL,
  `m_date` date DEFAULT NULL,
  `m_content` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`m_id`),
  KEY `from_admin_to_username` (`to_uname`),
  CONSTRAINT `from_admin_to_username` FOREIGN KEY (`to_uname`) REFERENCES `user` (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `cid` int NOT NULL AUTO_INCREMENT,
  `cname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `cid` int NOT NULL AUTO_INCREMENT,
  `uname` varchar(45) DEFAULT NULL,
  `cname` varchar(45) DEFAULT NULL,
  `telephone` varchar(45) DEFAULT NULL,
  `currentshop` varchar(45) DEFAULT NULL,
  `email` varchar(120) DEFAULT NULL,
  `ccredit` double DEFAULT '10000',
  PRIMARY KEY (`cid`),
  KEY `username_idx` (`uname`),
  CONSTRAINT `username` FOREIGN KEY (`uname`) REFERENCES `user` (`uname`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `customeritems`
--

DROP TABLE IF EXISTS `customeritems`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customeritems` (
  `oid` int NOT NULL AUTO_INCREMENT,
  `sid` int DEFAULT NULL,
  `cid` int DEFAULT NULL,
  `iid` int DEFAULT NULL,
  `amount` int DEFAULT NULL,
  `totalprice` double DEFAULT NULL,
  `date` date DEFAULT NULL,
  `ischeckedout` tinyint DEFAULT NULL,
  `isshiped` tinyint DEFAULT NULL,
  `isarrived` tinyint DEFAULT NULL,
  `customernotes` varchar(1000) DEFAULT NULL,
  `sellmannotes` varchar(1000) DEFAULT NULL,
  `shippingdate` date DEFAULT NULL,
  `arrivedate` date DEFAULT NULL,
  PRIMARY KEY (`oid`),
  KEY `shopitems_idx` (`sid`),
  KEY `customeritems_idx` (`cid`),
  KEY `item_idx` (`iid`),
  CONSTRAINT `customeritems` FOREIGN KEY (`cid`) REFERENCES `customer` (`cid`),
  CONSTRAINT `item` FOREIGN KEY (`iid`) REFERENCES `item` (`iiid`),
  CONSTRAINT `shopitems` FOREIGN KEY (`sid`) REFERENCES `shop` (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `customervisit`
--

DROP TABLE IF EXISTS `customervisit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customervisit` (
  `cid` int DEFAULT NULL,
  `sid` int DEFAULT NULL,
  `vdate` date DEFAULT NULL,
  KEY `customervisit_idx` (`cid`),
  KEY `shopvisit_idx` (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `guestbook`
--

DROP TABLE IF EXISTS `guestbook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `guestbook` (
  `mid` int NOT NULL AUTO_INCREMENT,
  `cid` int DEFAULT NULL,
  `Message` varchar(450) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `isread` tinyint DEFAULT '0',
  PRIMARY KEY (`mid`),
  KEY `customerguestbook_idx` (`cid`) /*!80000 INVISIBLE */,
  CONSTRAINT `customerguestbook` FOREIGN KEY (`cid`) REFERENCES `customer` (`cid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item` (
  `iiid` int NOT NULL AUTO_INCREMENT,
  `iname` varchar(45) DEFAULT NULL,
  `cid` int DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`iiid`),
  KEY `category_idx` (`cid`),
  CONSTRAINT `category` FOREIGN KEY (`cid`) REFERENCES `category` (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `message`
--

DROP TABLE IF EXISTS `message`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `message` (
  `m_id` int NOT NULL AUTO_INCREMENT,
  `from_uname` varchar(45) DEFAULT NULL,
  `to_uname` varchar(45) DEFAULT NULL,
  `m_date` date DEFAULT NULL,
  PRIMARY KEY (`m_id`),
  KEY `reciever_username` (`to_uname`),
  KEY `sernder_username_idx` (`from_uname`),
  CONSTRAINT `reciever_username` FOREIGN KEY (`to_uname`) REFERENCES `user` (`uname`),
  CONSTRAINT `sender_username` FOREIGN KEY (`from_uname`) REFERENCES `user` (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `new_shop`
--

DROP TABLE IF EXISTS `new_shop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `new_shop` (
  `n_id` int NOT NULL AUTO_INCREMENT,
  `n_message` varchar(500) DEFAULT NULL,
  `is_read` tinyint DEFAULT NULL,
  `sid` int DEFAULT NULL,
  PRIMARY KEY (`n_id`),
  KEY `shop_id_idx` (`sid`),
  CONSTRAINT `shop_id` FOREIGN KEY (`sid`) REFERENCES `shop` (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `owner`
--

DROP TABLE IF EXISTS `owner`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `owner` (
  `oid` int NOT NULL AUTO_INCREMENT,
  `uname` varchar(45) DEFAULT NULL,
  `oname` varchar(45) DEFAULT NULL,
  `telephone` varchar(15) DEFAULT NULL,
  `email` varchar(120) DEFAULT NULL,
  PRIMARY KEY (`oid`),
  KEY `username_idx` (`uname`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `rent_request`
--

DROP TABLE IF EXISTS `rent_request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rent_request` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sid` int DEFAULT NULL,
  `date` date DEFAULT NULL,
  `oid` int DEFAULT NULL,
  `budget` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `terminate_request_company_idx` (`oid`),
  KEY `terminate_request_store_idx` (`sid`),
  CONSTRAINT `rent_request_company` FOREIGN KEY (`oid`) REFERENCES `owner` (`oid`),
  CONSTRAINT `rent_request_store` FOREIGN KEY (`sid`) REFERENCES `shop` (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `sellhistory`
--

DROP TABLE IF EXISTS `sellhistory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sellhistory` (
  `sid` int DEFAULT NULL,
  `cid` int DEFAULT NULL,
  `iid` int DEFAULT NULL,
  `amount` varchar(45) DEFAULT NULL,
  `sdate` date DEFAULT NULL,
  `totalprice` int DEFAULT NULL,
  KEY `shop_idx` (`sid`),
  KEY `customer_idx` (`cid`),
  KEY `irem_idx` (`iid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `shop`
--

DROP TABLE IF EXISTS `shop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shop` (
  `sid` int NOT NULL AUTO_INCREMENT,
  `oid` int DEFAULT NULL,
  `sname` varchar(45) DEFAULT NULL,
  `sarea` int DEFAULT NULL,
  `budget` double DEFAULT NULL,
  PRIMARY KEY (`sid`),
  KEY `owner_idx` (`oid`),
  CONSTRAINT `owner` FOREIGN KEY (`oid`) REFERENCES `owner` (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `shopitems`
--

DROP TABLE IF EXISTS `shopitems`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shopitems` (
  `sid` int DEFAULT NULL,
  `iid` int DEFAULT NULL,
  `amount` int DEFAULT NULL,
  `iprice` int DEFAULT NULL,
  `date` date DEFAULT NULL,
  KEY `shop_idx` (`sid`),
  KEY `item_idx` (`iid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `shoprequest`
--

DROP TABLE IF EXISTS `shoprequest`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shoprequest` (
  `rid` int NOT NULL AUTO_INCREMENT,
  `sid` int DEFAULT NULL,
  `oid` int DEFAULT NULL,
  `date` date DEFAULT NULL,
  `offerbudget` double DEFAULT NULL,
  PRIMARY KEY (`rid`),
  KEY `shop_idx` (`sid`),
  KEY `owner_idx` (`oid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `terminate_request`
--

DROP TABLE IF EXISTS `terminate_request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `terminate_request` (
  `t_id` int NOT NULL AUTO_INCREMENT,
  `sid` int DEFAULT NULL,
  `t_date` date DEFAULT NULL,
  `oid` int DEFAULT NULL,
  PRIMARY KEY (`t_id`),
  KEY `terminate_request_company_idx` (`oid`),
  KEY `terminate_request_store_idx` (`sid`),
  CONSTRAINT `terminate_request_company` FOREIGN KEY (`oid`) REFERENCES `owner` (`oid`),
  CONSTRAINT `terminate_request_store` FOREIGN KEY (`sid`) REFERENCES `shop` (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `uname` varchar(45) NOT NULL,
  `upassword` varchar(45) DEFAULT NULL,
  `isadmin` tinyint DEFAULT NULL,
  `isowner` tinyint DEFAULT NULL,
  `isonline` tinyint DEFAULT NULL,
  PRIMARY KEY (`uname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping events for database 'mallmanagementsystem'
--

--
-- Dumping routines for database 'mallmanagementsystem'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-07  0:00:15
