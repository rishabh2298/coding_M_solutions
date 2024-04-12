package com.masai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.model.WishList;

@Repository
public interface WishListRepository extends JpaRepository<WishList, Integer> {

}
