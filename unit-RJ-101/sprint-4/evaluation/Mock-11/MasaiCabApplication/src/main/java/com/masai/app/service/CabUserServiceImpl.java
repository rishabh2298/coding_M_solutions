package com.masai.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.app.exception.CabDriverNotFoundException;
import com.masai.app.exception.CabUserNotFoundException;
import com.masai.app.model.CabDriver;
import com.masai.app.model.CabUser;
import com.masai.app.repository.CabDriverRepository;
import com.masai.app.repository.CabUserRepository;

public class CabUserServiceImpl implements CabUserService {

	
	@Autowired
	private CabUserRepository cabUserRepository;
	
	@Autowired
	private CabDriverRepository cabDriverRepository;
	
	
	
	
	
	@Override
	public CabUser regiesterCabUser(CabUser cabUser) throws CabUserNotFoundException {
		
		Optional<CabUser> optional = cabUserRepository.findById(cabUser.getEmail());
		
		if(optional.isPresent()) throw new CabUserNotFoundException("This user is already registerd... please login...");
		
		return cabUserRepository.save(cabUser);
	}

	@Override
	public List<CabDriver> getListOfDriverWithin5KM(Integer[] userLocation) throws CabUserNotFoundException, CabDriverNotFoundException {
		
		List<CabDriver> list = cabDriverRepository.findDriverWithin5KM(userLocation);
		
		if(list.isEmpty()) throw new CabUserNotFoundException("No driver found in this range....");
		
		return list;
	}

	@Override
	public String bookRide(String driverId, Integer x, Integer y) throws CabUserNotFoundException {
		
		Integer[] location = new Integer[] {x, y};
		
		CabDriver driver = cabDriverRepository.findById(driverId).orElseThrow(() -> new CabUserNotFoundException("No such driver exist with this id..."));
		
		driver.getCabUsers().add(null);
		driver.setEmptyRide(false);
		
		return null;
	}

	@Override
	public List<CabUser> listOfAllUsers() throws CabUserNotFoundException {
		
		List<CabUser> list = cabUserRepository.findAll();
		
		if(list.isEmpty()) throw new CabUserNotFoundException("No driver registerd yet....");
		
		return list;
	}

	@Override
	public CabUser updateUser(String cabUserId, CabUser cabUser) throws CabUserNotFoundException {
		
		cabUserRepository.findById(cabUserId).orElseThrow(() -> new CabUserNotFoundException("No user registerd yet...."));

		return cabUserRepository.save(cabUser);
	}

}
