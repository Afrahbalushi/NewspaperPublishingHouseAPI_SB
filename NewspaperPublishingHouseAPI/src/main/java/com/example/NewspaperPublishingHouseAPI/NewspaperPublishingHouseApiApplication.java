package com.example.NewspaperPublishingHouseAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NewspaperPublishingHouseApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewspaperPublishingHouseApiApplication.class, args);
	}

}
