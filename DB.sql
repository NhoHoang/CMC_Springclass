-- Drop the database if it already exists
DROP DATABASE IF EXISTS Mock_Project_2;
-- Create database
CREATE DATABASE IF NOT EXISTS Mock_Project_2;
USE Mock_Project_2;

-- Create table user
DROP TABLE IF EXISTS 	`User`;
CREATE TABLE IF NOT EXISTS `User` (
    `id` SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(50) NOT NULL UNIQUE,
    `gender` varchar(50),
    `department_id` SMALLINT UNSIGNED
    
    --  FOREIGN KEY (department_id)  REFERENCES `Department` (id)
);
-- Create table Permission
DROP TABLE IF EXISTS 	`Permission`;
CREATE TABLE IF NOT EXISTS `Permission` (
    `id` SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `permission_name` VARCHAR(500) NOT NULL
);

DROP TABLE IF EXISTS 	`User_Permission`;
CREATE TABLE IF NOT EXISTS `User_Permission` (
--     `id` SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY ,
    `user_id` SMALLINT UNSIGNED,
    `permission_id` SMALLINT UNSIGNED,
    FOREIGN KEY (user_id)  REFERENCES `User` (id),
       
    FOREIGN KEY (permission_id) REFERENCES `Permission` (id),
      
        PRimary KEY (user_id,permission_id)
);

CREATE TABLE IF NOT EXISTS `Department` (
    `id` SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(500) NOT NULL

   
);

INSERT INTO `User` 	(`name`,`gender`, `department_id`	)
VALUE						('Hà Văn Hanh', 'UNKNOWN','1'), 
							('Hà Văn oai', 'MALE','1'), 
							('Hà Văn Long', 'FEMALE','1'), 
							('Hà Văn Nou', 'MALE','1'), 
							('Hà Văn Po', 'FEMALE','2'), 
							('Hà Văn Quy', 'MALE','6');
                     -- MALE
                     -- FEMALE
                     -- UNKNOWN
INSERT INTO `Permission` (`permission_name`	)
VALUE				('Permission 1'), 
					('Permission 2'), 
                    ('Permission 3'), 
                    ('Permission 4'), 
                    ('Permission 5'), 
                    ('Permission 6');
                    
INSERT INTO `User_Permission` (`user_id`,`permission_id`)
VALUE			    
        (1,2),
        (1,3),
        (2,2),
        (2,3),
        (3,1),
        (2,4),
        (3,6),
        (5,5),
        (4,5),
        (3,5),
        (6,5);
                    

INSERT INTO `Department` (`name`)
VALUE				('Department 1'), 
					('Department 2'), 
                    ('Department 3'), 
                    ('Department 4'), 
                    ('Department 5'), 
                    ('Department 6');
                    
                    
					