package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.service.CategoryService;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @GetMapping(value = {"","/list"})
    public ModelAndView getHomepage(@RequestParam Optional<String> key, @RequestParam Optional<String> order,
                                    @PageableDefault(value = 5) Pageable pageable, Model model){
        String keywordValue="";
        if ((key.isPresent())){
            keywordValue=key.get();
        }
        ModelAndView modelAndView=new ModelAndView("product/list_product");
        Page<Product> products=productService.searchInName(keywordValue,pageable);
        modelAndView.addObject("keywordValue",keywordValue);
        modelAndView.addObject("products",products);
        model.addAttribute("product", new Product());
        model.addAttribute("categories",categoryService.findAll(pageable));

        return modelAndView;

    }
//    @GetMapping("/create")
//    public String create(Pageable pageable, Model model) {
//        model.addAttribute("categories",categoryService.findAll(pageable));
//        model.addAttribute("product", new Product());
//        return "redirect:/product/";
//    }
    @PostMapping("/save")
    public String save(Product product, RedirectAttributes redirect,Pageable pageable,Model model) {
        this.productService.save(product);
        redirect.addFlashAttribute("msg", "Add Product successfully!");
        return "redirect:/product/";
    }
    @GetMapping("/edit")
    public String edit(@RequestParam int id,Pageable pageable, Model model){
        model.addAttribute("categories",categoryService.findAll(pageable));
        model.addAttribute("product",productService.findById(id));
        return "redirect:/product/";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute Product product, RedirectAttributes redirect){
        productService.save(product);
        redirect.addFlashAttribute("msg","Updated Product successfully");
        return "redirect:/product/";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes redirect) {
        productService.remove(id);
        redirect.addFlashAttribute("msg", "Removed Product successfully!");
        return "redirect:/product/";
    }
    @GetMapping("/view")
    public String view(@RequestParam int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/view";
    }
}
