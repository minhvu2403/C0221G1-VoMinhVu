package model.bean.employee;

import model.bean.Person;

public class Employee extends Person implements Comparable<Employee> {
    private double salary;
    private String position;
    private String educationDegree;
    private String division;
    private String username;

    public Employee() {
    }

    public Employee(int id, String name, String birthday, String idCard, String phone, String email, String address, double salary, String position, String educationDegree, String division, String username) {
        super(id, name, birthday, idCard, phone, email, address);
        this.salary = salary;
        this.position = position;
        this.educationDegree = educationDegree;
        this.division = division;
        this.username = username;
    }

    public Employee(String name, String birthday, String idCard, String phone, String email, String address, double salary, String position, String educationDegree, String division, String username) {
        super(name, birthday, idCard, phone, email, address);
        this.salary = salary;
        this.position = position;
        this.educationDegree = educationDegree;
        this.division = division;
        this.username = username;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.getName().compareTo(employee.getName() );
    }
}
