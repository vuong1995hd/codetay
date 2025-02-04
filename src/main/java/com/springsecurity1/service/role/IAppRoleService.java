package com.springsecurity1.service.role;

import com.springsecurity1.model.AppRole;
import com.springsecurity1.service.GeneralService;

public interface IAppRoleService extends GeneralService<AppRole> {
    AppRole findByName(String name);
}