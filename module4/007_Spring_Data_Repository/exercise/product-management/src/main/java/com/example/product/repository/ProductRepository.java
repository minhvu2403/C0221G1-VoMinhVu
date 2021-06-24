package com.example.product.repository;

import com.example.product.model.Category;
import com.example.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Page<Product> findAll(Pageable pageable);

    //    @Query(value="select * " +
//            "form product " +
//            "when  `name` like :keywordParam",nativeQuery=true);
//    Page<Product> findByNameContaining(String nameProduct, Pageable pageable);
     Page<Product>findByNameProductContaining(String nameProduct,Pageable pageable);
    Page<Product>findByProducer(Category category, Pageable pageable);
    Page<Product>findByOrderByNameProduct(Pageable pageable);

}
