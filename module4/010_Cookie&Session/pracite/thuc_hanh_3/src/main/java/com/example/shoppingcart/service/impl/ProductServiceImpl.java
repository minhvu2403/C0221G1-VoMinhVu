package com.example.shoppingcart.service.impl;

import com.example.shoppingcart.model.Product;
import com.example.shoppingcart.repository.IProductRepository;
import com.example.shoppingcart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    IProductRepository iProductRepository;
    @Override
    public Iterable<Product> findAll() {
        return iProductRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return iProductRepository.findById(id);
    }
}
