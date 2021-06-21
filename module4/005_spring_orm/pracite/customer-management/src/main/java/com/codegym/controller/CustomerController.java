package com.codegym.controller;

import com.codegym.entity.Customer;
import com.codegym.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping({"", "/list"})
    public String goCustomerList(Model model) {
        List<Customer> customerList = this.customerService.findAll();
        model.addAttribute("listCustomer", customerList);
        return "list_customer";
    }

    @GetMapping(value = "/{id}/view")
    public String goCustomerView(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", this.customerService.findById(id));
        return "view";
    }

    @GetMapping(value = "/create")
    public String create(Model model) {
        model.addAttribute("customer", new Customer());
        return "create";
    }

    @PostMapping(value = "/save")
    public String save(@ModelAttribute Customer customer, RedirectAttributes redirect) {
        this.customerService.save(customer);
        redirect.addFlashAttribute("msg", "Create Customer successfully");
        return "redirect:/customer/list";
    }

    @GetMapping(value = "/{id}/edit")
    public String goCustomerEdit(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", this.customerService.findById(id));
        return "edit";
    }

    @PostMapping(value = "/update")
    public String goCustomerUpdate(@ModelAttribute Customer customer, RedirectAttributes redirect) {
        this.customerService.update(customer);
        redirect.addFlashAttribute("msg", "Update Customer successfully");
        return "redirect:/customer/list";
    }

    @GetMapping(value = "/{id}/delete")
    public String goCustomerDelete(@PathVariable Integer id, Model model) {
        model.addAttribute("customer", this.customerService.findById(id));
        return "delete";
    }

    @PostMapping(value = "/delete")
    public String goCustomerDelete(Customer customer, RedirectAttributes redirect) {
        this.customerService.remove(customer.getId());
        redirect.addFlashAttribute("msg", "Removed  Customer successfully");
        return "redirect:/customer/list";
    }

}
