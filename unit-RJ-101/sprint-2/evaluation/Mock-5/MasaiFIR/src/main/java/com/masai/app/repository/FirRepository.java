package com.masai.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.model.FIR;

@Repository
public interface FirRepository extends JpaRepository<FIR, Integer> {

	
	public List<FIR> findByIsOpen(Boolean isOpen);
	
}
