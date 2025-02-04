package com.springsecurity1.repo;

import com.springsecurity1.model.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAppRoleRepo extends JpaRepository<AppRole, Long> {

    AppRole findByName(String name);
}