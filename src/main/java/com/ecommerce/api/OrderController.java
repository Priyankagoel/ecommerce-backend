package com.ecommerce.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecommerce.models.Order;
import com.ecommerce.models.OrderDto;
import com.ecommerce.models.Product;
import com.ecommerce.services.OrderService;



public class OrderController {
	@Autowired
	private OrderService orderservice;
	@GetMapping("/orders/{userId}")
	@ResponseBody
	public Optional<Order> getOrders(@PathVariable("userId") final Integer userId) 
	{
		Optional<Order> orders = orderservice.getOrders(userId);
		return orders;
	}
	
	@PostMapping(value="/createOrder")
	@ResponseBody
		public Order createOrder(@RequestBody OrderDto order) {
		Order ordr = orderservice.saveOrder(order);
		
		return ordr;
	}
	
	@RequestMapping(value="/order/{orderId}/getProducts",method=RequestMethod.GET)
	@ResponseBody
	public List<Product> getProducts(@PathVariable("orderId") String orderId){
		return orderservice.getOrders(Integer.parseInt(orderId)).get().getProducts();
	}
}
