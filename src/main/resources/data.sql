/*
--used for JDBC--
CREATE TABLE person
(
  id INTEGER NOT NULL,
  name VARCHAR(255) NOT NULL,
  location VARCHAR(255),
  birth_date TIMESTAMP,
  PRIMARY KEY(id)
);
*/

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10001, 'Hannah', 'Brighton', sysdate());

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10002, 'Bob', 'Hove', sysdate());

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (10003, 'Joe', 'Shoreham', sysdate());
