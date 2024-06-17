package com.CrudSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.CrudSpring.model.User;
import com.CrudSpring.repository.UserRepository;

@SpringBootApplication
public class CrudSpringApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(CrudSpringApplication.class, args);
	}

}
