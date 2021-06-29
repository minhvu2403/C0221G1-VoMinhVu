package com.example.shoppingcart.controller;

import com.example.shoppingcart.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.shoppingcart.service.ProductService;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping
    public ModelAndView showHome(){
        return new ModelAndView("Product/home","listProduct", productService.findAll());
    }
    @GetMapping("/product/{id}")
    public ModelAndView showDetailPage(@PathVariable long id) {
        return new ModelAndView("Product/detail","product", productService.findById(id));
    }
    @GetMapping("product/create")
    public ModelAndView showCreatePage(){
        return new ModelAndView("Product/create", "product", new Product());
    }

    @PostMapping("product/create")
    public String createProduct(@ModelAttribute Product product, RedirectAttributes redirectAttributes){
        productService.save(product);
        redirectAttributes.addFlashAttribute("success","Create new product name: " + product.getName());
        return "redirect:/";
    }
}
