package com.as.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/users")
public class HelloController {

	@GetMapping
	@Operation(summary = "Greet with hello")
	public String hello() {
		return "Hello Adarsh";
	}

}
