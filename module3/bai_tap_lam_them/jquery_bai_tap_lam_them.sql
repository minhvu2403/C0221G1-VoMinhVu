use bai_tap_lam_them;

SELECT* FROM faculty;
SELECT* FROM intructor;
SELECT* FROM intructor_student;
SELECT* FROM project;
SELECT* FROM student;
  SET SQL_SAFE_UPDATES = 0;
DELETE FROM faculty;
DELETE FROM intructor;
DELETE FROM intructor_student;
DELETE FROM project;
DELETE FROM student;
  SET SQL_SAFE_UPDATES = 1;
  -- PHAN 1
/*1.Đưa ra thông tin gồm mã số, họ tên và tên khoa của tất cả các giảng viên*/
SELECT IT.intructor_id,intructor_name,faculty.faclty_name FROM intructor IT INNER JOIN faculty on IT.faculty_id=faculty.faculty_id;


/*2.Đưa ra thông tin gồm mã số, họ tên và tên khoa của các giảng viên của khoa ‘DIA LY va Toan’*/
SELECT IT.intructor_id,intructor_name,faculty.faclty_name
 FROM intructor IT
 INNER JOIN faculty on IT.faculty_id=faculty.faculty_id
 WHERE faculty.faclty_name IN('Khoa Dia','Khoa Toan');


/*3.Cho biết số sinh viên của khoa ‘LY’*/
SELECT faculty.faclty_name, COUNT(student.student_id) as 'so luong sinh vien'
FROM faculty INNER JOIN student on faculty.faculty_id=student.faculty_id
WHERE faculty.faclty_name='Khoa Ly'
 GROUP BY faculty.faculty_id;
 
 
 /*4.Đưa ra danh sách gồm mã số, họ tên và tuổi của các sinh viên khoa ‘TOAN’*/
 SELECT SV.student_id,student_name,date_of_birth
 FROM student SV  
 JOIN faculty FLT on SV.faculty_id=FLT.faculty_id
 WHERE 	FLT.faclty_name='Khoa Toan';
 
 
 /*5.Cho biết số giảng viên của khoa ‘Ly’*/
 SELECT faculty.faclty_name, count(intructor.intructor_id) as 'so luong giang vien'
FROM faculty INNER JOIN intructor on intructor.faculty_id=faculty.faculty_id
 WHERE faculty.faclty_name='Khoa Ly'
  GROUP BY faculty.faculty_id;
  
  
  /*6.Cho biết thông tin về sinh viên không tham gia thực tập*/
  SELECT SV.student_id,student_name,date_of_birth,plaxe_of_birth 
  FROM student SV 
  INNER JOIN intructor_student  ITS on SV.student_id=ITS.student_id
  INNER JOIN project PJ on  ITS.project_id=PJ.project_id
  WHERE PJ.project_id is NULL;
  
  
  /*7.Đưa ra mã khoa, tên khoa và số giảng viên của mỗi khoa*/
  SELECT FT.faculty_id,faclty_name,count(intructor.intructor_id) as 'so luong giang vien'
  FROM faculty FT INNER JOIN intructor on intructor.faculty_id=FT.faculty_id
  GROUP BY intructor.faculty_id;
  
  
  /*8.Cho biết số điện thoại của khoa mà sinh viên có tên ‘Nguyen Thi Dinh’ đang theo học*/
  SELECT FT.faclty_name,phone FROM faculty FT INNER JOIN student SV on FT.faculty_id=SV.faculty_id
  WHERE SV.student_name='Nguyen Thi Dinh';
  
  -- PHAN 2 
  
  /*1 Cho biết mã số và tên của các đề tài do giảng viên ‘Nguyen Thi Hue’ hướng dẫn*/
  SELECT ITT.faculty_id,intructor_name,project.project_name
  FROM intructor ITT
  INNER JOIN intructor_student ITS on ITT.intructor_id=ITS.intructor_id 
  INNER JOIN project on project.project_id=ITS.project_id
   WHERE ITT.intructor_name='Nguyen Thi Hue';
   
   /*2.Cho biết tên đề tài không có sinh viên nào thực tập*/
   SELECT project.project_name FROM project
   WHERE NOT EXISTS(SELECT intructor_student.project_id FROM intructor_student 
   WHERE project.project_id=intructor_student.project_id); 
   
   
  /*3.Cho biết mã số, họ tên, tên khoa của các giảng viên hướng dẫn từ 3 sinh viêntrở lên*/
  SELECT ITR.intructor_id,intructor_name,faculty.faclty_name
  FROM intructor ITR
  INNER JOIN faculty on faculty.faculty_id=ITR.faculty_id
  INNER JOIN intructor_student on intructor_student.intructor_id=ITR.intructor_id
  GROUP BY ITR.intructor_id
  HAVING COUNT(intructor_student.student_id)>3;
  
  /*4.Cho biết mã số, tên đề tài của đề tài có kinh phí cao nhất*/
  SELECT project.project_id,project_name,max(project.expense) as 'kinh phi'FROM project;
  
  
/*5.Cho biết mã số và tên các đề tài có nhiều hơn 2 sinh viên tham gia thực tập*/
SELECT PJ.project_id,project_name 
FROM project PJ INNER JOIN intructor_student ITS on ITS.project_id=PJ.project_id
GROUP BY ITS.project_id
HAVING COUNT(ITS.intructor_id)>2; 


/*6.Đưa ra mã số, họ tên và điểm của các sinh viên khoa ‘DIALY và Sinh’*/
 SELECT student.student_id,student.student_name, intructor_student.grade ,faculty.faclty_name
 FROM student  INNER JOIN intructor_student on student.student_id=intructor_student.student_id
 INNER JOIN faculty on faculty.faculty_id =student.faculty_id
 WHERE faculty.faclty_name in('Khoa Dia','Khoa Ly');
 
 
 /*7.Đưa ra tên khoa, số lượng sinh viên của mỗi khoa*/
  SELECT faculty.faclty_name ,COUNT(student.student_id) as 'so luong sinh vien'
  FROM student INNER JOIN faculty on student.faculty_id=faculty.faculty_id
  GROUP BY faculty.faculty_id;
  
  
  /* 8 Cho biết thông tin về các sinh viên thực tập tại quê nhà*/
   SELECT student.student_id ,student_name ,faculty_id ,date_of_birth ,plaxe_of_birth FROM student
    JOIN intructor_student on intructor_student.student_id=student.student_id
    JOIN  project on project.project_id=intructor_student.project_id
   WHERE project.place_of_intem=student.plaxe_of_birth;
   
   
   /*9 Hãy cho biết thông tin về những sinh viên chưa có điểm thực tập*/
   SELECT student.student_id ,student_name ,faculty_id ,date_of_birth ,plaxe_of_birth 
   FROM student 
	   INNER JOIN intructor_student ITS on student.student_id=ITS.student_id
	   WHERE ITS.grade is NULL;
       
       
   /*10 Đưa ra danh sách gồm mã số, họ tên các sinh viên có điểm thực tập bằng 0*/
     SELECT student.student_id ,student_name ,faculty_id ,date_of_birth ,plaxe_of_birth 
      FROM student 
		  INNER JOIN intructor_student ITS on student.student_id=ITS.student_id
		  WHERE ITS.grade=0;

