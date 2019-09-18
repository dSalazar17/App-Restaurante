-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema DBRestaurante
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema DBRestaurante
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DBRestaurante` DEFAULT CHARACTER SET utf8 ;
USE `DBRestaurante` ;

-- -----------------------------------------------------
-- Table `DBRestaurante`.`Area`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante`.`Area` (
  `idarea` INT NOT NULL,
  `nombrearea` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idarea`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante`.`Mesero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante`.`Mesero` (
  `idmesero` INT NOT NULL,
  `nombremesero` VARCHAR(45) NOT NULL,
  `apellidomesero` VARCHAR(45) NOT NULL,
  `edad` VARCHAR(45) NOT NULL,
  `calificacion` VARCHAR(45) NOT NULL,
  `idarea` INT NOT NULL,
  PRIMARY KEY (`idmesero`),
  INDEX `idArea_idx` (`idarea` ASC) VISIBLE,
  CONSTRAINT `idArea`
    FOREIGN KEY (`idarea`)
    REFERENCES `DBRestaurante`.`Area` (`idarea`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante`.`Mesa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante`.`Mesa` (
  `idmesa` INT NOT NULL,
  `totalpersonas` INT NOT NULL,
  PRIMARY KEY (`idmesa`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante`.`Clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante`.`Clientes` (
  `idclientes` INT NOT NULL,
  `nombrec` VARCHAR(45) NOT NULL,
  `apellidosc` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `tipocliente` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idclientes`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante`.`Platos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante`.`Platos` (
  `idplatos` INT NOT NULL,
  `nombreplato` VARCHAR(45) NOT NULL,
  `tipoplato` VARCHAR(45) NOT NULL,
  `precioplato` DOUBLE NOT NULL,
  PRIMARY KEY (`idplatos`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante`.`detalleorden`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante`.`detalleorden` (
  `iddetalleorden` INT NOT NULL,
  `idplatos` INT NOT NULL,
  `precioventa` DOUBLE NOT NULL,
  `cantidad` DOUBLE NOT NULL,
  `totalpagar` DOUBLE NOT NULL,
  PRIMARY KEY (`iddetalleorden`),
  INDEX `FK_idplato_idx` (`idplatos` ASC) VISIBLE,
  CONSTRAINT `FK_idplato`
    FOREIGN KEY (`idplatos`)
    REFERENCES `DBRestaurante`.`Platos` (`idplatos`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante`.`Orden`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante`.`Orden` (
  `idorden` INT NOT NULL,
  `idmesa` INT NOT NULL,
  `idmesero` INT NOT NULL,
  `idcliente` INT NOT NULL,
  `iddetalleorden` INT NOT NULL,
  PRIMARY KEY (`idorden`),
  INDEX `FK_idmesa_idx` (`idmesa` ASC) VISIBLE,
  INDEX `FK_idmesero_idx` (`idmesero` ASC) VISIBLE,
  INDEX `FK_idcliente_idx` (`idcliente` ASC) VISIBLE,
  INDEX `FK_iddetalleorden_idx` (`iddetalleorden` ASC) VISIBLE,
  CONSTRAINT `FK_idmesa`
    FOREIGN KEY (`idmesa`)
    REFERENCES `DBRestaurante`.`Mesa` (`idmesa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_idmesero`
    FOREIGN KEY (`idmesero`)
    REFERENCES `DBRestaurante`.`Mesero` (`idmesero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_idcliente`
    FOREIGN KEY (`idcliente`)
    REFERENCES `DBRestaurante`.`Clientes` (`idclientes`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_iddetalleorden`
    FOREIGN KEY (`iddetalleorden`)
    REFERENCES `DBRestaurante`.`detalleorden` (`iddetalleorden`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante`.`Cocinero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante`.`Cocinero` (
  `idCocinero` INT NOT NULL,
  `nomcroco` VARCHAR(45) NOT NULL,
  `apellidoco` VARCHAR(45) NOT NULL,
  `especialidad` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCocinero`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `DBRestaurante`.`Factura`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DBRestaurante`.`Factura` (
  `idfactura` INT NOT NULL,
  `idcliente` INT NOT NULL,
  `nodeorden` INT NOT NULL,
  `cocineroresponsable` INT NOT NULL,
  `totalapagar` DOUBLE NOT NULL,
  PRIMARY KEY (`idfactura`),
  INDEX `FK_idorden_idx` (`nodeorden` ASC) VISIBLE,
  INDEX `FK_idcocinero_idx` (`cocineroresponsable` ASC) VISIBLE,
  CONSTRAINT `FK_idorden`
    FOREIGN KEY (`nodeorden`)
    REFERENCES `DBRestaurante`.`Orden` (`idorden`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `FK_idcocinero`
    FOREIGN KEY (`cocineroresponsable`)
    REFERENCES `DBRestaurante`.`Cocinero` (`idCocinero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
