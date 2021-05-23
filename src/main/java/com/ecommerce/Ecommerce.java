package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//import com.ecommerce.services.OrderService;
//import com.ecommerce.services.ProductService;
import com.ecommerce.services.UserService;

@SpringBootApplication(scanBasePackages={
"com.ecommerce.api", "com.ecommerce.services", "com.ecommerce.models", "com.ecommerce.repositories", "com.ecommerce.configuration"})
//m@ComponentScan({"com.ecommerce.api", "com.ecommerce.services", "com.ecommerce.models", "com.ecommerce.repositories", "com.ecommerce.configuration"})
//@EnableJpaRepositories(basePackages = "com.ecommerce.repositories")
public class Ecommerce {

	
	public static void main(String[] args) {
		SpringApplication.run(Ecommerce.class, args);
	}

}