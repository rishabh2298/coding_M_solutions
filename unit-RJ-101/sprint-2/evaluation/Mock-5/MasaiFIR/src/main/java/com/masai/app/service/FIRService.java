package com.masai.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.app.exception.FIRNotFoundException;
import com.masai.app.model.FIR;

@Service
public interface FIRService {

	public FIR colseFirWith24Hours(Integer firId ,String userKey) throws FIRNotFoundException;
	
	public FIR colseFir(Integer policeId, Integer firId, String userKey) throws FIRNotFoundException;
	
	public List<FIR> giveAllFirToAnotherPolice(Integer policeIdOld, Integer PoliceIdNew) throws FIRNotFoundException;
	
}
