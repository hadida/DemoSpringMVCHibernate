CREATE USER 'demo'@'localhost' IDENTIFIED BY 'demo';  CREATE DATABASE demomvc; 
CREATE USER 'demo'@'%'         IDENTIFIED BY 'demo';  CREATE DATABASE demomvc; 

CREATE DATABASE DemoMVC; 
ALTER DATABASE  DemoMVC charset=utf8;            

GRANT ALL PRIVILEGES ON demomvc.* TO 'demo'@'localhost'  WITH GRANT OPTION; 
GRANT ALL PRIVILEGES ON demomvc.* TO 'demo'@'%'          WITH GRANT OPTION;  
FLUSH PRIVILEGES;

