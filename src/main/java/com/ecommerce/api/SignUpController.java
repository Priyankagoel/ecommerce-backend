package com.ecommerce.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.models.User;
import com.ecommerce.models.UserDto;
import com.ecommerce.services.UserService;



@RestController
public class SignUpController {

	@Autowired
	private UserService userService;
	@PostMapping(value="/signup")
	@ResponseBody
		public User addUser(@RequestBody UserDto user) {
		User usr = userService.saveUser(user);
		return usr;
	}
}
