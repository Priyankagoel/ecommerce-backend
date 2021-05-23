package com.ecommerce.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.models.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	//public Optional<User> findById(Integer id);
		
	
}
