package com.selimhorri.app.repository;

import com.selimhorri.app.domain.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByCredentialUsername(final String username);
}
