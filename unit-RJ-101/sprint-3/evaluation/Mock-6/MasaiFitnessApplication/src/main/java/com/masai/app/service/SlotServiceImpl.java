package com.masai.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.app.exception.SlotNotFoundException;
import com.masai.app.model.Slot;
import com.masai.app.repository.SlotRepository;

@Service
public class SlotServiceImpl implements SlotService {

	
	@Autowired
	private SlotRepository slotRepository;
	
	
	
	
	
	
	@Override
	public Slot deleteSlot(Integer slotId) throws SlotNotFoundException {

		Slot slot = slotRepository.findById(slotId).orElseThrow(() -> new SlotNotFoundException("No slot exist..."));
		
		slotRepository.delete(slot);

		return slot;
		
	}

	
}
