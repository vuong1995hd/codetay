package com.springsecurity1.service.role;

import com.springsecurity1.model.AppRole;
import com.springsecurity1.repo.IAppRoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppRoleService implements IAppRoleService {
    @Autowired
    private IAppRoleRepo appRoleRepo;
    @Override
    public Iterable<AppRole> findAll() {
        return appRoleRepo.findAll();
    }

    @Override
    public Optional<AppRole> findById(Long id) {
        return appRoleRepo.findById(id);
    }

    @Override
    public AppRole save(AppRole appRole) {
        return appRoleRepo.save(appRole);
    }

    @Override
    public void remove(Long id) {
        appRoleRepo.deleteById(id);
    }

    @Override
    public AppRole findByName(String name) {
        return appRoleRepo.findByName(name);
    }
}
