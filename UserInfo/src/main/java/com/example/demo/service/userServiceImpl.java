package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.repository.UserRepository;

@Service("userService")
public class userServiceImpl {

	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	
}
