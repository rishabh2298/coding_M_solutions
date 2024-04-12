package com.masai.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.Order;
import com.masai.app.service.OrderService;

@RestController
public class OrderController {

	
	@Autowired
	private OrderService orderService;
	
	
	
	
	
	
	
	@GetMapping("/masaiEcommerce/orders/history/{userId}")
	public ResponseEntity<List<Order>> oldOrderListHandler(@PathVariable("userId") Integer userId){
		
		List<Order> orders = orderService.oldOrderListOfUser(userId);
		
		return new ResponseEntity<>(orders, HttpStatus.OK);
	}
	
	
	
	
	
	
	
}
