USE demomvc;
CREATE TABLE Person (
  id int(11) unsigned NOT NULL AUTO_INCREMENT,
  firstname varchar(20) NOT NULL DEFAULT '',
  lastname varchar(20) NOT NULL DEFAULT '',
   PRIMARY KEY (id)
)  AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;