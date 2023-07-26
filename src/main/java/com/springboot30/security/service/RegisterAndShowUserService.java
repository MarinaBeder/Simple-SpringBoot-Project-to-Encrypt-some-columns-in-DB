package com.springboot30.security.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.springboot30.security.domain.User;
import com.springboot30.security.repository.UserRepository;
import com.springboot30.security.request.RegisterRequest;

@Service
public class RegisterAndShowUserService {
	@Autowired
	private UserRepository userRepo;

	public Object register(RegisterRequest request) {
		User user = new User();
		user.setFirstName(request.getFirstName());
		userRepo.save(user);
		return user;
	}

	public Object getUserById(long id) {
		return userRepo.findById(id);
	}

}
