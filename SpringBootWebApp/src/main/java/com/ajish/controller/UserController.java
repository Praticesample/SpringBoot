package com.ajish.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajish.dto.UserRequest;
import com.ajish.entity.User;
import com.ajish.service.UserService;

@RestController
@RequestMapping("/users")
@ComponentScan(basePackages = "com.ajish.controller")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/signUp")
	ResponseEntity<User> saveUser(@RequestBody UserRequest userRequest){
		return new ResponseEntity<>(service.SaveUser(userRequest),HttpStatus.CREATED);
		
	}
	
	@GetMapping("/{id}")
	ResponseEntity<User> getUser(@PathVariable int id){
		return ResponseEntity.ok(service.getUser(id));
		
	}
	
	@GetMapping("/fetchAll")
	ResponseEntity<List<User>> getAllUsers(){
		return new ResponseEntity<>(service.getAllUser(),HttpStatus.OK);
	}
	

}
