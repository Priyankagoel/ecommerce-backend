package com.ecommerce.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.models.User;
import com.ecommerce.models.UserDto;
//import com.ecommerce.models.UserDto;
import com.ecommerce.repositories.UserRepository;
@Service

public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	public Optional<User> getUserById(String id)
	{
		return userRepository.findById(Integer.parseInt(id));
	}
	
	public User saveUser(UserDto user) {
		User usr = new User();
		usr.setEmail(user.getEmail());
		usr.setName(user.getName());
		usr.setPassword(user.getPassword());
		usr.setRole(user.getRole().Seller);
		return userRepository.save(usr);
	}
}
