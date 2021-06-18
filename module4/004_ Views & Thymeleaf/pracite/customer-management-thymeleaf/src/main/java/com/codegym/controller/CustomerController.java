package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import com.codegym.service.ICustomerService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("")
    public String index(Model model) {
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customers", customerList);
        return "index";
    }

    @GetMapping(value = "/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping(value = "/save")
    public String save(Customer customer, RedirectAttributes redirectAttributes) {
        customer.setId((int) (Math.random() * 10000));
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("msg", "Create Customer successfully");
        return "redirect:/customer/";
    }

    @GetMapping(value = "/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("customer", this.customerService.findById(id));
        return "edit";
    }

    @PostMapping(value = "/update")
    public String update(Customer customer) {
        customerService.update(customer.getId(), customer);
        return "redirect:/customer/";
    }

    @GetMapping(value = "/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("customer", this.customerService.findById(id));
        return "delete";
    }

    @PostMapping(value = "/delete")
    public String delete(Customer customer, RedirectAttributes redirect) {
        customerService.remove(customer.getId());
        redirect.addFlashAttribute("msg", "Removed customer successfully!");
        return "redirect:/customer/";
    }

    @GetMapping(value = "/{id}/view")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("customer", customerService.findById(id));
        return "view";
    }

}
