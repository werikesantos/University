SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `colecao` DEFAULT CHARACTER SET utf8;

use colecao;

CREATE TABLE IF NOT EXISTS `colecao`.`Pokemon` (
  `idPokemon` INT(11) NOT NULL,
  `nome` VARCHAR(45) NOT NULL,
  `dataCaptura` DATE NOT NULL,
  `cp` INT(11) NOT NULL,
  `idTipo` INT(11) NOT NULL,
  PRIMARY KEY (`idPokemon`),
  INDEX `fk_Pokemon_Tipo_idx` (`idTipo` ASC),
  CONSTRAINT `fk_Pokemon_Tipo`
    FOREIGN KEY (`idTipo`)
    REFERENCES `colecao`.`Tipo` (`idTipo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `colecao`.`Tipo` (
  `idTipo` INT(11) NOT NULL,
  `nomeTipo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idTipo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

INSERT INTO Tipo (idTipo, nomeTipo) VALUES (1, "Fogo"), (2, "Água"), (3, "Grama"), (4, "Elétrico"), (5, "Terrestre"), (6, "Voador");

INSERT INTO Pokemon (idPokemon, nome, dataCaptura, cp, idTipo) VALUES 
(1, "Charmander", "2018-10-22", 760, 1),
(2, "Charmeleon", "2018-10-26", 3503, 1),
(3, "Flareon", "2018-10-27", 1234, 1),
(4, "Vaporeon", "2018-10-28", 740, 2),
(5, "Magikarp", "2018-10-29", 688, 2),
(6, "Gyarados", "2018-11-3", 1662, 2),
(7, "Chikorita", "2018-11-6", 640, 3),
(8, "Bayleef", "2018-11-8", 888, 3),
(9, "Bellossom", "2018-11-9", 1017, 3);


 
