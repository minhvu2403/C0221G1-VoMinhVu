package com.product.model.service;

import com.product.model.bean.Product;

import java.util.List;
public interface ProductService {
    List<Product> findByAll();

    void save(Product product);

    Product findById(int id);

    void update(int id, Product product);

    void remove(int id);

    List<Product> searchByName(String name);
}
