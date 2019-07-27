DROP TABLE IF EXISTS `d_user`;
CREATE TABLE `d_user`  (
`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
`username` varchar(255)NULL DEFAULT NULL COMMENT '用户名',
`created_on` TIMESTAMP NULL DEFAULT NULL COMMENT '创建时间',
PRIMARY KEY(`id`)
);