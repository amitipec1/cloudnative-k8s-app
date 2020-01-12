package com.spring.container.app.myapp;

import com.spring.container.app.myapp.jpa.Customer;
import com.spring.container.app.myapp.jpa.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
public class MyappApplication {

	private static final Logger log = LoggerFactory.getLogger(MyappApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}
}
