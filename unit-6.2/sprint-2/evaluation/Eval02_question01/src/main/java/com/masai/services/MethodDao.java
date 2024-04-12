package com.masai.services;

import java.time.LocalDate;
import java.util.List;

import com.masai.entity.Item;
import com.masai.entity.Order;
import com.masai.exception.NotFoundException;

public interface MethodDao {
	
	public void createItem(Item item, Order order);
	
	public void createItems(List<Item> items, Order order);
	
	public void getItem(int itemId) throws NotFoundException;
	
	public void getOrder(int orderId) throws NotFoundException;
	
	public void getItems(LocalDate inputDate);

}
