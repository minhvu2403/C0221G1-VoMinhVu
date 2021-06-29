package com.example.shoppingcart.service.impl;

import com.example.shoppingcart.model.Product;
import com.example.shoppingcart.repository.ProductRepository;
import com.example.shoppingcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Product findById(Long id) {
        return this.productRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Product product) {
      this.productRepository.save(product);
    }

    @Override
    public List<Long> findAllById() {
        List<Long> listId = new ArrayList<>();
        for(int i = 0; i<findAll().size();i++){
            listId.add(findAll().get(i).getId());
        }
        return listId;
    }

}
