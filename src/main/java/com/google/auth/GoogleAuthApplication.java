package com.google.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * @author Surya Jyoti Ashirwad
 *
 */
@SpringBootApplication
public class GoogleAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleAuthApplication.class, args);
		System.out.println("Outh by google");
	}

}
