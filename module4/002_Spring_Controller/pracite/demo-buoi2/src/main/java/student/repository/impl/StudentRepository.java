package student.repository.impl;

import org.springframework.stereotype.Repository;
import student.model.Student;
import student.repository.IStudentRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
@Repository
public class StudentRepository implements IStudentRepository {
    private static Map<Integer, Student> studentMap;
    static {
        studentMap=new TreeMap<>();
        studentMap.put(123,new Student(123,"Nguyen van A","2000-06-05"));
        studentMap.put(456,new Student(456,"Nguyen van D","2004-05-02"));
        studentMap.put(789,new Student(789,"Nguyen van B","2009-01-06"));
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(studentMap.values());
    }

    @Override
    public void save(Student student) {
        int idAutoIncrement=(int)(Math.random()*1000);
        student.setId(idAutoIncrement);
        studentMap.put(student.getId(),student);

    }

    @Override
    public Student findById(Integer id) {
        return studentMap.get(id);
    }
}
