package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.model.Slot;
import com.masai.app.service.SlotService;

@RestController
public class SlotController {

	
	@Autowired
	private SlotService slotService;
	
	
	
	
	
	@DeleteMapping("/masaifitness/slot/{slotId}")
	public ResponseEntity<Slot> deleteSlot(@PathVariable("slotId") Integer slotId ){
		
		Slot slot = slotService.deleteSlot(slotId);
		
		return new ResponseEntity<Slot>(slot,HttpStatus.OK);
		
	}
	
	
}
