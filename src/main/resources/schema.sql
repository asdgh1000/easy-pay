DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission`(
`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '姓名',
`permissionUrl` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '许可url',
`method` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '方法',
`description` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '描述',
PRIMARY KEY(id)
) ENGINE = InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '权限';

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`cname` VARCHAR(50) NOT NULL DEFAULT '' COMMENT 'cname',
`username` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '用户名',
`password` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '密码',
`email` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '电子邮箱',
`telephone` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '电话',
`mobile_phone` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '座机电话',
PRIMARY KEY(id)
) ENGINE = InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '用户信息';

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`(
`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '名称',
`description` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '描述',
PRIMARY KEY(id)
) ENGINE = InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '用户信息';

DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`(
`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`user_id` BIGINT(20) NOT NULL DEFAULT 0 COMMENT '用户id',
`role_id` BIGINT(20) NOT NULL DEFAULT 0 COMMENT '角色id',
`description` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '描述',
PRIMARY KEY(id)
) ENGINE = InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '用户信息';

DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission`(
`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
`role_id` BIGINT(20) NOT NULL DEFAULT 0 COMMENT '角色id',
`permission_id` BIGINT(20) NOT NULL DEFAULT 0 COMMENT '权限id',
`name` VARCHAR(50) NOT NULL DEFAULT '' COMMENT '名称',
`description` VARCHAR(255) NOT NULL DEFAULT '' COMMENT '描述',
PRIMARY KEY(id)
) ENGINE = InnoDB DEFAULT CHARSET=utf8mb4 COMMENT = '用户信息';

insert into user (cname,username,password,email,telephone,mobile_phone) VALUES("da","admin","a1d83431229cbda302fb33f24276c446","2394562735@qq.com","18868831752","435345");
insert into user (cname,username,password,email,telephone,mobile_phone) VALUES("da","admin","admin","2394562735@qq.com","18868831752","435345");
insert into role (name,description) VALUES ('admin','管理员');
insert into role (name,description) VALUES ('user','用户');
insert into permission(name,permissionUrl,method) VALUES('read','/','read');
insert into user_role(user_id,role_id) VALUES(1,1);
insert into role_permission(role_id,permission_id) VALUES(1,1);
