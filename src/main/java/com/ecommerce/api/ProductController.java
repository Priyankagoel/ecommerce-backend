package com.ecommerce.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.models.Product;
import com.ecommerce.models.ProductDto;
import com.ecommerce.services.ProductService;


@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	@ResponseBody
	public List<Product> getProducts() 
	{
		List<Product> product = productService.getProducts();
		
		return product;
	}
	
	@PostMapping(value="/user/{userId}/createProduct")
	@ResponseBody
		public Product addProduct(@PathVariable("userId") String userId ,@RequestBody ProductDto product) {
		Product prod = productService.saveProduct(product,userId);
		
		return prod;
	}
	
	@RequestMapping(value="/getAllProducts",method=RequestMethod.GET)
	@ResponseBody
	public List<Product> getAllProducts(){
		return productService.getProducts();
	}

}
