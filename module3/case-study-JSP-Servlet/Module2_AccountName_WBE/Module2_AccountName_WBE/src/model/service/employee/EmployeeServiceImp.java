package model.service.employee;

import model.bean.employee.Division;
import model.bean.employee.EducationDegree;
import model.bean.employee.Employee;
import model.bean.employee.Position;
import model.repository.EmployeeRepository;

import java.util.List;

public class EmployeeServiceImp implements IEmployeeService {
    EmployeeRepository employeeRepository =new EmployeeRepository();

    @Override
    public List<Employee> findByAll() {
        return employeeRepository.findByAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeRepository.findById(id);
    }

    @Override
    public boolean update(int id, Employee employee) {
        return employeeRepository.update(id,employee);
    }

    @Override
    public void add(Employee employee) {
        employeeRepository.add(employee);

    }

    @Override
    public boolean remove(int id) {
        return employeeRepository.delete(id);
    }

    @Override
    public List<Employee> findByName(String name) {
        return employeeRepository.findByName(name);
    }

    @Override
    public List<Position> findAllPosition() {
        return employeeRepository.findAllPosition();
    }

    @Override
    public List<EducationDegree> findAllEducationDegree() {
        return employeeRepository.findAllEducationDegree();
    }

    @Override
    public List<Division> findAllDivision() {
        return employeeRepository.findAllDivision();
    }
}
