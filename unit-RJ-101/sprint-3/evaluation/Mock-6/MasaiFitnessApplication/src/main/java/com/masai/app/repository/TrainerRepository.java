package com.masai.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.app.model.Slot;
import com.masai.app.model.Trainer;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer, Integer> {


	public Trainer findByMobileNumber(String mobileNumber);

//	public List<Trainer> findBySalary
	
}
