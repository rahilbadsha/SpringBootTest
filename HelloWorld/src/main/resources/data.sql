DROP TABLE IF EXISTS billionaires;
 DROP TABLE IF EXISTS item;
CREATE TABLE billionaires (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250) DEFAULT NULL
);
 
INSERT INTO billionaires (first_name, last_name, career) VALUES
  ('Aliko', 'Dangote', 'Billionaire Industrialist'),
  ('Bill', 'Gates', 'Billionaire Tech Entrepreneur'),
  ('Folrunsho', 'Alakija', 'Billionaire Oil Magnate');
  
  CREATE TABLE item (
  id INT(11) NOT NULL,
  name VARCHAR(50) NULL DEFAULT NULL,
  category VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (id)
);

INSERT INTO item VALUES (1, 'IPhone 6S', 'Mobile');
INSERT INTO item  VALUES (2, 'Samsung Galaxy', 'Mobile');
INSERT INTO item  VALUES (3, 'Lenovo', 'Laptop');
INSERT INTO item  VALUES (4, 'LG', 'Telivision');
