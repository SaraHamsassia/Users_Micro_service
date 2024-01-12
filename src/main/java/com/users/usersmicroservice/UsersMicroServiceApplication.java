package com.users.usersmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class UsersMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsersMicroServiceApplication.class, args);
	}
/*
	@Autowired
	UserService userService;

	@PostConstruct
	void init_users() { //ajouter les rôles
		userService.addRole(new Role(null,"ADMIN"));
		userService.addRole(new Role(null,"USER"));
		//ajouter les users
		userService.saveUser(new User(null,"admin","1234",true,null));
		userService.saveUser(new User(null,"sara","1234",true,null));
		userService.saveUser(new User(null,"hamza","1234",true,null));
		//ajouter les rôles aux users
		userService.addRoleToUser("admin", "ADMIN");
		userService.addRoleToUser("admin", "USER");
		userService.addRoleToUser("sara", "USER");
		userService.addRoleToUser("hamza", "USER");
	}
 */
	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}



}
