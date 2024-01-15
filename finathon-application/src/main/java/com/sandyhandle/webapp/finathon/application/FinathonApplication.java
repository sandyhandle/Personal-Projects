package com.sandyhandle.webapp.finathon.application;

import com.sandyhandle.webapp.finathon.application.entities.AppUser;
import com.sandyhandle.webapp.finathon.application.entities.UserRole;
import com.sandyhandle.webapp.finathon.application.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class FinathonApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(FinathonApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		AppUser adminAccount = userRepository.findByRole(UserRole.ADMIN);
		if(null == adminAccount){
			AppUser user = new AppUser();

			user.setName("admin");
			user.setEmail("admin@gmail.com");
			user.setRole(UserRole.ADMIN);
			user.setPassword(new BCryptPasswordEncoder().encode("admin"));

			userRepository.save(user);
		}
	}
}
