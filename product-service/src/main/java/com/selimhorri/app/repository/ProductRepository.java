package com.selimhorri.app.repository;

import com.selimhorri.app.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {}
