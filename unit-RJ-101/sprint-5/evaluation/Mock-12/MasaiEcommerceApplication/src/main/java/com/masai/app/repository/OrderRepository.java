package com.masai.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.model.Order;
import com.masai.app.model.User;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

	public List<Order> findByUser(User user);
	
}
