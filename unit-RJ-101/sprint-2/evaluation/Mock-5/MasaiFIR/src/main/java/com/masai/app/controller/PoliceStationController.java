package com.masai.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.masai.app.service.PoliceStationService;

@RestController
public class PoliceStationController {

	@Autowired
	private PoliceStationService policeStationService;
	
}
