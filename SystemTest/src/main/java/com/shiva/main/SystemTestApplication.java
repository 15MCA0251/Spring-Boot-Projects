package com.shiva.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.shiva.controller","com.shiva.serivce","com.shiva.repository","com.shiva.model"})
@EntityScan("com.shiva.model")
@EnableJpaRepositories("com.shiva.repository")
public class SystemTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SystemTestApplication.class, args);
	}

}
