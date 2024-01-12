package com.users.usersmicroservice.services;

import com.users.usersmicroservice.entities.Role;
import com.users.usersmicroservice.entities.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.users.usersmicroservice.repository.RoleRepository;
import com.users.usersmicroservice.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Autowired
    RoleRepository roleRepository;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public User saveUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }
    @Override
    public User findUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public User addRoleToUser(String username, String rolename) {
        User user = userRepository.findByUsername(username);
        Role role = roleRepository.findByRole(rolename);
        user.getRoles().add(role);
        return user;
    }
}
