package com.example.product.service;

import com.example.product.model.Category;
import com.example.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
    Page<Product> findAll(Pageable pageable);

    Product findById(int id);

    void save(Product product);

    void remove(int id);
    void update(int id ,Product product);

    Page<Product> searchInName(String name, Pageable pageable);

    Page<Product> findByProducer(Category category, Pageable pageable);

    Page<Product> sortByNameDesc(Pageable pageable);
}
