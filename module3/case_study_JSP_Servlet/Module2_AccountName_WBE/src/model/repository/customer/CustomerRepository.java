package model.repository.customer;

import model.bean.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerRepository {
    private static Map<Integer, Customer> customers;

    static {
        customers = new HashMap<>();
        customers.put(1, new Customer("1", "Vu", "12/05/2011", "123", "0123456789", "abc@gmail.com", "Da Nang", "Nam", "Vip"));
        customers.put(2, new Customer("2", "Long", "12/04/2000", "456", "0123456789", "def@gmail.com", "Hue", "Nam", "Thuong"));
        customers.put(3, new Customer("3", "Hieu", "12/05/2011", "789", "0123456789", "deds@gmail.com", "Da Nang", "Nam", "Vip"));
        customers.put(5, new Customer("4", "Vu", "12/05/2011", "123", "0123456789", "abc@gmail.com", "Da Nang", "Nam", "Vip"));
        customers.put(6, new Customer("4", "Vu", "12/05/2011", "123", "0123456789", "abc@gmail.com", "Da Nang", "Nam", "Vip"));
        customers.put(7, new Customer("4", "Vu", "12/05/2011", "123", "0123456789", "abc@gmail.com", "Da Nang", "Nam", "Vip"));
    }

    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }

    public Customer findById(String id) {
        return customers.get(id);
    }

    public void saveCustomer(Customer customer) {
        customers.put(Integer.parseInt(customer.getId()), customer);
    }

    public void updateCustomer(String id, Customer customer) {
        customers.put(Integer.parseInt(id), customer);
    }
    public void deleteCustomer(String id) {
        customers.remove(id);
    }


}
