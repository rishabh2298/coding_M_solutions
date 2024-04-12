package com.masai.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.app.exception.PoliceStationNotFoundException;
import com.masai.app.model.FIR;
import com.masai.app.model.LogIn;
import com.masai.app.model.Police;
import com.masai.app.model.PoliceStation;
import com.masai.app.repository.FirRepository;
import com.masai.app.repository.PoliceStationRepository;

public class PoliceStationServiceImpl implements PoliceStationService {

	
	@Autowired
	private PoliceStationRepository policeStationRepository;
	
	
	@Autowired
	private FirRepository firRepository;
	
	
	@Autowired
	private LogInService logInService;
	
	
	
	
	
	
	@Override
	public String logInPoliceStation(LogIn logInDTO) throws PoliceStationNotFoundException {
		
		return logInService.userLogIn(logInDTO);
	}

	@Override
	public PoliceStation registerPoliceStation(PoliceStation policeStation) throws PoliceStationNotFoundException {
		
		Optional<PoliceStation> existedStation = policeStationRepository.findById(policeStation.getStationCode());
		
		if(existedStation.isPresent()) throw new PoliceStationNotFoundException("This police station is already registed...");
		
		return policeStationRepository.save(policeStation);
	}

	@Override
	public List<FIR> getOldOpenFirDetails(String stationId) throws PoliceStationNotFoundException {
		
		PoliceStation station = policeStationRepository.findById(stationId).orElseThrow(() -> new PoliceStationNotFoundException("This police station is not registed...."));
		
		List<FIR> allFirs = station.getFirList();
		
		List<FIR> notClosedFirs = new ArrayList<>();
		
		allFirs.forEach(s -> {
			if(s.getIsOpen()==false) {
				notClosedFirs.add(s);
			}
		});
		
		return notClosedFirs;
	}

	@Override
	public Police getPoliceThatClosedMaxCases(String stationId) throws PoliceStationNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
