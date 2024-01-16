package com.sandyhandle.webapp.finathon.application.repository;

import com.sandyhandle.webapp.finathon.application.entity.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<AppUser, Integer> {

}
