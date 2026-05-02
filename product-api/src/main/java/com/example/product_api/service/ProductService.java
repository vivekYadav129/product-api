package com.example.product_api.service;

import com.example.product_api.model.Product;
import com.example.product_api.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product addProduct(Product product) {
        return repo.save(product);
    }

    public Product updateProduct(Long id, Product newProduct) {
        Product product = repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        product.setName(newProduct.getName());
        product.setPrice(newProduct.getPrice());
        product.setQuantity(newProduct.getQuantity());

        return repo.save(product);
    }

    public void deleteProduct(Long id) {
        repo.deleteById(id);
    }
}