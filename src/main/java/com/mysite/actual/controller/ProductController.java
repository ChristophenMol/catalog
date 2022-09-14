package com.mysite.actual.controller;

import java.util.List;

import com.mysite.actual.service.ProductService;
import com.mysite.actual.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
public class ProductController {
  private final ProductService productService;

  @GetMapping("/all")
  public List<Product> getAll() {
    return productService.getAll();
  }

  @PostMapping("/add")
  public void addProduct(@RequestBody Product product) {
    productService.addProduct(product);
  }
}