create database if not EXISTS QuanLySinhVien;
use QuanLySinhVien;
create table if not EXISTS Class(
ClassID int not null auto_increment,
ClassName varchar(60) not null,
StartDate datetime not null,
Status bit,
primary key(ClassID)
);

create table if not EXISTS Student(
StudentID int not null auto_increment,
 StudentName varchar(30) not null,
 Address varchar(50),
 Phone varchar(20),
 Status bit,
 ClassID int not null,
 primary key(StudentID),
 foreign key(ClassID) references Class(ClassID)
);
create table if not EXISTS Subject(
SubID int not null auto_increment,
SubName varchar(30) not null,
Credit tinyint not null default 1 check(Credit >=1),
Status bit default 1,
primary key(SubID)
);
create table if not EXISTS Mark(
MarkID int not null auto_increment,
SubID int not null,
StudentID int not null,
Mark float default 0 check(Mark between 0 and 100),
ExamTimes tinyint default 1,
unique(SubID,StudentID),
primary key(MarkID),
foreign key(SubID) references Subject(SubID),
foreign key(StudentID) references Student(StudentID)
);
 -- DROP DATABASE quanlysinhvien;
/*CREATE table*/
INSERT INTO Class
VALUES (1, 'A1', '2008-12-20', 1),
		(2, 'A2', '2008-12-22', 1),
	    (3, 'B3', current_date, 0);
 
 INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO Student (StudentName, Address, Status, ClassId)
VALUES ('Hoa', 'Hai phong', 1, 1);
INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);
       
INSERT INTO Subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
       
INSERT INTO Mark (SubId, StudentId, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
       
/*truy van CSDL*/
SELECT *FROM quanlysinhvien.class;
SELECT *FROM quanlysinhvien.mark;
SELECT *FROM quanlysinhvien.student;
SELECT *FROM quanlysinhvien.subject;
SELECT * FROM quanlysinhvien.student WHERE student.Status=true;
SELECT *FROM quanlysinhvien.subject WHERE Credit<10;
SELECT S.StudentID,S.StudentName,C.ClassName
FROM Student S JOIN Class C on S.StudentID=C.ClassID;
SELECT S.StudentID,S.StudentName,C.ClassName
FROM Student S JOIN Class C ON S.ClassID=C.ClassID WHERE C.ClassName='A1';
SELECT S.StudentID,S.StudentName,Sub.SubName,M.Mark
FROM Student S JOIN Mark M on S.StudentID=M.StudentID JOIN Subject Sub on M.SubID=Sub.SubID;
SELECT S.StudentId, S.StudentName, Sub.SubName, M.Mark
FROM Student S join Mark M on S.StudentId = M.StudentId join Subject Sub on M.SubId = Sub.SubId
WHERE Sub.SubName = 'CF';