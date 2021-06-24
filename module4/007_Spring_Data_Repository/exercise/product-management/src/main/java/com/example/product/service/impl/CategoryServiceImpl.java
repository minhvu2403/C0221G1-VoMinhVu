package com.example.product.service.impl;

import com.example.product.model.Category;
import com.example.product.repository.CategoryRepository;
import com.example.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Page<Category> findAll(Pageable pageable) {
        return this.categoryRepository.findAll(pageable);
    }

    @Override
    public List<Category> findAll() {
        return this.categoryRepository.findAll();
    }

    @Override
    public Category findById(Integer id) {
        return this.categoryRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Category category) {
       this.categoryRepository.save(category);
    }

    @Override
    public void remove(Integer id) {
      this.categoryRepository.deleteById(id);
    }
}
