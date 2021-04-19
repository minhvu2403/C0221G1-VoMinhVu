package case_study.models;

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
        return "Employee{" +
                "idEmployee='" + idEmployee + '\'' +
                ", level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(this.toString());
    }
}
