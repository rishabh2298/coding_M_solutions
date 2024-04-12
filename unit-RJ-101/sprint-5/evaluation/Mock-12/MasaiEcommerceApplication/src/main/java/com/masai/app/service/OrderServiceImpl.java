package com.masai.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.OrderNotFoundException;
import com.masai.app.exception.UserNotFoundException;
import com.masai.app.model.Order;
import com.masai.app.model.User;
import com.masai.app.repository.OrderRepository;
import com.masai.app.repository.UserRepository;

@Service
public class OrderServiceImpl implements OrderService {

	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	
	
	
	
	
	
	
	@Override
	public List<Order> oldOrderListOfUser(Integer userId) throws OrderNotFoundException {
		
		User user = userRepository.findById(userId).orElseThrow(()-> new UserNotFoundException("User with this id doesn't exist..."));

		List<Order> orders = orderRepository.findByUser(user);
		
		return orders;
	}

}
