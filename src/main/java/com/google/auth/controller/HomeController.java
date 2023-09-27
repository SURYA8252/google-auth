package com.google.auth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/test")
	public String message() {
		return "Welcome to own application";
	}
}
