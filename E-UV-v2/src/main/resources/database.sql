/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 100138
 Source Host           : localhost:3306
 Source Schema         : myapp

 Target Server Type    : MySQL
 Target Server Version : 100138
 File Encoding         : 65001

 Date: 29/05/2020 16:46:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `t_subject`;
create table `t_subject` (
    `subjectId` int(11) NOT NULL AUTO_INCREMENT,
    `description` varchar(100) NOT NULL,
    `subjectName` varchar(100) NOT NULL,
    `create_time` datetime(0) NOT NULL,
    `number_min` int(11) NOT NULL,
    `number_max` int(11) NOT NULL,
    PRIMARY KEY (`subjectId`) USING BTREE
)ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;
-- ----------------------------
-- Table structure for t_evaluation
-- ----------------------------
DROP TABLE IF EXISTS `t_evaluation`;
CREATE TABLE `t_evaluation`  (
  `eid` int(11) NOT NULL AUTO_INCREMENT,
  `etitle` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `edesp` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `econtent` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `eduration` datetime(6) NOT NULL,
  `ecreated` datetime(6) NOT NULL,
  `evaild` tinyint(1) NOT NULL,
  PRIMARY KEY (`eid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_evaluation
-- ----------------------------
INSERT INTO `t_evaluation` VALUES (3, 'fwfawf', 'waefwaff', 'fafwafawf', '2020-05-29 12:04:00.000000', '2020-05-28 00:04:56.000000', 0);
INSERT INTO `t_evaluation` VALUES (4, 'awf', 'waefwaf', 'fwef', '2020-05-27 11:50:00.000000', '2020-05-28 00:16:12.000000', 0);

-- ----------------------------
-- Table structure for t_group
-- ----------------------------
DROP TABLE IF EXISTS `t_group`;
CREATE TABLE `t_group`  (
  `groupId` int(11) NOT NULL AUTO_INCREMENT,
  `groupName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `projectManager` int(11) NOT NULL,
  `subjectId` int(11) NOT NULL,
  `file` mediumblob NULL,
  `is_valid` int(2) NOT NULL,
  `fileName` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`groupId`) USING BTREE,
  INDEX `subjectId`(`subjectId`) USING BTREE,
  CONSTRAINT `t_group_ibfk_1` FOREIGN KEY (`subjectId`) REFERENCES `t_subject` (`subjectId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_group
-- ----------------------------
INSERT INTO `t_group` VALUES (1, 'group_1', 2, 1, NULL, 0, NULL);
INSERT INTO `t_group` VALUES (2, 'Wendy_Group', 4, 12, '', 0, '');
INSERT INTO `t_group` VALUES (3, 'Antoine_Group', 6, 1, NULL, 0, '');
INSERT INTO `t_group` VALUES (12, 'test_1_group', 7, 22, NULL, 0, NULL);

-- ----------------------------
-- Table structure for t_meeting
-- ----------------------------
DROP TABLE IF EXISTS `t_meeting`;
CREATE TABLE `t_meeting`  (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `groupId` int(11) NOT NULL,
  `mdate` datetime(0) NOT NULL,
  PRIMARY KEY (`mid`) USING BTREE,
  INDEX `groupId`(`groupId`) USING BTREE,
  CONSTRAINT `t_meeting_ibfk_1` FOREIGN KEY (`groupId`) REFERENCES `t_group` (`groupId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_meeting
-- ----------------------------
INSERT INTO `t_meeting` VALUES (1, 1, '2020-05-14 02:25:00');
INSERT INTO `t_meeting` VALUES (16, 1, '2020-05-28 02:31:00');
INSERT INTO `t_meeting` VALUES (17, 1, '2020-06-11 02:59:00');
INSERT INTO `t_meeting` VALUES (18, 1, '2020-06-17 03:00:00');
INSERT INTO `t_meeting` VALUES (19, 1, '2020-08-05 03:12:00');
INSERT INTO `t_meeting` VALUES (20, 2, '2020-06-11 02:59:00');
INSERT INTO `t_meeting` VALUES (21, 12, '2020-06-11 02:59:00');

-- ----------------------------
-- Table structure for t_project
-- ----------------------------
DROP TABLE IF EXISTS `t_project`;
CREATE TABLE `t_project`  (
  `projectId` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'Primary key',
  `description` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT 'description',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT 'Project creation time',
  `project_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`projectId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_project
-- ----------------------------
INSERT INTO `t_project` VALUES (1, 'description of project1', '2020-04-25 18:23:57', 'project1');
INSERT INTO `t_project` VALUES (6, 'description of project1', '2020-04-26 17:45:48', 'project2');
INSERT INTO `t_project` VALUES (7, 'description of project2', '2020-04-26 17:46:02', 'project2');
INSERT INTO `t_project` VALUES (8, 'text_description', '2020-04-26 22:12:00', 'project_3');
INSERT INTO `t_project` VALUES (11, 'fawf', '2020-04-27 15:27:03', 'ergse');
INSERT INTO `t_project` VALUES (12, 'ref', '2020-04-27 15:32:20', 'fwaf');

-- ----------------------------
-- Table structure for t_response
-- ----------------------------
DROP TABLE IF EXISTS `t_response`;
CREATE TABLE `t_response`  (
  `rid` int(11) NOT NULL AUTO_INCREMENT,
  `rcontent` longtext CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `rcreated` datetime(6) NOT NULL,
  `revaluation_id` int(11) NOT NULL,
  `rstudent_id` int(11) NOT NULL,
  PRIMARY KEY (`rid`) USING BTREE,
  INDEX `t_response_ibfk_1`(`revaluation_id`) USING BTREE,
  INDEX `t_response_ibfk_2`(`rstudent_id`) USING BTREE,
  CONSTRAINT `t_response_ibfk_1` FOREIGN KEY (`revaluation_id`) REFERENCES `t_evaluation` (`eid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `t_response_ibfk_2` FOREIGN KEY (`rstudent_id`) REFERENCES `t_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `role` int(2) NOT NULL,
  `groupId` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `id`(`id`) USING BTREE,
  INDEX `groupId`(`groupId`) USING BTREE,
  CONSTRAINT `t_user_ibfk_1` FOREIGN KEY (`groupId`) REFERENCES `t_group` (`groupId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'admin', '1', 0, NULL);
INSERT INTO `t_user` VALUES (2, 'student', '1', 1, 1);
INSERT INTO `t_user` VALUES (3, 'john', '1', 1, 1);
INSERT INTO `t_user` VALUES (4, 'wendy', '1', 1, 2);
INSERT INTO `t_user` VALUES (5, 'Paul', '1', 1, 1);
INSERT INTO `t_user` VALUES (6, 'Antoine', '1', 1, 3);
INSERT INTO `t_user` VALUES (7, 'nancy', '1', 1, 12);

SET FOREIGN_KEY_CHECKS = 1;
