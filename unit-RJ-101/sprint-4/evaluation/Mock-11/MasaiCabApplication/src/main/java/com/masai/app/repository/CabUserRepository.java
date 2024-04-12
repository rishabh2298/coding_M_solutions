package com.masai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.model.CabUser;

@Repository
public interface CabUserRepository extends JpaRepository<CabUser, String> {

}
