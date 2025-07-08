package com.selimhorri.app.repository;

import com.selimhorri.app.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {}
