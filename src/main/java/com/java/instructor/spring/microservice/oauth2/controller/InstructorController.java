package com.java.instructor.spring.microservice.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstructorController {

	@GetMapping("/")
	public String helloTest() {
		return "Welcome to Java-Instructor session";
	}

	@GetMapping("helloinstructor")
	public String testOAuthSecurity() {
		return "Welcome to Java-Instructor OAuth2 integration session";
	}

}
