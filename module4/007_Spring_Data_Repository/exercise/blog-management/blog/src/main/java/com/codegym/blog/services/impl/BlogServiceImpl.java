package com.codegym.blog.services.impl;

import com.codegym.blog.model.Blog;
import com.codegym.blog.model.Category;
import com.codegym.blog.repository.BlogRepository;
import com.codegym.blog.services.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogRepository blogRepository;


    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);

    }

    @Override
    public void save(Blog blog) {
        if (findById(blog.getId()) == null) {
            blog.setAuthor("Admin");
            blog.setDate(new Date(new java.util.Date().getTime()));
        }
        blogRepository.save(blog);
    }

    @Override
    public void remove(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> searchInTitle(String title, Pageable pageable) {
        return this.blogRepository.findByTitleContaining(title, pageable);
    }

    @Override
    public Page<Blog> findByCategory(Category category, Pageable pageable) {
        return this.blogRepository.findByCategory(category, pageable);
    }

    @Override
    public Page<Blog> sortByTitleDesc(Pageable pageable) {
        return this.blogRepository.findByOrderByTitleDesc(pageable);
    }
}
