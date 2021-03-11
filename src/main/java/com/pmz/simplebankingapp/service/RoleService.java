package com.pmz.simplebankingapp.service;

import com.pmz.simplebankingapp.domain.entity.Role;

public interface RoleService {

	Role findByRoleName(String roleName);

}
