package com.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.ecommerce.models.Order;


public interface OrderRepository extends JpaRepository<Order, Integer>{

}
//