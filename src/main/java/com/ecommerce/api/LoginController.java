package com.ecommerce.api;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.models.Product;
import com.ecommerce.models.ProductDto;
import com.ecommerce.models.User;
import com.ecommerce.services.ProductService;
import com.ecommerce.services.UserService;

@RestController
public class LoginController {
	@Autowired
	private UserService userService;
	@GetMapping("/login")
	@ResponseBody
	public Optional<User> getUser(@RequestParam String id, @RequestParam String password )
	{
		Optional<User> user = userService.getUserById(id);
		if(user != null)
			return user;
		return user;
	}
	
}
