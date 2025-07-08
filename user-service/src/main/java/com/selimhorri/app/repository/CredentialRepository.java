package com.selimhorri.app.repository;

import com.selimhorri.app.domain.Credential;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CredentialRepository extends JpaRepository<Credential, Integer> {

  Optional<Credential> findByUsername(final String username);
}
