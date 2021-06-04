package model.service.customer;

import model.bean.customer.Customer;
import model.bean.customer.CustomerType;
import model.repository.CustomerRepository;

import java.util.List;

public class CustomerServiceImp implements  IEmCustomerService {
         CustomerRepository customerRepository =new CustomerRepository();
    @Override
    public List<Customer> findByAll() {
        return customerRepository.findByAll();
    }

    @Override
    public Customer findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public boolean update(int id, Customer customer) {
        return customerRepository.update(id,customer);
    }

    @Override
    public void add(Customer customer) {
 customerRepository.add(customer);
    }

    @Override
    public boolean remove(int id) {
        return customerRepository.delete(id);
    }

    @Override
    public List<Customer> findByName(String name) {
        return customerRepository.findByName(name);
    }

    @Override
    public List<CustomerType> findAllCustomerTye() {
        return customerRepository.findAllCustomerType();
    }
}
