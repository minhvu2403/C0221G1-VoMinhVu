package model.service.customer;

import model.bean.customer.Customer;
import model.bean.customer.CustomerType;

import java.util.List;

public interface IEmCustomerService {
    List<Customer> findByAll();

    Customer findById(int id);

    boolean update(int id, Customer customer);

    void add(Customer customer);

    boolean remove(int id);

    List<Customer> findByName(String name);

     List<CustomerType> findAllCustomerTye();

}
