package com.cadastro.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EntityScan(basePackages = {"com.cadastro.model.entity"})
@EnableJpaRepositories(basePackages = {"com.cadastro.repositories"})
@ComponentScan(basePackages = {"com.cadastro.controller","com.cadastro.serviceImpl"})
		
@SpringBootApplication
public class ApiBraducaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBraducaApplication.class, args);
	}

}
