package com.lawrence.jwtExample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class JwtExampleController {
	
	@GetMapping
	public ResponseEntity<String> home(Principal principal) {
		return ResponseEntity.ok("Hello, " + principal.getName() +"!"); 
	}
}
