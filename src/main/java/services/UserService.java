package services;

import entities.Role;
import entities.User;
import org.springframework.stereotype.Service;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);
}
