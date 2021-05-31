package model.respository;

import model.bean.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductRepository {
    private  static Map<Integer , Product> productMap;
    static {
        productMap=new HashMap<>();
        productMap.put(1,new Product(1,"Xoài",12.5,5,"Còn hàng"));
        productMap.put(2,new Product(2,"Chuối",17.5,10,"Còn hàng"));
        productMap.put(3,new Product(3,"Mận",18.5,4,"Còn hàng"));
        productMap.put(4,new Product(4,"Cam",20,6,"Còn hàng"));
        productMap.put(5,new Product(5,"Bưởi",16.5,0,"Hết hàng"));
        productMap.put(6,new Product(6,"Thanh Long",19.5,0,"Hết hàng"));
    }

    public List<Product> findAll() {
        return  new ArrayList<>(productMap.values());
    }


    public Product findById(int id) {
        return productMap.get(id);
    }


    public void save(Product product) {
        productMap.put(product.getId(),product);
    }


    public void update(int id, Product product) {
        productMap.put(id,product);
    }

    public void remove(int id) {
        productMap.remove(id);
    }


    public List<Product> searchByName(String name) {
        List<Product> productList=new ArrayList<>();
        for ( int key:productMap.keySet()) {
            if (productMap.get(key).getName().toLowerCase().contains(name.toLowerCase())){
                productList.add(productMap.get(key));
            }
        }
        return productList;
    }


}
