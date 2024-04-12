package com.masai.app.service;

import java.util.List;

import com.masai.app.exception.OrderNotFoundException;
import com.masai.app.model.Order;

public interface OrderService {

	public List<Order> oldOrderListOfUser(Integer userId) throws OrderNotFoundException;
	
}
