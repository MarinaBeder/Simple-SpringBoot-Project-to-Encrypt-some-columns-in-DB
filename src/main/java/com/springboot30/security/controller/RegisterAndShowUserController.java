package com.springboot30.security.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot30.security.request.RegisterRequest;
import com.springboot30.security.service.RegisterAndShowUserService;

@RestController
@RequestMapping("/api")
public class RegisterAndShowUserController {
	@Autowired
	private RegisterAndShowUserService service;

	@PostMapping("/register")

	public ResponseEntity<Object> register(@RequestBody RegisterRequest request) {
		return ResponseEntity.ok(service.register(request));
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<Object> authenticationRequest(@PathVariable long id) {
		return ResponseEntity.ok(service.getUserById(id));

	}

}
