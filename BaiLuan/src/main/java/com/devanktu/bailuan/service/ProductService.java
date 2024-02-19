package com.devanktu.bailuan.service;

import com.devanktu.bailuan.entity.Product;

import java.util.List;

public interface ProductService {

    Product postProduct(Product product);

    List<Product> getAllProduct();

    void deteteEmployee(Long id);

    Product getProductById(Long id);

    Product editProduct(long id, Product product);

}
