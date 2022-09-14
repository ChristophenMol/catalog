package com.mysite.actual.service;

import java.util.List;
import com.mysite.actual.entity.Product;

public interface ProductService {
    List<Product> getAll();
  
    void addProduct(Product product);
  }

