package com.ecommerce.product_service.service;

import com.ecommerce.product_service.model.Product;
import com.ecommerce.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    // جلب جميع المنتجات (اللي استعملناه في GET ولقيناها خاوية في الأول)
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    // هادي هي الميثود المهمة اللي كيعيط عليها الـ Controller باش يجاوب الـ Order Service
    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // إضافة منتج جديد (اللي استعملناه في POST وبان لينا الـ ID: 1)
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}