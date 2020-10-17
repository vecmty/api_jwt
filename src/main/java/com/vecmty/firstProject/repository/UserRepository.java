package com.vecmty.firstProject.repository;

import com.vecmty.firstProject.model.ApplicationUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String name);
}
