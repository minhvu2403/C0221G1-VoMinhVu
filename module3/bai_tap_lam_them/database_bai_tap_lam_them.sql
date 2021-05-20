CREATE DATABASE bai_tap_lam_them;
use bai_tap_lam_them;
CREATE TABLE faculty(
faculty_id CHAR(10) PRIMARY KEY,
faclty_name CHAR(30),
phone CHAR(10)
);
CREATE TABLE  intructor(
intructor_id int PRIMARY KEY,
intructor_name CHAR(30),
salary DECIMAL(5,2),
faculty_id CHAR(10),
FOREIGN KEY (faculty_id )REFERENCES faculty(faculty_id) on update cascade on delete cascade
);

CREATE TABLE student(
 student_id int PRIMARY key,
 student_name CHAR(40),
 faculty_id CHAR(10),
 date_of_birth DATE,
 plaxe_of_birth  CHAR(30),
 FOREIGN KEY (faculty_id )REFERENCES faculty(faculty_id) on update cascade on delete cascade
);
CREATE TABLE project(
project_id CHAR(10) PRIMARY KEY,
project_name CHAR(30),
expense int,
place_of_intem CHAR(30)
);
CREATE TABLE intructor_student(
student_id int,
project_id CHAR(10),
intructor_id int ,
grade DECIMAL(5,2),
PRIMARY KEY(student_id),
FOREIGN KEY(intructor_id ) REFERENCES intructor(intructor_id) on update cascade on delete cascade,
FOREIGN KEY(project_id ) REFERENCES project(project_id) on update cascade on delete cascade,
FOREIGN KEY(student_id ) REFERENCES student(student_id) on update cascade on delete cascade
);

INSERT INTO faculty(faculty_id,faclty_name,phone )
VALUES
('ST01','Khoa Toan','0123123234'),
('VL01','Khoa Ly','0325683163'),
('LS02','Khoa Su','0325687867'),
('DL01', 'Khoa Dia', '0123456789'),
('HH02','Khoa Hoa','032568344');

INSERT INTO intructor(intructor_id ,intructor_name,salary ,faculty_id ) 
VALUES 
(1,'Nguyen Hoang Long','23.40','ST01'),
(2,'Nguyen Thi Hue','39.40','VL01'),
(3,'Nguyen Dinh Quy','13.40','LS02'),
(4,'Nguyen Kim Phung','60.40','HH02'),
(5,'Nguyen Hoang Hai','61.40','DL01');
INSERT INTO student(student_id ,student_name ,faculty_id ,date_of_birth ,plaxe_of_birth)
VALUES
(1,'Nguyen Thi Dinh','ST01','2001-03-12','Quang Nam'),
(2,'Tran Quang Huy','VL01','2002-12-07','Da Nang'),
(3,'Truong thi Thuy','LS02','1999-10-12','Hue'),
(4,'Nguyen Thi No','HH02','2003-11-12','Quang Nam'),
(5,'Nguyen Thi Hoa','DL01','2001-11-12','Quang Nam');

INSERT INTO project(project_id , project_name ,expense ,place_of_intem)
VALUES
('T01','Do thi ham so',1000,'Quang Nam'),
('V01','Chuyen dong deu',3000,'Hue'),
('S01','Cac trieu dai',5000,'Binh Dinh'),
('H01','Phan ung HH',4000,'Da Nang'),
('DL01','Moi Truong',5000,'Sai Gon');

INSERT INTO intructor_student(student_id ,project_id,intructor_id ,grade)
VALUES
(2,'V01','2',3.5),
(3,'S01','3',5.5),
(4,'H01','4',6.5),
(5,'DL01','5',8.5);

INSERT INTO intructor_student(student_id ,project_id,intructor_id )
VALUES
(1,'T01','1');