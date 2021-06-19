package com.product.controller;

import com.product.model.bean.Product;
import com.product.model.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
@RequestMapping("/")
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
    public String create(@ModelAttribute Product product, Model model, RedirectAttributes redirect){
          product.setId((int)(Math.random()*100));
        model.addAttribute("products",new Product());
        productService.save(product);
        redirect.addFlashAttribute("msg", "Create successfully");

        return "redirect:/";
    }
    @PostMapping (value = "/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect ){
      productService.remove(id);
      redirect.addFlashAttribute("msg","Delete successfully");
      return "redirect:/";

    }
    @PostMapping(value = "/update")
    public String update (Product product,RedirectAttributes redirect){
        productService.update(product.getId(),product);
        redirect.addFlashAttribute("msg","Edit successfully");
        return "redirect:/";
    }

    @GetMapping(value = "/search")
    public String searchByName(@RequestParam String name){
        productService.searchByName(name);
        return "redirect:/";
    }

}
