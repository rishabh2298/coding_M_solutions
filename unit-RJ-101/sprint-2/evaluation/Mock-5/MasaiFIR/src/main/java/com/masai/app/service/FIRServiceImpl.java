package com.masai.app.service;

import java.util.List;

import com.masai.app.exception.FIRNotFoundException;
import com.masai.app.model.FIR;

public class FIRServiceImpl implements FIRService {

	@Override
	public FIR colseFirWith24Hours(Integer firId, String userKey) throws FIRNotFoundException {
		
		
		
		return null;
	}

	@Override
	public FIR colseFir(Integer policeId, Integer firId, String userKey) throws FIRNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<FIR> giveAllFirToAnotherPolice(Integer policeIdOld, Integer PoliceIdNew) throws FIRNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
