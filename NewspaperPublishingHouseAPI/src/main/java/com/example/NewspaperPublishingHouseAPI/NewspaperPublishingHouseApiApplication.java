package com.example.NewspaperPublishingHouseAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableScheduling
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)

public class NewspaperPublishingHouseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewspaperPublishingHouseApiApplication.class, args);
	}

}
