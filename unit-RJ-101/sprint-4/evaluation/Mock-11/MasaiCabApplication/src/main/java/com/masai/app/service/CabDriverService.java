package com.masai.app.service;

import com.masai.app.exception.CabDriverNotFoundException;
import com.masai.app.model.CabDriver;

public interface CabDriverService {
	
	public CabDriver registerCabDriver(CabDriver cabDriver) throws CabDriverNotFoundException;

}
