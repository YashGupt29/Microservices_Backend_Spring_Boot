package com.selimhorri.app.repository;

import com.selimhorri.app.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {}
