package com.kudinov.restorator.server.service;

import com.kudinov.restorator.server.entity.Product;
import com.kudinov.restorator.server.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
/*
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAll() {
        return productRepository.findAll();
    }

    public Product getByID(long id) {
        return productRepository.findOne(id);
    }

    public Product add(Product product) {
        return productRepository.saveAndFlush(product);
    }

    public void remove(long id) {
        productRepository.delete(id);
    }
*/
}
