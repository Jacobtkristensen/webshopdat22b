DROP DATABASE IF EXISTS  `webshopdat22b`;
CREATE SCHEMA `webshopdat22b`;
CREATE TABLE `webshopdat22b`.`products` (
                                            `id` INT NOT NULL AUTO_INCREMENT,
                                            `name` VARCHAR(45) NOT NULL,
                                            `price` DECIMAL(13,2) NULL,
                                            PRIMARY KEY (`id`));
INSERT INTO `webshopdat22b`.`products` (`name`, `price`) values ('Tuborg', '25.00');
INSERT INTO `webshopdat22b`.`products` (`name`, `price`)  values ('Carlsberg', '25.00');