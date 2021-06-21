package com.codegym.service;

import com.codegym.entity.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(Integer id);

    void update( Customer customer);

    void remove(Integer id);
}
