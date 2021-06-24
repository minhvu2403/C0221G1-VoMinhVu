package com.example.product.service;

import com.example.product.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CategoryService {
    Page<Category> findAll(Pageable pageable);

    List<Category> findAll();

    Category findById(Integer id);

    void save(Category category);

    void remove(Integer id);
}
