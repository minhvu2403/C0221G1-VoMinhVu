package model.service.employee;

import model.bean.employee.Division;
import model.bean.employee.EducationDegree;
import model.bean.employee.Employee;
import model.bean.employee.Position;

import java.util.List;

public interface IEmployeeService {

    List<Employee> findByAll();

    Employee findById(int id);

    boolean update(int id, Employee employee);

    void add(Employee employee);

    boolean remove(int id);

    List<Employee> findByName(String name);
    List<Position> findAllPosition();
    List<EducationDegree>findAllEducationDegree();
    List<Division> findAllDivision();


}
