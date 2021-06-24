package com.example.product.service.impl;

import com.example.product.model.Category;
import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;
import com.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {
  @Autowired
  private ProductRepository productRepository;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepository.findAll(pageable);
    }

    @Override
    public Product findById(int id) {
        return  this.productRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Product product) {
       if (findById(product.getId())==null){
           product.setDateProduct(new java.sql.Date(new java.util.Date().getTime()));
       }
       productRepository.save(product);
    }

    @Override
    public void remove(int id) {
       productRepository.deleteById(id);
    }

    @Override
    public Page<Product> searchInName(String nameProduct, Pageable pageable) {
        return this.productRepository.findByNameProductContaining(nameProduct,pageable);
    }

    @Override
    public Page<Product> findByProducer(Category category, Pageable pageable) {
        return this.productRepository.findByProducer(category,pageable);
    }

    @Override
    public Page<Product> sortByNameDesc(Pageable pageable) {
        return this.productRepository.findByOrderByNameProduct(pageable);
    }
}
