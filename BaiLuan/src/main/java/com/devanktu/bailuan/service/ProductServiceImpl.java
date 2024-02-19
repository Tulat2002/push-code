package com.devanktu.bailuan.service;

import com.devanktu.bailuan.entity.Product;
import com.devanktu.bailuan.repository.ProductRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService{

    private final ProductRepository productRepository;


    @Override
    public Product postProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public void deteteEmployee(Long id) {
        if (!productRepository.existsById(id)){
            throw new EntityNotFoundException("Product with ID " + id + "not found");
        }
        productRepository.deleteById(id);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Product editProduct(long id, Product product) {
        if (product != null){
            Product product1 = productRepository.getById(id);
            if (product1 != null){
                product1.setName(product.getName());
                product1.setPrice(product.getPrice());
                product1.setDescription(product.getDescription());
                return productRepository.save(product1);
            }
        }
        return null;
    }


}
