package com.masai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
