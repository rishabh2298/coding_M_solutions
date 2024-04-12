package com.masai.app.service;

import java.util.List;

import com.masai.app.exception.CabDriverNotFoundException;
import com.masai.app.exception.CabUserNotFoundException;
import com.masai.app.model.CabDriver;
import com.masai.app.model.CabUser;

public interface CabUserService {

	public CabUser regiesterCabUser(CabUser cabUser) throws CabUserNotFoundException;
	
	public List<CabDriver> getListOfDriverWithin5KM(Integer[] userLocation) throws CabUserNotFoundException,CabDriverNotFoundException;
	
	public String bookRide(String driverId, Integer x, Integer y) throws CabUserNotFoundException;
	
	public List<CabUser> listOfAllUsers() throws CabUserNotFoundException;
	
	public CabUser updateUser(String cabUserId, CabUser cabUser) throws CabUserNotFoundException;
	
}
