package com.mysite.actual.service;

import java.util.List;
import java.util.Optional;

import com.mysite.actual.entity.Product;
import com.mysite.actual.repository.ProductRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
  private final ProductRepository productRepository;

  @Override
  public List<Product> getAll() {
    return productRepository.findAll();
  }

  @Override
  public void addProduct(Product product) {

    Optional<Product> existingProduct = productRepository.findByTitle(product.getTitle());
        
    if (existingProduct.isPresent()) {
      throw new IllegalStateException(String.format("Product %s:%s is already in catalog", product.getTitle()));
    }
    
    productRepository.save(product);
  }
  
}
