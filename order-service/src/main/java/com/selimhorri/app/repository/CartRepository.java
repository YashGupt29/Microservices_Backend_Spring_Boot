package com.selimhorri.app.repository;

import com.selimhorri.app.domain.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {}
