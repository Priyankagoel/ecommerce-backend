package com.ecommerce.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.models.Order;
import com.ecommerce.models.OrderDto;
import com.ecommerce.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	OrderRepository orderRepository;

	public Optional<Order> getOrders(int id) {
		return orderRepository.findById((id));
	}

	public Order saveOrder(OrderDto order) {
		Order orderModel = new Order();
		orderModel.setOrderDate(order.getOrderDate());
		return orderRepository.save(orderModel);
	}

}
