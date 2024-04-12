package com.masai.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.app.model.Police;

@Repository
public interface PoliceRepository extends JpaRepository<Police, Integer> {

	public Police findeByMobileNo(String mobileNumber);
	
}
