package com.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.ecommerce.models.Product;
import com.ecommerce.models.ProductDto;
import com.ecommerce.models.User;
import com.ecommerce.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Autowired
	UserService userService;
	
	public List<Product> getProducts() {
		return ((JpaRepository<Product, Integer>) repository).findAll();
	}

	public Product saveProduct(ProductDto product,String userId) {
		Product prod = new Product();
		
		Optional<User> user = userService.getUserById(userId);
		//Assert.isNull(user, "user not found");
		if(user.isPresent()) {
			prod.setDescription(product.getDesc());
			prod.setPrice(product.getPrice());
			prod.setName(product.getProductName());
			prod.setImageUrl(product.getImage());
			prod.setUser(user.get());
			return ((CrudRepository<Product, Integer>) repository).save(prod);
		} 
		return null;
		
	}

}
