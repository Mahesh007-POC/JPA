package com.courses.appconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.courses.repository")
@ComponentScan(basePackages = {"com.courses"})
@EntityScan("com.courses.model")
public class InitConfiguration {
	public static void main(String args[]) {
		SpringApplication.run(InitConfiguration.class, args);

	}

	
	
}
