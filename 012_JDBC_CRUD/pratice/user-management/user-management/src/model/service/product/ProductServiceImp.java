package model.service.product;

import model.bean.Category;
import model.bean.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAllProduct();

    Product findByID(String id);

    List<Product> findByName(String name);

    List<Product> findByPrice(String name);

    String save(Product product);

    String update(Product product);

    void delete(String id);

    List<Category> findAllCategory();
}
