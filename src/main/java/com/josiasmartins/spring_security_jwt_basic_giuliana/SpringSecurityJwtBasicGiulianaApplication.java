package com.josiasmartins.spring_security_jwt_basic_giuliana;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringSecurityJwtBasicGiulianaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtBasicGiulianaApplication.class, args);
	}

	// Encripted password for user using BCrypt encoder
	@Bean
	ApplicationRunner runner(PasswordEncoder passwordEncoder) {
		return args -> System.out.println(passwordEncoder.encode("password"));
	}

}
