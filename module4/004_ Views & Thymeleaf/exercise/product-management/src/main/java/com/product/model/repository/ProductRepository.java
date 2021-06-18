package com.product.model.repository;

import com.product.model.bean.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class ProductRepository {
    private  static final Map<Integer, Product> productMap;
    static {
        productMap= new HashMap<>();
        productMap.put(1,new Product(1,"Galaxy",12.900,"Samsung"));
        productMap.put(2,new Product(2,"Huawei",1300,"China"));
        productMap.put(3,new Product(3,"Nokia",1500,"USA"));
        productMap.put(4,new Product(4,"OPPO",700,"Taiwan"));
        productMap.put(5,new Product(5,"Apple",500,"USA"));
        productMap.put(6,new Product(6,"Realme",600,"China"));
    }

    public List<Product> findAll() {
        return new ArrayList<>(productMap.values());
    }

    public void save(Product product) {
        productMap.put(product.getId(),product);
    }

    public Product findById(int id) {
        return productMap.get(id);
    }

    public void update(int id, Product product) {
        productMap.put(id,product);
    }

    public void remove(int id) {
        productMap.remove(id);
    }

    public List<Product >searchByName(String name) {
        List<Product>productList=new ArrayList<>();
        for (int key:productMap.keySet()) {
            if (productMap.get(key).getNameProduct().toLowerCase().contains(name.toLowerCase())){
                productList.add(productMap.get(key));
            }
        }
        return productList;
    }
}
