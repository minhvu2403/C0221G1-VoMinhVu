package model.repository;

import model.bean.employee.Division;
import model.bean.employee.EducationDegree;
import model.bean.employee.Employee;
import model.bean.employee.Position;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository extends  BaseRepository {
    BaseRepository baseRepository = new BaseRepository();
    public static final String INSERT_NEW_EMPLOYEE = "insert into employee (employee_name,employee_birthday, employee_id_card, employee_phone,employee_salary, employee_email, employee_address, position_id, education_degree_id,division_id, username) value (?, ?, ?,?,?,?,?,?,?,?,?)";
    private static final String SELECT_EMPLOYEE_BY_ID=" SELECT employee_id,employee_name,employee_birthday,employee_id_card,employee_phone,employee_salary,employee_email,employee_address,position_name,education_degree_name,division_name,username FROM employee INNER JOIN positions on positions.position_id =employee.position_id INNER JOIN education_degree on education_degree.education_degree_id=employee.education_degree_id INNER JOIN division on division.division_id=employee.division_id WHERE employee.employee_id=?;";
    private static final String SELECT_ALL_EMPLOYEE = "select* from employee";
    private static final String DELETE_EMPLOYEE_SQL = "delete from employee where employee.employee_id=?;";
    private static final String UPDATE_EMPLOYEE_BY_ID ="update employee set employee_name = ?,employee_birthday= ?, employee_id_card =?,employee_phone=?,employee_salary=?,employee_email=?,employee_address=?,position_id=?,education_degree_id=?,division_id=?,username=? where employee_id = ?;";
    public static final String FIND_BY_EMPLOYEE_NAME = "select * from employee where employee_name like concat('%',?,'%')";
    private final String SELECT_ALL_POSITION = "select * from positions";
    private final String SELECT_ALL_EDUCATION_DEGREE = "select * from education_degree";
    private final String SELECT_ALL_DIVISION = "select * from division";

    public List<Employee> findByAll() {
        Connection connection = baseRepository.connectDataBase();
        List<Employee> employeeList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE);
            ResultSet resultSet = preparedStatement.executeQuery();// dùng cho câu lệnh select;
            while (resultSet.next()) { // duyệt trên từng hàng của bảng
                int id = Integer.parseInt(resultSet.getString("employee_id"));
                String name = resultSet.getString("employee_name");
                String birthday = resultSet.getString("employee_birthday");
                String idCard = resultSet.getString("employee_id_card");
                String phone = resultSet.getString("employee_phone");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                double salary = resultSet.getDouble("employee_salary");
                String position = resultSet.getString("position_id");
                String educationDegree = resultSet.getString("education_degree_id");
                String division = resultSet.getString("division_id");
                String username = resultSet.getString("username");
                Employee employee = new Employee(id, name, birthday, idCard, phone, email, address, salary, position, educationDegree, division, username);
                employeeList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employeeList;
    }

    public Employee findById(int id) {
        Connection connection = baseRepository.connectDataBase();
        Employee employee = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_EMPLOYEE_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id1 = Integer.parseInt(resultSet.getString("employee_id"));
                String name = resultSet.getString("employee_name");
                String birthday = resultSet.getString("employee_birthday");
                String idCard = resultSet.getString("employee_id_card");
                String phone = resultSet.getString("employee_phone");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                double salary = resultSet.getDouble("employee_salary");
                String position = resultSet.getString("position_name");
                String educationDegree = resultSet.getString("education_degree_name");
                String division = resultSet.getString("division_name");
                String username = resultSet.getString("username");
                employee = new Employee(id, name, birthday, idCard, phone, email, address, salary, position, educationDegree, division, username);
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }
    public boolean update(int id,Employee employee){
        Connection connection =baseRepository .connectDataBase();
        boolean check=false;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE_BY_ID);
            preparedStatement.setString(1,employee.getName());
            preparedStatement.setString(2,employee.getBirthday());
            preparedStatement.setString(3,employee.getIdCard());
            preparedStatement.setString(4,employee.getPhone());
            preparedStatement.setDouble(5,employee.getSalary());
            preparedStatement.setString(6,employee.getEmail());
            preparedStatement.setString(7,employee.getAddress());
            preparedStatement.setString(8,employee.getPosition());
            preparedStatement.setString(9,employee.getEducationDegree());
            preparedStatement.setString(10,employee.getDivision());
            preparedStatement.setString(11,employee.getUsername());
            preparedStatement.setInt(12,employee.getId());
            check = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
          e.printStackTrace();
        }
        return check;
    }

    public boolean delete(int id){
        boolean rowDeleted = false;
        try (
                Connection connection = baseRepository.connectDataBase();
                PreparedStatement statement = connection.prepareStatement(DELETE_EMPLOYEE_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowDeleted;
    }
    public void add (Employee employee){
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW_EMPLOYEE);
            preparedStatement.setString(1,employee.getName());
            preparedStatement.setString(2,employee.getBirthday());
            preparedStatement.setString(3,employee.getIdCard());
            preparedStatement.setString(4,employee.getPhone());
            preparedStatement.setDouble(5,employee.getSalary());
            preparedStatement.setString(6,employee.getEmail());
            preparedStatement.setString(7,employee.getAddress());
            preparedStatement.setString(8,employee.getPosition());
            preparedStatement.setString(9,employee.getEducationDegree());
            preparedStatement.setString(10,employee.getDivision());
            preparedStatement.setString(11,employee.getUsername());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> findByName(String name){
        Connection connection = baseRepository.connectDataBase();
        List<Employee> employees = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(FIND_BY_EMPLOYEE_NAME);
            statement.setString(1, name);
            resultSet = statement.executeQuery();
            Employee employee = null;
            while (resultSet.next()) {
                int id=  resultSet.getInt("employee_id");
                String name1 = resultSet.getString("employee_name");
                String birthday = resultSet.getString("employee_birthday");
                String idCard = resultSet.getString("employee_id_card");
                String phone = resultSet.getString("employee_phone");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                double salary = resultSet.getDouble("employee_salary");
                String position = resultSet.getString("position_id");
                String educationDegree = resultSet.getString("education_degree_id");
                String division = resultSet.getString("division_id");
                String username = resultSet.getString("username");
                employee = new Employee(id, name1, birthday, idCard, phone, email, address, salary, position, educationDegree, division, username);
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
        return employees;
    }


    public List<Position> findAllPosition() {
        Connection connection = baseRepository.connectDataBase();
        List<Position> positions = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_POSITION);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int position_id = resultSet.getInt("position_id");
                String position_name = resultSet.getString("position_name");
                positions.add(new Position(position_id, position_name));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return positions;
    }
    public List<EducationDegree> findAllEducationDegree() {
        Connection connection = baseRepository.connectDataBase();

        List<EducationDegree> educationDegrees = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_EDUCATION_DEGREE);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int eduction_degree_id = resultSet.getInt("education_degree_id");
                String eduction_degree_name = resultSet.getString("education_degree_name");
                educationDegrees.add(new EducationDegree(eduction_degree_id, eduction_degree_name));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return educationDegrees;
    }

    public List<Division> findAllDivision() {
        Connection connection = baseRepository.connectDataBase();

        List<Division> divisions = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_DIVISION);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int division_id = resultSet.getInt("division_id");
                String division_name = resultSet.getString("division_name");
                divisions.add(new Division(division_id, division_name));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return divisions;
    }

}

