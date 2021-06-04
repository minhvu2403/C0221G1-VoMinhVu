package model.bean.customer;

import model.bean.Person;
import model.bean.employee.Employee;

public class Customer extends Person implements Comparable<Customer> {
    private  String gender;
    private String customerType;
    public Customer() {
    }

    public Customer(int id, String name, String birthday, String idCard, String phone, String email, String address, String gender, String customerType) {
        super(id, name, birthday, idCard, phone, email, address);
        this.gender = gender;
        this.customerType = customerType;
    }

    public Customer(String name, String birthday, String idCard, String phone, String email, String address, String gender, String customerType) {
        super(name, birthday, idCard, phone, email, address);
        this.gender = gender;
        this.customerType = customerType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public int compareTo(Customer customer) {
        return this.getName().compareTo(customer.getName() );
    }
}
