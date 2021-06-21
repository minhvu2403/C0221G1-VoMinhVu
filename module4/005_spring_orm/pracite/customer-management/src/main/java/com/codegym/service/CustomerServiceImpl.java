package com.codegym.service;

import com.codegym.entity.Customer;
import com.codegym.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return this.customerRepository.findAll();
    }

    @Override
    public void save(Customer customer) {
        this.customerRepository.save(customer);
    }

    @Override
    public Customer findById(Integer id) {
        return this.customerRepository.findById(id);
    }

    @Override
    public void update(Customer customer) {
         this.customerRepository.update(customer);

    }

    @Override
    public void remove(Integer id) {
     this.customerRepository.remove(id);
    }
}
