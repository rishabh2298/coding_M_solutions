package com.masai.app.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.app.exception.PoliceStationNotFoundException;
import com.masai.app.model.FIR;
import com.masai.app.model.LogIn;
import com.masai.app.model.Police;
import com.masai.app.model.PoliceStation;

@Service
public interface PoliceStationService {

	public String logInPoliceStation(LogIn logInDTO) throws PoliceStationNotFoundException;
	
	public PoliceStation registerPoliceStation(PoliceStation policeStation) throws PoliceStationNotFoundException;
	
	public List<FIR> getOldOpenFirDetails(String stationId) throws PoliceStationNotFoundException;
	
	public Police getPoliceThatClosedMaxCases(String stationId) throws PoliceStationNotFoundException;
	
	
	
}
