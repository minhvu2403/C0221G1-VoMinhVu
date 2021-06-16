package student.service;

import student.model.Student;

import java.util.List;

public interface IStudentService {
    void save(Student student);
    List<Student> findAll();
    Student findById(Integer id);
}
