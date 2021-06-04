package model.repository;

import model.bean.customer.Customer;
import model.bean.customer.CustomerType;
import model.bean.employee.Employee;
import model.bean.employee.Position;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository extends BaseRepository {
    BaseRepository baseRepository = new BaseRepository();
    public static final String INSERT_NEW_EMPLOYEE = "insert into customer (customer_name,customer_birthday,customer_gender, customer_id_card,customer_phone,customer_email,customer_address,customer_type_id) value (?, ?, ?,?,?,?,?,?)";
    private static final String SELECT_CUSTOMER_BY_ID=" SELECT customer_id,customer_name,customer_birthday,customer_gender,customer_id_card,customer_phone,customer_email,customer_address,customer_type_name FROM customer left join customer_type on customer_type.customer_type_id =customer.customer_type_id WHERE customer.customer_id=?;";
    private static final String SELECT_ALL_CUSTOMER = "select* from customer";
    private static final String DELETE_EMPLOYEE_SQL = "delete from customer where customer.customer_id=?;";
    private static final String UPDATE_EMPLOYEE_BY_ID ="update customer set customer_name = ?,customer_birthday= ?,customer_gender=?, customer_id_card =?,customer_phone=?,customer_email=?,customer_address=?,customer_type_id=? where customer_id = ?;";
    public static final String FIND_BY_CUSTOMER_NAME = "select * from customer where customer_name like concat('%',?,'%')";
    private final String SELECT_ALL_CUSTOMER_TYPE = "select * from customer_type";


    public List<Customer> findByAll() {
        Connection connection = baseRepository.connectDataBase();
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            ResultSet resultSet = preparedStatement.executeQuery();// dùng cho câu lệnh select;
            while (resultSet.next()) { // duyệt trên từng hàng của bảng
                int id = Integer.parseInt(resultSet.getString("customer_id"));
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                String gender = resultSet.getString("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                String customerType = resultSet.getString("customer_type_id");
                Customer customer =new Customer(id,name,birthday,idCard,phone,email,address,gender,customerType);
                customerList.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    public Customer findById(int id) {
        Connection connection = baseRepository.connectDataBase();
        Customer customer = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
            preparedStatement.setInt(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id1 = Integer.parseInt(resultSet.getString("customer_id"));
                String name = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                String gender = resultSet.getString("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                String customerType = resultSet.getString("customer_type_name");
                 customer =new Customer(id,name,birthday,idCard,phone,email,address,gender,customerType);

            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }
    public boolean update(int id,Customer customer){
        Connection connection =baseRepository .connectDataBase();
        boolean check=false;
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_EMPLOYEE_BY_ID);
            preparedStatement.setString(1,customer.getName());
            preparedStatement.setString(2,customer.getBirthday());
            preparedStatement.setInt(3, Integer.parseInt(customer.getGender()));
            preparedStatement.setString(4,customer.getIdCard());
            preparedStatement.setString(5,customer.getPhone());
            preparedStatement.setString(6,customer.getEmail());
            preparedStatement.setString(7,customer.getAddress());
            preparedStatement.setString(8,customer.getCustomerType());
            preparedStatement.setInt(9,customer.getId());
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
    public void add (Customer customer){
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW_EMPLOYEE);
            preparedStatement.setString(1,customer.getName());
            preparedStatement.setString(2,customer.getBirthday());
            preparedStatement.setInt(3, Integer.parseInt(customer.getGender()));
            preparedStatement.setString(4,customer.getIdCard());
            preparedStatement.setString(5,customer.getPhone());
            preparedStatement.setString(6,customer.getEmail());
            preparedStatement.setString(7,customer.getAddress());
            preparedStatement.setString(8,customer.getCustomerType());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Customer> findByName(String name){
        Connection connection = baseRepository.connectDataBase();
        List<Customer> customers = new ArrayList<>();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(FIND_BY_CUSTOMER_NAME);
            statement.setString(1, name);
            resultSet = statement.executeQuery();
            Customer customer = null;
            while (resultSet.next()) {
                int id = Integer.parseInt(resultSet.getString("customer_id"));
                String name1 = resultSet.getString("customer_name");
                String birthday = resultSet.getString("customer_birthday");
                String gender = resultSet.getString("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                String customerType = resultSet.getString("customer_type_id");
                customer =new Customer(id,name1,birthday,idCard,phone,email,address,gender,customerType);
                customers.add(customer);

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
        return customers;
    }
    public List<CustomerType> findAllCustomerType() {
        Connection connection = baseRepository.connectDataBase();
        List<CustomerType> customerTypes = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_CUSTOMER_TYPE);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int customer_type_id = resultSet.getInt("customer_type_id");
                String customer_type_name = resultSet.getString("customer_type_name");
                customerTypes.add(new CustomerType(customer_type_id, customer_type_name));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerTypes;
    }

}
