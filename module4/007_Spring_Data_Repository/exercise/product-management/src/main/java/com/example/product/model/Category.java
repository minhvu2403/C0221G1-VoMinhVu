package com.example.product.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "category")
@Table
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String name;
    @OneToMany(mappedBy = "category")
    private List<Product>productList;

//    public Category(Integer id, String name) {
//        this.id = id;
//        this.name = name;
//    }
    public Category() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
