package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {

		int x = 100;
		int y = 200;
		SpringApplication.run(TestApplication.class, args);
	}

}
