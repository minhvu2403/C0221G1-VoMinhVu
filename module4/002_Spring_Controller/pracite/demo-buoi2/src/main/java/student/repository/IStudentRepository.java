package student.repository;

import student.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    void save(Student student);
    Student findById(Integer id);
}
