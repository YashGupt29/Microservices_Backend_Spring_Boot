package com.selimhorri.app.repository;

import com.selimhorri.app.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {}
