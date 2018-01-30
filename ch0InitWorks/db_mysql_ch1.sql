DROP TABLE IF EXISTS `youhua`.`userinfo`;
CREATE TABLE  `youhua`.`userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  'insertdate' date DEFAULT null,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;