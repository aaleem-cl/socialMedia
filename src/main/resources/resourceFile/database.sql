//Add your Db queries related here
//User_creation
CREATE TABLE `socialplatform`.`user_creation` (
  `user_id` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(100) NULL,
  `password` VARCHAR(50) NOT NULL,
  `username` VARCHAR(50) NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE);
 //Insert query
 INSERT INTO `socialplatform`.`user_creation` (`user_id`, `email`, `password`, `username`)
 VALUES ('2', 'Abc@gmail.com', 'tuxvfgh23', 'Sahil');