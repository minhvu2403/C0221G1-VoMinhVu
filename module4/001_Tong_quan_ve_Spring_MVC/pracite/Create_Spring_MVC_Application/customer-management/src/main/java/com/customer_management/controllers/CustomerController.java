package com.customer_management.controllers;

import com.customer_management.model.Customer;
import com.customer_management.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CustomerController {
   @Autowired
    private CustomerService customerService;

    @GetMapping("")
    public String showList(Model model) {
        List<Customer> customers = customerService.findAll();
        model.addAttribute("customers", customers);
        return "customers/list";
    }
    @GetMapping("/info")
    public String showInfo(@RequestParam String id, Model model ){
        Customer customer = customerService.findId(Long.parseLong(id));
        model.addAttribute("customer",customer);
        return "/customers/info";
    }
}
