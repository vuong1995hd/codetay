package com.springsecurity1.repo;

import com.springsecurity1.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppUserRepo extends JpaRepository<AppUser, Long> {
    AppUser findByUsername(String name);
}
