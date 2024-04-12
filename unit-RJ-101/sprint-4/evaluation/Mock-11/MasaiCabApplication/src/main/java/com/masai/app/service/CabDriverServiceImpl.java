package com.masai.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.CabDriverNotFoundException;
import com.masai.app.model.CabDriver;
import com.masai.app.repository.CabDriverRepository;

@Service
public class CabDriverServiceImpl implements CabDriverService {

	
	@Autowired
	private CabDriverRepository cabDriverRepository;

	
	
	
	
	
	@Override
	public CabDriver registerCabDriver(CabDriver cabDriver) throws CabDriverNotFoundException {
		
		Optional<CabDriver> optional = cabDriverRepository.findById(cabDriver.getEmail());
		
		if(optional.isPresent()) {
			
			throw new CabDriverNotFoundException("This driver already registered... please login...");
		}
		
		 
		return cabDriverRepository.save(cabDriver);
		
	}
	
	
	
	
}
