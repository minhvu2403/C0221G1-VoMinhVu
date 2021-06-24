package com.codegym.blog.services;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {

    Page<Blog> findAll(Pageable pageable);

    Blog findById(int id);

    void save(Blog blog);

    void remove(int id);

    Page<Blog> searchInTitle(String title, Pageable pageable);

    Page<Blog> findByCategory(Category category, Pageable pageable);

    Page<Blog> sortByTitleDesc(Pageable pageable);
}
