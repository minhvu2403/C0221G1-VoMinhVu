package com.example.product.repository;

import com.example.product.model.Category;
import com.example.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    Page<Product> findAll(Pageable pageable);

//       @Query(value="select * form product when  `name` like :keywordParam",nativeQuery=true)
//    Page<Product> findByNameContaining(String nameProduct, Pageable pageable);
//    @Query(value="update Product p set p.nameProduct=:nameProduct,p.priceProduct=:priceProduct, p.producer=:producer,p.category=category where p.id=:id")
//      Page<Product>update(Pageable pageable, @Param("id") int id,@Param(""))

    Page<Product>findByNameProductContaining(String nameProduct,Pageable pageable);
    Page<Product>findByProducer(Category category, Pageable pageable);
    Page<Product>findByOrderByNameProduct(Pageable pageable);


}
