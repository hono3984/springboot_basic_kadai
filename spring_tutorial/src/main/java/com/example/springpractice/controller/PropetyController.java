package com.example.springpractice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropetyController {
	@Value("${springtutorial.name:guest}")
	private String propertyName;
	
	@GetMapping("/property")
	public String getProperty() {
		return propertyName;
	}
	}
