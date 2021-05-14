create database if not EXISTS QuanLySinhVien;
use QuanLySinhVien;
create table if not EXISTS Class(
Class_ID int not null auto_increment,
Class_Name varchar(60) not null,
Start_Date datetime not null,
Status bit,
primary key(Class_ID)
);

create table if not EXISTS Student(
Student_ID int not null auto_increment,
 Student_Name varchar(30) not null,
 Address varchar(50),
 Phone varchar(20),
 Status bit,
 Class_ID int not null,
 primary key(Student_ID),
 foreign key(Class_ID) references Class(Class_ID)
);
create table if not EXISTS Subject(
Sub_ID int not null auto_increment,
Sub_Name varchar(30) not null,
Credit tinyint not null default 1 check(Credit >=1),
Status bit default 1,
primary key(Sub_ID)
);
create table if not EXISTS Mark(
Mark_ID int not null auto_increment,
Sub_ID int not null,
Student_ID int not null,
Mark float default 0 check(Mark between 0 and 100),
Exam_Times tinyint default 1,
unique(Sub_ID,Student_ID),
primary key(Mark_ID),
foreign key(Sub_ID) references Subject(Sub_ID),
foreign key(Student_ID) references Student(Student_ID)
);
 -- DROP DATABASE quanlysinhvien;
/*CREATE table*/
INSERT INTO Class
VALUES (1, 'A1', '2008-12-20', 1),
		(2, 'A2', '2008-12-22', 1),
	    (3, 'B3', current_date, 0);
 
 INSERT INTO Student (Student_Name, Address, Phone, Status, Class_Id)
VALUES ('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO Student (Student_Name, Address, Status, Class_Id)
VALUES ('Hoa', 'Hai phong', 1, 1);
INSERT INTO Student (Student_Name, Address, Phone, Status, Class_Id)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);
       
INSERT INTO Subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
INSERT INTO Mark (Sub_Id, Student_Id, Mark, Exam_Times)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
       
