package com.customer.controller;

import com.customer.model.Customer;
import com.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("")
    public String getList(Model model) {
        List<Customer> customerList = this.customerService.findAll();
        model.addAttribute("customers", customerList);
        return "index";
    }

    @GetMapping("/create")
    public String createCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @GetMapping("/save")
    public String saveCustomer(Customer customer) {
        this.customerService.save(customer);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editCustomer(@PathVariable int id, Model model) {
        model.addAttribute("customer", this.customerService.findById(id));
        return "edit";
    }

    @PostMapping("/update")
    public String updateCustomer(Customer customer) {
        this.customerService.save(customer);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id, Model model) {
        model.addAttribute("customer", this.customerService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String deleteCustomer(Customer customer, RedirectAttributes redirect) {
        this.customerService.remove(customer.getId());
        redirect.addFlashAttribute("msg", "Remove customer successfully");
        return "redirect:/";
    }

    @GetMapping("/view/{id}")
    public String viewCustomer(@PathVariable int id, Model model) {
        model.addAttribute("customer", this.customerService.findById(id));
        return "view";
    }

}
