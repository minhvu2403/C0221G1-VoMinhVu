package case_study.models;

import case_study.controllers.main_menu.MainController;

public class Employee extends Person {
 private String idEmployee;
 private  String level;
 private String  location;
 private String  department;
 private  double salary;

    public Employee(String fullName, String dateOfBirth, String sex, String idCard, String numberPhone, String email, String address, String idEmployee, String level, String location, String department, double salary) {
        super(fullName, dateOfBirth, sex, idCard, numberPhone, email, address);
        this.idEmployee = idEmployee;
        this.level = level;
        this.location = location;
        this.department = department;
        this.salary = salary;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getIdEmployee() + MainController.COMA +
                getFullName() + MainController.COMA +
                getDateOfBirth() + MainController.COMA +
                getSex() + MainController.COMA +
                getIdCard() + MainController.COMA +
                getNumberPhone() + MainController.COMA +
                getEmail() + MainController.COMA +
                getAddress() + MainController.COMA +
                getLevel() + MainController.COMA +
                getLocation() + MainController.COMA +
                getDepartment() + MainController.COMA +
                getSalary();
    }

    @Override
    public String showInfor() {
        return "\nID employee: " + getIdEmployee() +
                "\nFull name: " + getFullName() +
                "\nDate of birth: " + getDateOfBirth() +
                "\nRent type: " + getSex() +
                "\nID card: " + getIdCard() +
                "\nNumber phone: " + getNumberPhone() +
                "\nEmail: " + getEmail() +
                "\nAddress: " + getAddress() +
                "\nLevel: " + getLevel() +
                "\nLocation: " + getLocation() +
                "\nDepartment: " + getDepartment() +
                "\nSalary: " + getSalary() + " $\n";
    }

}
