package com.product.controller;

import com.product.model.bean.Product;
import com.product.model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/product")
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("")
    public String index(Model model){
        List<Product> productList=productService.findByAll();
       model.addAttribute("products",productList);
       model.addAttribute("product",new Product());
        return "index";
    }
    @GetMapping(value = "/save")
    public String create( @ModelAttribute Product product,  Model model ){
          product.setId((int)(Math.random()*100));
        model.addAttribute("products",new Product());
        productService.save(product);
        return "redirect:/product/";
    }
    @GetMapping (value = "/delete")
    public String delete(@PathVariable int id,Model model){
        model.addAttribute("product",this.productService.findById(id));
       return "index";
    }



}
