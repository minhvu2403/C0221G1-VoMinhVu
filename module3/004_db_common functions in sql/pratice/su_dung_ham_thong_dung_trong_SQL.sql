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
   /*truy van CSDL*/
SELECT *FROM quanlysinhvien.class;
SELECT *FROM quanlysinhvien.mark;
SELECT *FROM quanlysinhvien.student;
SELECT *FROM quanlysinhvien.subject;

/*try van*/
/*Bước 2: Sử dụng hàm count để hiển thị số lượng sinh viên ở từng nơi*/
SELECT Address, COUNT(student_id) as'So luong hoc vien' FROM student GROUP BY Address;
/* Bước 3: Tính điểm trung bình các môn học của mỗi học viên bằng cách sử dụng hàm AVG*/

SELECT S.student_id,S.student_name ,AVG(mark) FROM student S JOIN mark M ON S.Student_ID=M.Student_ID
GROUP BY S.Student_ID,S.Student_Name;
/*Bước 4: Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
Đầu tiên hiển thị điểm trung bình các môn học của mỗi học viên*/
SELECT S.student_id,S.student_name ,AVG(mark) FROM student S JOIN mark M ON S.Student_ID=M.Student_ID
GROUP BY S.Student_ID,S.Student_Name
HAVING AVG(mark)>15;
/*Bước 5: Hiển thị thông tin các học viên có điểm trung bình lớn nhất.
Hiển thị danh sách điểm trung bình của các học viên*/
SELECT S.student_id,S.student_name ,AVG(mark) FROM student S JOIN mark M ON S.Student_ID=M.Student_ID
GROUP BY S.Student_ID,S.Student_Name
HAVING AVG(mark) >=ALL (SELECT avg(mark) FROM mark GROUP BY mark.Student_ID);