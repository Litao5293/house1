/*
Navicat MySQL Data Transfer

Source Server         : aaa
Source Server Version : 50624
Source Host           : 127.0.0.1:3306
Source Database       : house

Target Server Type    : MYSQL
Target Server Version : 50624
File Encoding         : 65001

Date: 2018-01-02 11:02:43
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for area
-- ----------------------------
DROP TABLE IF EXISTS `area`;
CREATE TABLE `area` (
  `aid` int(50) NOT NULL AUTO_INCREMENT,
  `address` varchar(500) NOT NULL,
  `astate` varchar(500) NOT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of area
-- ----------------------------

-- ----------------------------
-- Table structure for building
-- ----------------------------
DROP TABLE IF EXISTS `building`;
CREATE TABLE `building` (
  `bid` int(50) NOT NULL AUTO_INCREMENT,
  `bname` varchar(100) NOT NULL,
  `baddress` varchar(500) NOT NULL,
  `qid` int(50) NOT NULL,
  `aid` int(50) NOT NULL,
  `btid` int(50) NOT NULL,
  `ftid` int(50) NOT NULL,
  `opentime` datetime NOT NULL,
  `jiaotime` datetime NOT NULL,
  `did` int(11) NOT NULL,
  `dev_id` int(11) NOT NULL,
  `dev_num` int(11) NOT NULL,
  PRIMARY KEY (`bid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of building
-- ----------------------------

-- ----------------------------
-- Table structure for building_type
-- ----------------------------
DROP TABLE IF EXISTS `building_type`;
CREATE TABLE `building_type` (
  `btid` int(50) NOT NULL AUTO_INCREMENT,
  `btname` varchar(500) NOT NULL,
  `btdescribe` varchar(500) NOT NULL,
  PRIMARY KEY (`btid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of building_type
-- ----------------------------

-- ----------------------------
-- Table structure for collection
-- ----------------------------
DROP TABLE IF EXISTS `collection`;
CREATE TABLE `collection` (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `hid` int(11) NOT NULL,
  `uid` int(11) NOT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collection
-- ----------------------------

-- ----------------------------
-- Table structure for decorate
-- ----------------------------
DROP TABLE IF EXISTS `decorate`;
CREATE TABLE `decorate` (
  `did` int(50) NOT NULL AUTO_INCREMENT,
  `dname` varchar(255) NOT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of decorate
-- ----------------------------

-- ----------------------------
-- Table structure for developer
-- ----------------------------
DROP TABLE IF EXISTS `developer`;
CREATE TABLE `developer` (
  `dev_id` int(11) NOT NULL AUTO_INCREMENT,
  `dev_name` varchar(255) NOT NULL,
  `dev_book` varchar(255) NOT NULL,
  `dev_num` int(11) NOT NULL,
  PRIMARY KEY (`dev_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of developer
-- ----------------------------

-- ----------------------------
-- Table structure for evaluate
-- ----------------------------
DROP TABLE IF EXISTS `evaluate`;
CREATE TABLE `evaluate` (
  `eid` int(11) NOT NULL AUTO_INCREMENT,
  `econtent` varchar(255) NOT NULL,
  `uid` int(11) NOT NULL,
  `etime` datetime NOT NULL,
  `epicture` varchar(255) NOT NULL,
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of evaluate
-- ----------------------------

-- ----------------------------
-- Table structure for floor_type
-- ----------------------------
DROP TABLE IF EXISTS `floor_type`;
CREATE TABLE `floor_type` (
  `ftid` int(50) NOT NULL AUTO_INCREMENT,
  `ftname` varchar(500) NOT NULL,
  PRIMARY KEY (`ftid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of floor_type
-- ----------------------------

-- ----------------------------
-- Table structure for house_type
-- ----------------------------
DROP TABLE IF EXISTS `house_type`;
CREATE TABLE `house_type` (
  `hid` int(11) NOT NULL AUTO_INCREMENT,
  `bid` int(11) NOT NULL,
  `htype` varchar(255) NOT NULL,
  `did` int(11) NOT NULL,
  `hprice` float NOT NULL,
  `hsize` float NOT NULL,
  `htime` datetime NOT NULL,
  `btid` int(11) NOT NULL,
  `ftid` int(11) NOT NULL,
  `proid` int(11) NOT NULL,
  PRIMARY KEY (`hid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of house_type
-- ----------------------------

-- ----------------------------
-- Table structure for interest_rate
-- ----------------------------
DROP TABLE IF EXISTS `interest_rate`;
CREATE TABLE `interest_rate` (
  `itid` int(11) NOT NULL AUTO_INCREMENT,
  `irname` varchar(255) NOT NULL,
  `rate` varchar(255) NOT NULL,
  `rate_time` datetime NOT NULL,
  `first_price` varchar(255) NOT NULL,
  PRIMARY KEY (`itid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of interest_rate
-- ----------------------------

-- ----------------------------
-- Table structure for picture
-- ----------------------------
DROP TABLE IF EXISTS `picture`;
CREATE TABLE `picture` (
  `pid` int(11) NOT NULL AUTO_INCREMENT,
  `pclasspath` varchar(255) NOT NULL,
  `ptid` int(11) NOT NULL,
  `bid` int(11) NOT NULL,
  `pstate` varchar(255) NOT NULL,
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of picture
-- ----------------------------

-- ----------------------------
-- Table structure for picture_type
-- ----------------------------
DROP TABLE IF EXISTS `picture_type`;
CREATE TABLE `picture_type` (
  `ptid` int(11) NOT NULL AUTO_INCREMENT,
  `ptdescribe` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ptid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of picture_type
-- ----------------------------

-- ----------------------------
-- Table structure for property
-- ----------------------------
DROP TABLE IF EXISTS `property`;
CREATE TABLE `property` (
  `proid` int(11) NOT NULL AUTO_INCREMENT,
  `proname` varchar(255) NOT NULL,
  `parking` varchar(255) NOT NULL,
  `pro_green` double NOT NULL,
  PRIMARY KEY (`proid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of property
-- ----------------------------

-- ----------------------------
-- Table structure for quan
-- ----------------------------
DROP TABLE IF EXISTS `quan`;
CREATE TABLE `quan` (
  `qid` int(50) NOT NULL AUTO_INCREMENT,
  `qname` varchar(500) NOT NULL,
  `aid` int(50) NOT NULL,
  `qstate` varchar(500) NOT NULL,
  PRIMARY KEY (`qid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of quan
-- ----------------------------

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `user_num` varchar(255) NOT NULL,
  `utid` int(11) NOT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------

-- ----------------------------
-- Table structure for users_type
-- ----------------------------
DROP TABLE IF EXISTS `users_type`;
CREATE TABLE `users_type` (
  `utid` int(11) NOT NULL AUTO_INCREMENT,
  `utname` varchar(255) NOT NULL,
  PRIMARY KEY (`utid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users_type
-- ----------------------------
