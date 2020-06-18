DROP TABLE IF EXISTS TB_EMPLOYEES;
 
CREATE TABLE TB_EMPLOYEES (
  employee_id    INT AUTO_INCREMENT  PRIMARY KEY,
  name  VARCHAR(250) NULL,
  cpf   VARCHAR(20) NULL,
  email VARCHAR(250) NULL
);
 
INSERT INTO TB_EMPLOYEES (name, cpf, email) VALUES
  ('Analu Hadassa',    '186.543.568-63', 'analu.hadassa@gmail.com'),
  ('Oliver Thales',    '678.900.580-39', 'oliver.thales@hotmail.com'),
  ('Rafael Lucca',     '775.235.013-38', 'rafael.lucca@yahoo.com'),
  ('Nathan Alexandre', '077.973.394-06', 'nathan.alexandre@globo.com'),
  ('Maya Manuela',     '834.292.132-82', 'maya.manuela@uol.com');
