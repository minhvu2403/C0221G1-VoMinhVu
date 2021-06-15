package com.customer_management.service;

import com.customer_management.service.impl.SimpleCustomerServiceImpl;

public class CustomerServiceFactory {
    private static CustomerService singleton;
    public static synchronized CustomerService getInstance() {
        if (singleton == null) {
            singleton = new SimpleCustomerServiceImpl();
        }
        return singleton;
    }
}
