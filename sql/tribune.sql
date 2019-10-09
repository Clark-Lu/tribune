/*
SQLyog Enterprise - MySQL GUI v8.12 
MySQL - 5.1.39-community : Database - tribune
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`tribune` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `tribune`;

/*Table structure for table `buy_history` */

DROP TABLE IF EXISTS `buy_history`;

CREATE TABLE `buy_history` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `buyer_id` bigint(20) DEFAULT NULL COMMENT '购买人id',
  `amount` decimal(10,2) DEFAULT NULL COMMENT '金额',
  `description` varchar(1024) DEFAULT NULL COMMENT '描述',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `NewIndex1` (`buyer_id`,`amount`,`description`(255))
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8 CHECKSUM=1 DELAY_KEY_WRITE=1 ROW_FORMAT=DYNAMIC;

/*Data for the table `buy_history` */

insert  into `buy_history`(`id`,`buyer_id`,`amount`,`description`,`create_time`) values (21,1,'300.00','笛子','2018-03-18 13:17:08'),(23,1,'300.00','箫','2018-03-18 13:17:37'),(24,1,'300.33','笛子','2018-03-18 13:24:06'),(25,NULL,'20000.00','交易记录','2019-09-09 20:55:22'),(26,NULL,'20000.00','交易记录','2019-09-09 20:55:40');

/*Table structure for table `buyer` */

DROP TABLE IF EXISTS `buyer`;

CREATE TABLE `buyer` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(256) DEFAULT NULL,
  `mobile` varchar(16) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `buyer` */

insert  into `buyer`(`id`,`name`,`mobile`,`create_time`,`update_time`) values (1,'购买人','12345678901','2018-03-14 21:38:56','2018-03-18 13:16:54');

/*Table structure for table `url` */

DROP TABLE IF EXISTS `url`;

CREATE TABLE `url` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `url` varchar(1024) DEFAULT NULL COMMENT 'url链接',
  `description` varchar(1024) DEFAULT NULL COMMENT '描述',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

/*Data for the table `url` */

insert  into `url`(`id`,`url`,`description`,`create_time`,`update_time`) values (41,'www.google.com','谷歌','2018-03-12 21:48:28','2018-03-12 21:48:28'),(42,'www.baidu.com','百度','2018-03-12 21:48:44','2018-03-12 21:48:44'),(43,'www.4399.com','小游戏','2019-09-09 20:50:02','2019-09-09 20:50:02');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
