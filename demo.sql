CREATE DATABASE `demo` CHARACTER SET utf8 COLLATE utf8_general_ci;
DROP TABLE IF EXISTS `demo`.`student`;
CREATE TABLE `demo`.`student` (
  `id` bigint(64) NOT NULL COMMENT '主键id',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE DATABASE `demo2` CHARACTER SET utf8 COLLATE utf8_general_ci;
DROP TABLE IF EXISTS `demo2`.`person`;
CREATE TABLE `demo2`.`person` (
  `id` bigint(64) NOT NULL COMMENT '主键id',
  `name` varchar(20) DEFAULT NULL COMMENT '姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
