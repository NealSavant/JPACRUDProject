-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema aquarium
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `aquarium` ;

-- -----------------------------------------------------
-- Schema aquarium
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `aquarium` DEFAULT CHARACTER SET utf8 ;
USE `aquarium` ;

-- -----------------------------------------------------
-- Table `organism`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `organism` ;

CREATE TABLE IF NOT EXISTS `organism` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `type` VARCHAR(45) NOT NULL,
  `life_span_years` INT NULL,
  `color` VARCHAR(45) NOT NULL,
  `gender` ENUM('m', 'f', 'na') NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS hobbyist@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'hobbyist'@'localhost' IDENTIFIED BY 'aqua1';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'hobbyist'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `organism`
-- -----------------------------------------------------
START TRANSACTION;
USE `aquarium`;
INSERT INTO `organism` (`id`, `name`, `type`, `life_span_years`, `color`, `gender`) VALUES (1, 'Shrimp', 'Cherry Shrimp', 1, 'Red', 'm');
INSERT INTO `organism` (`id`, `name`, `type`, `life_span_years`, `color`, `gender`) VALUES (2, 'Shrimp', 'Cherry Srhimp', 1, 'Orange', 'm');
INSERT INTO `organism` (`id`, `name`, `type`, `life_span_years`, `color`, `gender`) VALUES (3, 'Fish', 'Guppy', 3, 'Yellow', 'm');
INSERT INTO `organism` (`id`, `name`, `type`, `life_span_years`, `color`, `gender`) VALUES (4, 'Fish', 'Guppy', 3, 'Black', 'f');
INSERT INTO `organism` (`id`, `name`, `type`, `life_span_years`, `color`, `gender`) VALUES (5, 'Fish', 'Guppy', 3, 'Orange', 'm');
INSERT INTO `organism` (`id`, `name`, `type`, `life_span_years`, `color`, `gender`) VALUES (6, 'Snail', 'Ramshorn Snail', 1, 'Brown', NULL);
INSERT INTO `organism` (`id`, `name`, `type`, `life_span_years`, `color`, `gender`) VALUES (7, 'Snail', 'Trumpet Snail', 1, 'Brown', NULL);

COMMIT;

