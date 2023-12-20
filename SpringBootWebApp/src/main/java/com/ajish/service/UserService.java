package com.ajish.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ajish.dto.UserRequest;
import com.ajish.entity.User;
import com.ajish.repository.UserRepository;

@Service
@Component
public class UserService {
	
	@Autowired
	UserRepository repository;
	
	public User SaveUser(UserRequest userRequest) {
		
		User user = new User(0,userRequest.getName(),
								userRequest.getEmail(),
								userRequest.getMobile(),
								userRequest.getGender(),
								userRequest.getAge(),
								userRequest.getNationality());
		return repository.save(user);
	}
	
	
	public List<User> getAllUser(){
		return repository.findAll();
	}
	
	public User getUser(int id) {
		return repository.findByUserId(id);
	}
	
}
