# CREATE DATABASE if not exists meta_data;
#
use meta_data;

-- 表一 User
CREATE TABLE IF NOT EXISTS `sys_user`(
	`id` INT PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(200) NOT NULL,
	`password` VARCHAR(200) NOT NULL,
	`created_date`  TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modified_date` TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
    index idx_name (`name`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 表二 DataBase
CREATE TABLE IF NOT EXISTS `sys_database`(
	`id` INT PRIMARY KEY AUTO_INCREMENT,
	`user_id` INT NOT NULL,
	`name` VARCHAR(200) NOT NULL,
	`created_date`  TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `modified_date` TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
	index (`user_id`),
	index idx_user_id_name (`user_id`, `name`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 表三 Table
CREATE TABLE IF NOT EXISTS `sys_table`(
	`id` INT PRIMARY KEY AUTO_INCREMENT,
	`db_id` INT NOT NULL,
	`name` VARCHAR(200) NOT NULL,
	`storage_engine` VARCHAR(200) NOT NULL,
	`created_date`  TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
	index (`db_id`),
    index idx_db_id_name (`db_id`, `name`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 表四 Field
CREATE TABLE IF NOT EXISTS `sys_field`(
	`id` INT PRIMARY KEY AUTO_INCREMENT,
	`table_id` INT NOT NULL,
	`name` VARCHAR(200) NOT NULL,
	`type` VARCHAR(200) NOT NULL,
	`is_primary` TINYINT NOT NULL COMMENT '0:非主键、1:主键',
	index (`table_id`),
    index idx_table_id_name (`table_id`, `name`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
