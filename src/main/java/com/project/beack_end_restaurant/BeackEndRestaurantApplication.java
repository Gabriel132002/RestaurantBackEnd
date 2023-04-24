package com.project.beack_end_restaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.project.beack_end_restaurant"})
public class BeackEndRestaurantApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeackEndRestaurantApplication.class, args);
	}

}
