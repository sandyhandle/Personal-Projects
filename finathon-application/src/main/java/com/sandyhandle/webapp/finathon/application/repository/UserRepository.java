package com.sandyhandle.webapp.finathon.application.repository;

import com.sandyhandle.webapp.finathon.application.entities.AppUser;
import com.sandyhandle.webapp.finathon.application.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<AppUser, Integer> {
    Optional<AppUser> findByEmail(String email);

    AppUser findByRole(UserRole role);
}
