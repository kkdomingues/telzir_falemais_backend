DROP TABLE IF EXISTS minute_price;

CREATE TABLE minute_price (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  origin VARCHAR(3) NOT NULL,
  destiny VARCHAR(3) NOT NULL,
  price FLOAT NOT NULL
);

INSERT INTO minute_price (origin, destiny, price) VALUES
  ('011', '016', 1.9),
  ('016', '011', 2.9),
  ('011', '017', 1.7),
  ('017', '011', 2.7),
  ('011', '018', 0.9),
  ('018', '011', 1.9);