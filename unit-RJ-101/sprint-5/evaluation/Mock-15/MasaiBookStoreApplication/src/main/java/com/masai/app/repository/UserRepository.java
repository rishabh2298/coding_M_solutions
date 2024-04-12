package com.masai.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	public Optional<User> findByMobileNumber(String mobileNumber);
	
	public User findByCart(Integer cartId);
}
