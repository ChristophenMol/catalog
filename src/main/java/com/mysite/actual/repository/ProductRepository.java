package com.mysite.actual.repository;

import java.util.Optional;

import com.mysite.actual.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
  Optional<Product> findByTitle(String title);
}