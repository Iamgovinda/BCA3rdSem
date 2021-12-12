CREATE SCHEMA `kinbech` ;
CREATE TABLE `kinbech`.`category` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `Name` VARCHAR(45) NOT NULL,
  `Description` TINYTEXT NULL,
  PRIMARY KEY (`id`));








ALTER TABLE `kinbech`.`product` 
ADD COLUMN `name` VARCHAR(45) NOT NULL AFTER `category_id`,
ADD COLUMN `price` INT NOT NULL AFTER `name`,
ADD UNIQUE INDEX `name_UNIQUE` (`name` ASC);
;


CREATE TABLE `kinbech`.`product_category` (
  `product_id` INT NOT NULL,
  PRIMARY KEY (`product_id`),
  CONSTRAINT `fk_productid_to_category`
    FOREIGN KEY (`product_id`)
    REFERENCES `kinbech`.`product` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);
