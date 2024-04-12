package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.masai.model.JobCounsaltancy;

public class JobAvailabilityImpl implements JobAvailability {
	
	@Autowired
	JobCounsaltancy jobCounsaltancy;

	public void findJob(String message){
     // Code Logic
	}

}
