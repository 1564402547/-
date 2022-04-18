/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 50736
 Source Host           : 127.0.0.1:3306
 Source Schema         : community

 Target Server Type    : MySQL
 Target Server Version : 50736
 File Encoding         : 65001

 Date: 26/03/2022 16:28:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_address
-- ----------------------------
DROP TABLE IF EXISTS `tb_address`;
CREATE TABLE `tb_address`  (
  `address_id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `house` int(5) NOT NULL,
  `unit` int(10) NOT NULL,
  `resident_count` int(2) NOT NULL DEFAULT 0,
  `create_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  `address_status` int(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`address_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_address
-- ----------------------------
INSERT INTO `tb_address` VALUES (1, '敦敦社区', 1, 1401, 4, '2022-02-21 15:32:52', 0);
INSERT INTO `tb_address` VALUES (2, '敦敦社区', 1, 1402, 5, '2022-02-21 15:32:52', 0);
INSERT INTO `tb_address` VALUES (3, '敦敦社区', 1, 1403, 2, '2022-02-21 15:32:52', 0);
INSERT INTO `tb_address` VALUES (4, '敦敦社区', 1, 1404, 2, '2022-02-21 15:32:52', 0);
INSERT INTO `tb_address` VALUES (5, '敦敦社区', 1, 1405, 2, '2022-02-21 15:32:52', 0);
INSERT INTO `tb_address` VALUES (6, '敦敦社区', 1, 1406, 2, '2022-02-21 15:32:52', 0);
INSERT INTO `tb_address` VALUES (7, '敦敦社区', 1, 1407, 2, '2022-02-21 15:32:52', 0);
INSERT INTO `tb_address` VALUES (8, '敦敦社区', 1, 1408, 2, '2022-02-21 15:32:52', 0);
INSERT INTO `tb_address` VALUES (9, '敦敦社区', 1, 1409, 2, '2022-02-21 15:32:52', 0);
INSERT INTO `tb_address` VALUES (10, '敦敦社区', 1, 2606, 2, '2022-02-21 15:32:52', 0);
INSERT INTO `tb_address` VALUES (11, '敦敦社区', 1, 2702, 2, '2022-02-21 15:32:52', 0);
INSERT INTO `tb_address` VALUES (12, '敦敦社区', 1, 2602, 2, '2022-02-21 15:32:52', 0);
INSERT INTO `tb_address` VALUES (13, '敦敦社区', 1, 2502, 2, '2022-02-21 15:32:52', 0);
INSERT INTO `tb_address` VALUES (14, '敦敦社区', 1, 2407, 2, '2022-02-21 15:32:52', 0);
INSERT INTO `tb_address` VALUES (15, '敦敦社区', 1, 2405, 2, '2022-02-21 15:32:52', 0);
INSERT INTO `tb_address` VALUES (16, '敦敦社区', 1, 3402, 2, '2022-02-21 15:32:52', 0);
INSERT INTO `tb_address` VALUES (17, '冰冰社区', 1, 1102, 2, '2022-02-15 00:00:00', 0);
INSERT INTO `tb_address` VALUES (18, '冰冰社区', 1, 3301, 1, '2022-02-15 00:00:00', 0);
INSERT INTO `tb_address` VALUES (19, '冰冰社区', 1, 3302, 1, '2022-02-15 00:00:00', 0);
INSERT INTO `tb_address` VALUES (20, '冰冰社区', 1, 3303, 1, '2022-02-15 00:00:00', 0);
INSERT INTO `tb_address` VALUES (21, '冰冰社区', 1, 3304, 1, '2022-02-15 00:00:00', 0);
INSERT INTO `tb_address` VALUES (22, '冰冰社区', 3, 1102, 1, '2022-02-15 00:00:00', 0);
INSERT INTO `tb_address` VALUES (23, '敦敦社区', 3, 3909, 1, '2022-02-23 00:00:00', 0);
INSERT INTO `tb_address` VALUES (24, '敦敦社区', 3, 3408, 1, '2022-02-23 00:00:00', 0);
INSERT INTO `tb_address` VALUES (25, '敦敦社区', 1, 2302, 1, '2022-03-08 20:19:11', 0);
INSERT INTO `tb_address` VALUES (26, '敦敦社区', 9, 9402, 1, '2022-03-08 20:53:13', 0);
INSERT INTO `tb_address` VALUES (27, '敦敦社区', 3, 9901, 1, '2022-03-08 20:58:57', 0);
INSERT INTO `tb_address` VALUES (28, '敦敦社区', 2, 1402, 2, '2022-03-14 19:54:03', 0);
INSERT INTO `tb_address` VALUES (29, '敦敦社区', 5, 1502, 0, '2022-03-15 20:29:35', 0);
INSERT INTO `tb_address` VALUES (30, '御水龙城', 1, 1402, 0, '2022-03-22 17:09:50', 0);

-- ----------------------------
-- Table structure for tb_address_resident
-- ----------------------------
DROP TABLE IF EXISTS `tb_address_resident`;
CREATE TABLE `tb_address_resident`  (
  `add_res_id` int(5) NOT NULL AUTO_INCREMENT,
  `address_id` int(5) NULL DEFAULT NULL,
  `res_id` int(5) NULL DEFAULT NULL,
  PRIMARY KEY (`add_res_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 63 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_address_resident
-- ----------------------------
INSERT INTO `tb_address_resident` VALUES (5, 5, 5);
INSERT INTO `tb_address_resident` VALUES (7, 7, 7);
INSERT INTO `tb_address_resident` VALUES (8, 8, 8);
INSERT INTO `tb_address_resident` VALUES (9, 9, 9);
INSERT INTO `tb_address_resident` VALUES (10, 10, 10);
INSERT INTO `tb_address_resident` VALUES (11, 11, 11);
INSERT INTO `tb_address_resident` VALUES (12, 12, 12);
INSERT INTO `tb_address_resident` VALUES (13, 12, 13);
INSERT INTO `tb_address_resident` VALUES (14, 14, 14);
INSERT INTO `tb_address_resident` VALUES (15, 15, 15);
INSERT INTO `tb_address_resident` VALUES (16, 16, 16);
INSERT INTO `tb_address_resident` VALUES (17, 1, 17);
INSERT INTO `tb_address_resident` VALUES (18, 2, 18);
INSERT INTO `tb_address_resident` VALUES (19, 3, 19);
INSERT INTO `tb_address_resident` VALUES (20, 4, 20);
INSERT INTO `tb_address_resident` VALUES (21, 5, 21);
INSERT INTO `tb_address_resident` VALUES (22, 6, 22);
INSERT INTO `tb_address_resident` VALUES (23, 7, 23);
INSERT INTO `tb_address_resident` VALUES (24, 8, 24);
INSERT INTO `tb_address_resident` VALUES (25, 9, 25);
INSERT INTO `tb_address_resident` VALUES (26, 15, 26);
INSERT INTO `tb_address_resident` VALUES (27, 14, 27);
INSERT INTO `tb_address_resident` VALUES (28, 12, 28);
INSERT INTO `tb_address_resident` VALUES (29, 5, 29);
INSERT INTO `tb_address_resident` VALUES (30, 3, 30);
INSERT INTO `tb_address_resident` VALUES (31, 1, 31);
INSERT INTO `tb_address_resident` VALUES (32, 17, 40);
INSERT INTO `tb_address_resident` VALUES (33, 18, 41);
INSERT INTO `tb_address_resident` VALUES (34, 19, 42);
INSERT INTO `tb_address_resident` VALUES (35, 20, 43);
INSERT INTO `tb_address_resident` VALUES (36, 21, 44);
INSERT INTO `tb_address_resident` VALUES (37, 22, 45);
INSERT INTO `tb_address_resident` VALUES (38, 23, 46);
INSERT INTO `tb_address_resident` VALUES (39, 24, 47);
INSERT INTO `tb_address_resident` VALUES (40, 1, 48);
INSERT INTO `tb_address_resident` VALUES (41, 2, 50);
INSERT INTO `tb_address_resident` VALUES (42, 2, 51);
INSERT INTO `tb_address_resident` VALUES (43, 2, 52);
INSERT INTO `tb_address_resident` VALUES (44, 25, 54);
INSERT INTO `tb_address_resident` VALUES (45, 26, 55);
INSERT INTO `tb_address_resident` VALUES (46, 2, 49);
INSERT INTO `tb_address_resident` VALUES (47, 27, 56);
INSERT INTO `tb_address_resident` VALUES (55, 28, 57);
INSERT INTO `tb_address_resident` VALUES (56, 1, 1);
INSERT INTO `tb_address_resident` VALUES (57, 2, 2);
INSERT INTO `tb_address_resident` VALUES (59, 4, 4);
INSERT INTO `tb_address_resident` VALUES (60, 28, 59);
INSERT INTO `tb_address_resident` VALUES (61, 6, 6);
INSERT INTO `tb_address_resident` VALUES (62, 3, 3);

-- ----------------------------
-- Table structure for tb_code
-- ----------------------------
DROP TABLE IF EXISTS `tb_code`;
CREATE TABLE `tb_code`  (
  `code_id` int(4) NOT NULL AUTO_INCREMENT,
  `code_text` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `status` int(1) NOT NULL DEFAULT 0,
  `role_id` int(5) NOT NULL,
  `user_id` int(1) NULL DEFAULT NULL,
  PRIMARY KEY (`code_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_code
-- ----------------------------
INSERT INTO `tb_code` VALUES (17, '=(d%', 1, 1, 1);
INSERT INTO `tb_code` VALUES (18, '6OWQ', 1, 2, 2);
INSERT INTO `tb_code` VALUES (19, 'jNpNzlCE*(GMBE*YiSFdk)nEJVtTk)RYwvD7', 1, 2, 9);
INSERT INTO `tb_code` VALUES (20, '+E2MQ1^rHYeh^p(7)Aj=R)vtpUa!&W(D+re1', 1, 1, 10);
INSERT INTO `tb_code` VALUES (21, '+haX0d+n_EQbcTqv&yXOINa)6Pf$cKr*%5Mm', 1, 2, 7);
INSERT INTO `tb_code` VALUES (22, '3U*Fk)u9lm#pBIiZ-FU1$x6ZnyTho7Kr~dUA', 1, 1, 8);
INSERT INTO `tb_code` VALUES (23, 'VI6e(1ebSKcKf=ix)ScHiIVWzav+rAUNx1(c', 1, 2, 11);
INSERT INTO `tb_code` VALUES (24, 'ogg^=WPp%L~7KPx%l4)oFJVcVs^CwKUQ=~1u', 1, 1, 12);
INSERT INTO `tb_code` VALUES (25, 'ogg^=WPp%L~7KPx%l4)oFJVcVs^CwKUQ=~11', 1, 1, 13);
INSERT INTO `tb_code` VALUES (26, 'ogg^=WPp%L~7KPx%l4)oFJVcVs^CwKUQ=~12', 1, 1, 14);
INSERT INTO `tb_code` VALUES (27, 'ogg^=WPp%L~7KPx%l4)oFJVcVs^CwKUQ=~13', 1, 2, 16);
INSERT INTO `tb_code` VALUES (28, 'ogg^=WPp%L~7KPx%l4)oFJVcVs^CwKUQ=~14', 0, 1, NULL);
INSERT INTO `tb_code` VALUES (29, 'g&mh871T&1qzayjX7&vVojfV7FfGeN2)Xsv6', 0, 1, NULL);
INSERT INTO `tb_code` VALUES (30, '8TPT9$OVX$~EjyO_dL5Rff39)snztrIL!^X6', 0, 2, NULL);
INSERT INTO `tb_code` VALUES (31, 'k5R5@Gn)rZocf4T2g@TlA3twE_22Dp0%54d-', 0, 2, NULL);
INSERT INTO `tb_code` VALUES (32, '*hHXwN_uXR(r+(!XzDpIhp2b(F(!Tj0S9yJ2', 0, 2, NULL);
INSERT INTO `tb_code` VALUES (33, 'pc)^$Wgv5sYg-flvzgXp2cH3nW+E++u1$X7D', 0, 2, NULL);
INSERT INTO `tb_code` VALUES (34, 'QaR&L#f*Wa_UbdSW+~L^n7iK=)&=r)0QIHdI', 1, 1, 15);
INSERT INTO `tb_code` VALUES (35, 'OndYr^omPwDp2xWY%L4%(FP@Xl32pqFu$9Ui', 0, 2, NULL);
INSERT INTO `tb_code` VALUES (37, '2fv4uHDoo^W-G(FYGM$ERFS*O5vK&WWbv$RG', 0, 2, NULL);
INSERT INTO `tb_code` VALUES (38, 'ccUT4W9DKFM2$+KY9B6d0W+mEU%j8Q9veWAU', 0, 2, NULL);

-- ----------------------------
-- Table structure for tb_file
-- ----------------------------
DROP TABLE IF EXISTS `tb_file`;
CREATE TABLE `tb_file`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `old_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `new_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `size` bigint(20) NULL DEFAULT NULL,
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `md5` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` int(10) NOT NULL DEFAULT 0,
  `enable` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 42 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_file
-- ----------------------------
INSERT INTO `tb_file` VALUES (1, '学习任务.txt', '6e742d350e334d2d98b54528ed515b6c.txt', 'txt', 0, 'http://127.0.0.1:8088/file/6e742d350e334d2d98b54528ed515b6c.txt', '0db90ee1789ead5141150cbc9f74d5d4', 1, '0');
INSERT INTO `tb_file` VALUES (2, '学习任务.txt', '53a8f18ef3304d4394aab28fd8493e9f.txt', 'txt', 0, 'http://127.0.0.1:8088/file/6e742d350e334d2d98b54528ed515b6c.txt', '0db90ee1789ead5141150cbc9f74d5d4', 1, '0');
INSERT INTO `tb_file` VALUES (3, '数据库设计初稿.jpg', 'c37ee7f2f8914b72934801058a211059.jpg', 'jpg', 33, 'http://127.0.0.1:8088/file/c37ee7f2f8914b72934801058a211059.jpg', 'a633b42840824795d84ede3b0340fba2', 1, '0');
INSERT INTO `tb_file` VALUES (7, 'pom', 'd20880b32f3346cfa01c28d5010bf875.xml', 'xml', 1, 'http://127.0.0.1:8088/file/59185387b78247d1ad7d464b62952fb1.xml', '24d9467bfd82d72feeebd0fa2af847ae', 0, '0');
INSERT INTO `tb_file` VALUES (8, 'demo', '42551f173c3c423895280e3fc5069095.iml', 'iml', 9, 'http://127.0.0.1:8088/file/42551f173c3c423895280e3fc5069095.iml', '82bff59391b4038b8d23d060d4851dbf', 0, '0');
INSERT INTO `tb_file` VALUES (9, 'community', 'a442cf6670514b108c67c49d84ba0613.sql', 'sql', 28, 'http://127.0.0.1:8088/file/a442cf6670514b108c67c49d84ba0613.sql', 'a952b090f462c5439d90af273dbf4d58', 0, '0');
INSERT INTO `tb_file` VALUES (10, 'a', 'bb9f10a5aa724375a8e2cdf58635b453.jpg', 'jpg', 405, 'http://127.0.0.1:8088/file/bb9f10a5aa724375a8e2cdf58635b453.jpg', '9c86a76ae43a27b3e0f4f1cd7fc365e5', 0, '0');
INSERT INTO `tb_file` VALUES (11, 'a', 'cc1d4b324e544c9e88879a8c6fc610a5.jpg', 'jpg', 405, 'http://127.0.0.1:8088/file/bb9f10a5aa724375a8e2cdf58635b453.jpg', '9c86a76ae43a27b3e0f4f1cd7fc365e5', 0, '0');
INSERT INTO `tb_file` VALUES (12, 'a', '8c9cb3a1838549ce89e2f474f63416a5.jpg', 'jpg', 405, 'http://127.0.0.1:8088/file/bb9f10a5aa724375a8e2cdf58635b453.jpg', '9c86a76ae43a27b3e0f4f1cd7fc365e5', 0, '0');
INSERT INTO `tb_file` VALUES (13, 'ab', '5e73d4c13f0348d9a528b9237822d4a4.jpg', 'jpg', 627, 'http://127.0.0.1:8088/file/5e73d4c13f0348d9a528b9237822d4a4.jpg', 'bc1a1d3e9b349f1e15908aa950242ab4', 0, '0');
INSERT INTO `tb_file` VALUES (14, 'abc', 'b860325c0eec4af4b157d3830d68a9b4.jpg', 'jpg', 147, 'http://127.0.0.1:8088/file/b860325c0eec4af4b157d3830d68a9b4.jpg', '4eecc309c54e7e47b6235976f8505f93', 0, '0');
INSERT INTO `tb_file` VALUES (15, 'ab', '5def32fb52b043ebba8644b5d8202fd6.jpg', 'jpg', 627, 'http://127.0.0.1:8088/file/5e73d4c13f0348d9a528b9237822d4a4.jpg', 'bc1a1d3e9b349f1e15908aa950242ab4', 0, '0');
INSERT INTO `tb_file` VALUES (16, 'ablo', '5bbb8468cc1244348bb29f12a61c7cb3.jpg', 'jpg', 179, 'http://127.0.0.1:8088/file/5bbb8468cc1244348bb29f12a61c7cb3.jpg', '707605913ca40baa29b096660d6d5e52', 0, '0');
INSERT INTO `tb_file` VALUES (17, 'ab', '18e51c906e244fe4a1e906b96b87df7c.jpg', 'jpg', 627, 'http://127.0.0.1:8088/file/5e73d4c13f0348d9a528b9237822d4a4.jpg', 'bc1a1d3e9b349f1e15908aa950242ab4', 0, '0');
INSERT INTO `tb_file` VALUES (18, 'ablo', '6bb2bb8d01e242adb39edd68811f72a5.jpg', 'jpg', 179, 'http://127.0.0.1:8088/file/5bbb8468cc1244348bb29f12a61c7cb3.jpg', '707605913ca40baa29b096660d6d5e52', 0, '0');
INSERT INTO `tb_file` VALUES (19, 'ab', '58857fa8e87f468ba72a93148ec7aa93.jpg', 'jpg', 627, 'http://127.0.0.1:8088/file/5e73d4c13f0348d9a528b9237822d4a4.jpg', 'bc1a1d3e9b349f1e15908aa950242ab4', 0, '0');
INSERT INTO `tb_file` VALUES (20, 'ab', '15e9f5b4de4d477883ba99656a381dd8.jpg', 'jpg', 627, 'http://127.0.0.1:8088/file/5e73d4c13f0348d9a528b9237822d4a4.jpg', 'bc1a1d3e9b349f1e15908aa950242ab4', 0, '0');
INSERT INTO `tb_file` VALUES (21, 'idea', 'b552af6ca371453788ccf0ead982e031.jpg', 'jpg', 627, 'http://127.0.0.1:8088/file/5e73d4c13f0348d9a528b9237822d4a4.jpg', 'bc1a1d3e9b349f1e15908aa950242ab4', 0, '0');
INSERT INTO `tb_file` VALUES (22, 'ab', '827cc9d9611a41a0a64337edaf843b3f.jpg', 'jpg', 627, 'http://127.0.0.1:8088/file/5e73d4c13f0348d9a528b9237822d4a4.jpg', 'bc1a1d3e9b349f1e15908aa950242ab4', 0, '0');
INSERT INTO `tb_file` VALUES (23, 'abc', '6386ab8d896e4596a3a5ca7388763739.jpg', 'jpg', 147, 'http://127.0.0.1:8088/file/b860325c0eec4af4b157d3830d68a9b4.jpg', '4eecc309c54e7e47b6235976f8505f93', 0, '0');
INSERT INTO `tb_file` VALUES (24, 'ab', '260b426051f849faac37e9f320421647.jpg', 'jpg', 627, 'http://127.0.0.1:8088/file/5e73d4c13f0348d9a528b9237822d4a4.jpg', 'bc1a1d3e9b349f1e15908aa950242ab4', 0, '0');
INSERT INTO `tb_file` VALUES (25, 'ab', '7a08929f91be4c019ea0eece33274924.jpg', 'jpg', 627, 'http://127.0.0.1:8088/file/5e73d4c13f0348d9a528b9237822d4a4.jpg', 'bc1a1d3e9b349f1e15908aa950242ab4', 0, '0');
INSERT INTO `tb_file` VALUES (26, 'ab', '594de5dcaf674622b694e118c516221c.jpg', 'jpg', 627, 'http://127.0.0.1:8088/file/5e73d4c13f0348d9a528b9237822d4a4.jpg', 'bc1a1d3e9b349f1e15908aa950242ab4', 0, '0');
INSERT INTO `tb_file` VALUES (27, 'ab', '89d5d5fd5f4748ffa4617a2637b4a325.jpg', 'jpg', 627, 'http://127.0.0.1:8088/file/5e73d4c13f0348d9a528b9237822d4a4.jpg', 'bc1a1d3e9b349f1e15908aa950242ab4', 0, '0');
INSERT INTO `tb_file` VALUES (31, 'abc', '58e042159f3f400983c629b377f7c075.jpg', 'jpg', 147, 'http://127.0.0.1:8088/file/b860325c0eec4af4b157d3830d68a9b4.jpg', '4eecc309c54e7e47b6235976f8505f93', 1, '0');
INSERT INTO `tb_file` VALUES (32, 'a', 'c6b829d1ab784edb820e61b20b999083.jpg', 'jpg', 405, 'http://127.0.0.1:8088/file/bb9f10a5aa724375a8e2cdf58635b453.jpg', '9c86a76ae43a27b3e0f4f1cd7fc365e5', 1, '0');
INSERT INTO `tb_file` VALUES (33, 'abcd', '2853523d74c746ad8c6955832fccfa9c.jpg', 'jpg', 10, 'http://127.0.0.1:8088/file/2853523d74c746ad8c6955832fccfa9c.jpg', 'df6c9e1fbfe1d349267791ecbfbd4d0d', 1, '0');
INSERT INTO `tb_file` VALUES (34, 'idea', 'e4e9b1a2168f409098ff51429e55f963.jpg', 'jpg', 627, 'http://127.0.0.1:8088/file/5e73d4c13f0348d9a528b9237822d4a4.jpg', 'bc1a1d3e9b349f1e15908aa950242ab4', 1, '0');
INSERT INTO `tb_file` VALUES (35, 'idea', '113271edd28a4698bfaa167b2a35e1fa.jpg', 'jpg', 627, 'http://127.0.0.1:8088/file/5e73d4c13f0348d9a528b9237822d4a4.jpg', 'bc1a1d3e9b349f1e15908aa950242ab4', 1, '0');
INSERT INTO `tb_file` VALUES (38, 'abc', 'eec59e7e823945a199f2e05ce4cd5fae.jpg', 'jpg', 147, 'http://127.0.0.1:8088/file/b860325c0eec4af4b157d3830d68a9b4.jpg', '4eecc309c54e7e47b6235976f8505f93', 0, '0');
INSERT INTO `tb_file` VALUES (39, 'ab', 'c7f7befa88c44732af887ce9e2fd3e48.jpg', 'jpg', 627, 'http://127.0.0.1:8088/file/5e73d4c13f0348d9a528b9237822d4a4.jpg', 'bc1a1d3e9b349f1e15908aa950242ab4', 0, '0');
INSERT INTO `tb_file` VALUES (40, 'ablo', '46b4adf132ee4f3f864d8cb4833b70a7.jpg', 'jpg', 179, 'http://127.0.0.1:8088/file/5bbb8468cc1244348bb29f12a61c7cb3.jpg', '707605913ca40baa29b096660d6d5e52', 0, '0');
INSERT INTO `tb_file` VALUES (41, 'ab', 'ec2685275a7b4a71ba15bc6ba1dbaa8a.jpg', 'jpg', 627, 'http://127.0.0.1:8088/file/5e73d4c13f0348d9a528b9237822d4a4.jpg', 'bc1a1d3e9b349f1e15908aa950242ab4', 0, '0');

-- ----------------------------
-- Table structure for tb_menu
-- ----------------------------
DROP TABLE IF EXISTS `tb_menu`;
CREATE TABLE `tb_menu`  (
  `menu_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pid` int(11) NULL DEFAULT NULL,
  `icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `page_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
  `state` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_menu
-- ----------------------------
INSERT INTO `tb_menu` VALUES (1, '主页', NULL, 'el-icon-house', 'Home', 'Home', '2022-03-21 16:03:35', 0);
INSERT INTO `tb_menu` VALUES (2, '住户模块', NULL, 'el-icon-user', NULL, NULL, '2022-03-06 15:00:23', 0);
INSERT INTO `tb_menu` VALUES (3, '出入模块', NULL, 'el-icon-s-promotion', NULL, NULL, '2022-03-06 15:00:44', 0);
INSERT INTO `tb_menu` VALUES (4, '访客模块', NULL, 'el-icon-thumb', NULL, NULL, '2022-03-06 15:00:49', 0);
INSERT INTO `tb_menu` VALUES (5, '系统管理', NULL, 'el-icon-setting', NULL, NULL, '2022-03-06 15:00:58', 0);
INSERT INTO `tb_menu` VALUES (6, '文件管理', 7, 'el-icon-folder-opened', 'other/File', 'file', '2022-03-06 15:01:00', 0);
INSERT INTO `tb_menu` VALUES (7, '其他模块', NULL, 'el-icon-s-unfold', NULL, NULL, '2022-03-06 15:01:00', 0);
INSERT INTO `tb_menu` VALUES (8, '住户管理', 2, 'el-icon-s-custom', 'resident/ResidentList', 'residentList', '2022-03-06 15:01:15', 0);
INSERT INTO `tb_menu` VALUES (9, '高危住户', 2, 'el-icon-warning-outline', 'resident/HighRisk', 'highRisk', '2022-03-06 15:01:39', 0);
INSERT INTO `tb_menu` VALUES (10, '住户出入登记', 3, 'el-icon-notebook-2', 'access/ResidentAccess', 'residentAccess', '2022-03-06 15:01:43', 0);
INSERT INTO `tb_menu` VALUES (11, '访客出入登记', 3, 'el-icon-s-check', 'access/VisitorAccess', 'visitorAccess', '2022-03-06 15:01:46', 0);
INSERT INTO `tb_menu` VALUES (12, '住户出入信息管理', 3, 'el-icon-document', 'access/ResidentInfo', 'residentInfo', '2022-03-06 15:01:50', 0);
INSERT INTO `tb_menu` VALUES (13, '访客出入信息管理', 4, 'el-icon-document', 'visitor/VisitorInformation', 'visitorInformation', '2022-03-06 15:01:55', 0);
INSERT INTO `tb_menu` VALUES (14, '用户管理信息', 5, 'el-icon-user', 'sys/User', 'user', '2022-03-06 15:01:58', 0);
INSERT INTO `tb_menu` VALUES (15, '注册码信息', 5, 'el-icon-menu', 'sys/Code', 'code', '2022-03-06 15:02:03', 0);
INSERT INTO `tb_menu` VALUES (16, '地址管理', 7, 'el-icon-s-home\r\n', 'other/Address', 'address', '2022-03-06 15:02:07', 0);
INSERT INTO `tb_menu` VALUES (17, '垃圾箱管理', NULL, 'el-icon-delete', NULL, NULL, '2022-03-19 16:06:36', 0);
INSERT INTO `tb_menu` VALUES (18, '访客出入信息', 17, 'el-icon-coin', 'dustbin/VisitorInformationDustbin', 'visitorInformationDustbin', '2022-03-19 16:07:02', 0);
INSERT INTO `tb_menu` VALUES (19, '住户信息', 17, 'el-icon-coin', 'dustbin/ResidentListDustbin', 'residentListDustbin', '2022-03-19 16:07:19', 0);
INSERT INTO `tb_menu` VALUES (20, '住户出入信息', 17, 'el-icon-coin', 'dustbin/ResidentInfoDustbin', 'residentInfoDustbin', '2022-03-19 16:07:36', 0);

-- ----------------------------
-- Table structure for tb_resident
-- ----------------------------
DROP TABLE IF EXISTS `tb_resident`;
CREATE TABLE `tb_resident`  (
  `res_id` int(5) NOT NULL AUTO_INCREMENT,
  `res_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `res_sex` int(1) NOT NULL DEFAULT 1 COMMENT '0女1男',
  `res_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `res_intotime` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '入住时间',
  `res_remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注',
  `res_state` int(1) NOT NULL DEFAULT 0 COMMENT '0低风险1中风险2高风险',
  `res_status` int(1) NOT NULL DEFAULT 0 COMMENT '0 正常 1 被删除',
  PRIMARY KEY (`res_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 60 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_resident
-- ----------------------------
INSERT INTO `tb_resident` VALUES (1, '王志刚', 1, '13205431010', '2022-02-21 15:39:13', NULL, 0, 1);
INSERT INTO `tb_resident` VALUES (2, '安邦 ', 1, '13205431001', '2022-02-21 15:39:13', '11', 0, 1);
INSERT INTO `tb_resident` VALUES (3, '海亦', 0, '13205431002', '2022-02-21 15:39:13', NULL, 2, 0);
INSERT INTO `tb_resident` VALUES (4, '初晴', 0, '13205431003', '2022-02-21 15:39:13', NULL, 1, 0);
INSERT INTO `tb_resident` VALUES (5, '安萱', 0, '13205431004', '2022-02-21 15:39:13', NULL, 0, 1);
INSERT INTO `tb_resident` VALUES (6, '李进', 1, '13205431004', '2022-04-21 15:39:13', NULL, 2, 0);
INSERT INTO `tb_resident` VALUES (7, '李奎', 1, '13205431005', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (8, '李楠', 1, '13205431006', '2022-04-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (9, '李柏', 1, '13205431007', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (10, '李旭', 1, '13205431009', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (11, '李恒', 1, '13205431008', '2022-04-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (12, '尤政航', 1, '13205431111', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (13, '邬肖任', 1, '13205431044', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (14, '程欢亭', 0, '13205431055', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (15, '孙彩武', 1, '13205431033', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (16, '陈莉汐', 0, '13205431032', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (17, '尤帅齐', 1, '13205431031', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (18, '刘枝迟', 0, '13205431030', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (19, '陈仓翼', 1, '13205431023', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (20, '吴资龙', 1, '13205431022', '2022-02-21 15:39:13', NULL, 1, 0);
INSERT INTO `tb_resident` VALUES (21, '岑刚飘', 1, '13205431021', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (22, '费宜鸿', 1, '13205431020', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (23, '张津广', 1, '13205431019', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (24, '梁胤鸣', 1, '13205431018', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (25, '蒋进如', 1, '13205431017', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (26, '孙剑佛', 1, '13205431016', '2022-02-21 15:39:13', NULL, 1, 0);
INSERT INTO `tb_resident` VALUES (27, '魏成贯', 1, '13205431015', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (28, '卫耿羿', 1, '13205431014', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (29, '林豪谱', 1, '13205431013', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (30, '谢协湃', 1, '13205431012', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (31, '吕聪', 1, '13205431011', '2022-02-21 15:39:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (40, '李娜', 0, '13205433427', '2022-02-15 00:00:00', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (41, '王红', 0, '13205433427', '2022-02-15 00:00:00', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (42, '王娜', 0, '13205433427', '2022-02-15 00:00:00', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (43, '王潇', 0, '13205433427', '2022-02-15 00:00:00', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (44, '刘潇', 0, '13205433427', '2022-08-15 00:00:00', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (45, '王伟', 1, '13205433427', '2022-08-15 00:00:00', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (46, '张三', 0, '13209865434', '2022-02-23 00:00:00', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (47, '王五', 1, '13245345321', '2022-02-23 00:00:00', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (48, '赵六', 1, '17866713344', '2022-02-23 00:00:00', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (49, '王搜索', 1, '17866712222', '2022-11-08 19:41:15', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (50, '王菲菲', 0, '13205431111', '2022-03-08 20:05:02', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (51, '王菲', 0, '13205431122', '2022-12-08 20:05:20', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (52, '王奋斗', 1, '13205430000', '2022-03-08 20:06:52', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (54, '王直观', 1, '13254321111', '2022-03-08 20:19:11', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (55, '王公公', 1, '13207654444', '2022-07-08 20:53:13', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (56, '王方程', 1, '13209876666', '2022-03-08 20:58:57', NULL, 0, 0);
INSERT INTO `tb_resident` VALUES (57, '王丰 ', 1, '13205431100', '2022-03-15 20:22:25', 'King', 0, 0);
INSERT INTO `tb_resident` VALUES (59, '王伟', 1, '13205433232', '2022-03-22 17:08:36', NULL, 0, 0);

-- ----------------------------
-- Table structure for tb_resident_info
-- ----------------------------
DROP TABLE IF EXISTS `tb_resident_info`;
CREATE TABLE `tb_resident_info`  (
  `res_info_id` int(10) NOT NULL AUTO_INCREMENT,
  `res_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `res_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `res_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `temperature` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `res_state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `res_address_id` int(10) NOT NULL,
  `info_remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `info_time` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0),
  `info_status` int(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`res_info_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_resident_info
-- ----------------------------
INSERT INTO `tb_resident_info` VALUES (1, '王志刚', '13205431010', '0', '36.5', '0', 1, '打工', '2022-03-12 15:34:27', 1);
INSERT INTO `tb_resident_info` VALUES (2, '王志刚', '13205431010', '0', '36.5', '2', 1, '探亲', '2022-03-15 14:30:41', 0);
INSERT INTO `tb_resident_info` VALUES (3, '王志刚', '13205431010', '1', '38', '2', 1, '', '2022-03-22 17:07:50', 0);
INSERT INTO `tb_resident_info` VALUES (4, '王志刚', '13205431010', '1', '38', '2', 1, '', '2022-03-22 17:07:52', 0);
INSERT INTO `tb_resident_info` VALUES (5, '王志刚', '13205431010', '1', '36.5', '0', 1, '', '2022-03-22 17:09:05', 0);

-- ----------------------------
-- Table structure for tb_role
-- ----------------------------
DROP TABLE IF EXISTS `tb_role`;
CREATE TABLE `tb_role`  (
  `role_id` int(4) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_role
-- ----------------------------
INSERT INTO `tb_role` VALUES (1, 'admin');
INSERT INTO `tb_role` VALUES (2, 'user');

-- ----------------------------
-- Table structure for tb_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `tb_role_menu`;
CREATE TABLE `tb_role_menu`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `menu_id` int(11) NULL DEFAULT NULL,
  `role_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 38 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_role_menu
-- ----------------------------
INSERT INTO `tb_role_menu` VALUES (1, 1, 1);
INSERT INTO `tb_role_menu` VALUES (2, 2, 1);
INSERT INTO `tb_role_menu` VALUES (3, 3, 1);
INSERT INTO `tb_role_menu` VALUES (4, 4, 1);
INSERT INTO `tb_role_menu` VALUES (5, 5, 1);
INSERT INTO `tb_role_menu` VALUES (6, 6, 1);
INSERT INTO `tb_role_menu` VALUES (7, 7, 1);
INSERT INTO `tb_role_menu` VALUES (8, 8, 1);
INSERT INTO `tb_role_menu` VALUES (9, 9, 1);
INSERT INTO `tb_role_menu` VALUES (10, 10, 1);
INSERT INTO `tb_role_menu` VALUES (11, 11, 1);
INSERT INTO `tb_role_menu` VALUES (12, 12, 1);
INSERT INTO `tb_role_menu` VALUES (13, 13, 1);
INSERT INTO `tb_role_menu` VALUES (14, 14, 1);
INSERT INTO `tb_role_menu` VALUES (15, 15, 1);
INSERT INTO `tb_role_menu` VALUES (16, 16, 1);
INSERT INTO `tb_role_menu` VALUES (17, 17, 1);
INSERT INTO `tb_role_menu` VALUES (18, 18, 1);
INSERT INTO `tb_role_menu` VALUES (19, 19, 1);
INSERT INTO `tb_role_menu` VALUES (20, 20, 1);
INSERT INTO `tb_role_menu` VALUES (21, 1, 2);
INSERT INTO `tb_role_menu` VALUES (22, 2, 2);
INSERT INTO `tb_role_menu` VALUES (23, 3, 2);
INSERT INTO `tb_role_menu` VALUES (24, 4, 2);
INSERT INTO `tb_role_menu` VALUES (25, 6, 2);
INSERT INTO `tb_role_menu` VALUES (26, 7, 2);
INSERT INTO `tb_role_menu` VALUES (27, 8, 2);
INSERT INTO `tb_role_menu` VALUES (28, 9, 2);
INSERT INTO `tb_role_menu` VALUES (29, 10, 2);
INSERT INTO `tb_role_menu` VALUES (30, 11, 2);
INSERT INTO `tb_role_menu` VALUES (31, 12, 2);
INSERT INTO `tb_role_menu` VALUES (32, 13, 2);
INSERT INTO `tb_role_menu` VALUES (33, 16, 2);
INSERT INTO `tb_role_menu` VALUES (34, 17, 2);
INSERT INTO `tb_role_menu` VALUES (35, 18, 2);
INSERT INTO `tb_role_menu` VALUES (36, 19, 2);
INSERT INTO `tb_role_menu` VALUES (37, 20, 2);

-- ----------------------------
-- Table structure for tb_user
-- ----------------------------
DROP TABLE IF EXISTS `tb_user`;
CREATE TABLE `tb_user`  (
  `user_id` int(4) NOT NULL AUTO_INCREMENT,
  `account` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` int(1) NOT NULL DEFAULT 0,
  `head` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 17 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user
-- ----------------------------
INSERT INTO `tb_user` VALUES (1, 'tom', 'af273e4bd9d8ea190d271848709dbfc9', '汤姆', 'tom@163.com', '东土大唐', '13205432224', 0, 'http://127.0.0.1:8088/file/5e73d4c13f0348d9a528b9237822d4a4.jpg');
INSERT INTO `tb_user` VALUES (2, 'jack', 'f80bde343bc4077e98fffa91dd24e8a2', '杰克', NULL, NULL, '13205438888', 0, 'http://127.0.0.1:8088/file/5e73d4c13f0348d9a528b9237822d4a4.jpg');
INSERT INTO `tb_user` VALUES (7, 'ccc', '8a04ae6f5d16a806f571b1d266b995e1', '丽萨', NULL, NULL, '13205439999', 0, NULL);
INSERT INTO `tb_user` VALUES (8, 'juery', 'f35d4a8bdd59225375661a767bf93b9e', '杰瑞', NULL, NULL, '15864349952', 0, NULL);
INSERT INTO `tb_user` VALUES (9, 'jms', 'db9ba50b30d9616fc49f9408c2e3359d', '詹姆斯', NULL, NULL, '15864349952', 0, NULL);
INSERT INTO `tb_user` VALUES (10, 'baoluo', '0489ff3a2b79306af5b06fe043f7685c', '保罗', NULL, NULL, '13205437788', 0, NULL);
INSERT INTO `tb_user` VALUES (11, 'toma', '983b94b2af9bf4fb58452b6cec63e992', '汤姆', NULL, NULL, '13205436666', 0, NULL);
INSERT INTO `tb_user` VALUES (12, 'jacka', 'a694ecf793b97fe77e6f2da2999ff380', '杰克', NULL, NULL, '13205438888', 0, NULL);
INSERT INTO `tb_user` VALUES (13, 'jacl', '0481e94c4ad515f0c6f87c449cdfbace', '杰克', NULL, NULL, '17866711111', 0, NULL);
INSERT INTO `tb_user` VALUES (14, 'tomcc', 'c11127bb486521ff3463885bedcbda6b', '汤姆', NULL, NULL, '13205432323', 0, NULL);
INSERT INTO `tb_user` VALUES (15, 'wangzg', 'dcda789fcc554bd4d770bb2bbb4950df', '王志刚', NULL, NULL, '17866713386', 0, 'http://127.0.0.1:8088/file/bb9f10a5aa724375a8e2cdf58635b453.jpg');
INSERT INTO `tb_user` VALUES (16, 'wangxy', '05c1417c2d774438ac24c861a568f91f', '王志刚', NULL, NULL, '17866713386', 0, NULL);

-- ----------------------------
-- Table structure for tb_user_role
-- ----------------------------
DROP TABLE IF EXISTS `tb_user_role`;
CREATE TABLE `tb_user_role`  (
  `user_role_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`user_role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户角色表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_user_role
-- ----------------------------
INSERT INTO `tb_user_role` VALUES (1, 1, 1);
INSERT INTO `tb_user_role` VALUES (2, 2, 2);
INSERT INTO `tb_user_role` VALUES (3, 7, 2);
INSERT INTO `tb_user_role` VALUES (4, 8, 1);
INSERT INTO `tb_user_role` VALUES (5, 9, 2);
INSERT INTO `tb_user_role` VALUES (6, 10, 1);
INSERT INTO `tb_user_role` VALUES (7, 11, 2);
INSERT INTO `tb_user_role` VALUES (8, 12, 1);
INSERT INTO `tb_user_role` VALUES (9, 13, 1);
INSERT INTO `tb_user_role` VALUES (10, 14, 1);
INSERT INTO `tb_user_role` VALUES (11, 15, 1);
INSERT INTO `tb_user_role` VALUES (12, 16, 2);

-- ----------------------------
-- Table structure for tb_visitor
-- ----------------------------
DROP TABLE IF EXISTS `tb_visitor`;
CREATE TABLE `tb_visitor`  (
  `visitor_id` int(5) NOT NULL AUTO_INCREMENT,
  `address_id` int(5) NOT NULL,
  `vis_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `vis_phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `vis_remark` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `vis_helth_code` int(1) NOT NULL DEFAULT 0 COMMENT '健康码',
  `vis_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '访客的地址',
  `temperature` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '体温 ',
  `vis_time` datetime(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0),
  `vis_type` int(255) NOT NULL COMMENT '0进 1 出',
  `vis_status` int(1) NOT NULL DEFAULT 0,
  PRIMARY KEY (`visitor_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_visitor
-- ----------------------------
INSERT INTO `tb_visitor` VALUES (1, 2, '张飞', '13205438888', '探亲', 0, '东土大唐', '36.5', '2022-02-24 14:27:47', 0, 1);
INSERT INTO `tb_visitor` VALUES (2, 2, '张三', '13205432222', '探亲', 0, '西天', '36.5', '2022-02-03 00:00:00', 0, 1);
INSERT INTO `tb_visitor` VALUES (5, 2, '王志刚', '13205431111', '讨债', 1, '西天', '36.5', '2022-03-01 00:00:00', 1, 0);
INSERT INTO `tb_visitor` VALUES (6, 1, '行者孙', '13205436666', '探亲', 0, '东土大唐', '36.5', '2022-03-15 19:26:07', 1, 0);
INSERT INTO `tb_visitor` VALUES (7, 2, '王志刚', '17866713386', '', 1, '东土大唐', '36.5', '2022-04-22 16:51:34', 1, 0);

SET FOREIGN_KEY_CHECKS = 1;
