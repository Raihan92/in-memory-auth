package com.progcreek.authentication.inmemoryauth.repo;

import com.progcreek.authentication.inmemoryauth.domain.Credential;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<Credential, Integer> {
}
