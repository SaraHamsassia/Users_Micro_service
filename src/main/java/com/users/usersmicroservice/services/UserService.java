package com.users.usersmicroservice.services;

import com.users.usersmicroservice.entities.Role;
import com.users.usersmicroservice.entities.User;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
}
