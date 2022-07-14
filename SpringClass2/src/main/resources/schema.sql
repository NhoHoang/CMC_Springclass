DROP TABLE IF EXISTS Users;
CREATE TABLE Users (
    `id` SMALLINT AUTO_INCREMENT PRIMARY KEY,
    `name` VARCHAR(50) NOT NULL UNIQUE,
    `gender` varchar(50),
    `department_id` SMALLINT
);

-- INSERT INTO Users (`name`, `gender`, `department_id`)
-- VALUES ('Hoang trong nho', 'm',1);