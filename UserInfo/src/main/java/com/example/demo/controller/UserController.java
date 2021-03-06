package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.UserDTO;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.userService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value= { "api/user" })
public class UserController {

	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	

	@PostMapping(value = "/saveuser")
	public ResponseEntity<?> saveUser(@RequestBody User user) {
		
     	return new ResponseEntity<>(userRepository.save(user), HttpStatus.OK);   	
	}
	
	
	@GetMapping(value = "/displayUserInfo/{id}")
	public UserDTO displayIUserInfo(@PathVariable(value = "id") Long userId) {
		
     	UserDTO userdto = new UserDTO();
     	
     	Optional<User> user = userRepository.findById(userId);
     	
     	userdto.setFirstName(user.get().getFirstName());
     	userdto.setLastName(user.get().getLastName());
     	userdto.setCity(user.get().getCity());
     	userdto.setDob(user.get().getDob());
     	userdto.setEmailID(user.get().getEmailID());
     	userdto.setMobileNumber(user.get().getMobileNumber()); 
  	
     	return userdto;
	}
			
	
}
