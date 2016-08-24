package org.gvaireth.liferaytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
public class LiferaytestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LiferaytestApplication.class, args);
		System.out.println("app running!");
	}
}
