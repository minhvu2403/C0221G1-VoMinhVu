CREATE DATABASE student_management;
USE student_management;
CREATE TABLE student(
id INT NOT NULL,
`name` VARCHAR(50) NULL,
age INT NULL,
country VARCHAR(45) NULL,
PRIMARY KEY(id)
);