package com.masai.dao;

import com.masai.exception.DoctorNotFoundException;
import com.masai.exception.PatientNotFoundException;
import com.masai.model.Doctor;
import com.masai.model.Patient;

public interface HospitalDao {

	public void addDoctor(Doctor doctor);
	
	public Doctor getDoctor(int doctorId) throws DoctorNotFoundException;
	
	public void registerPatient(Patient patient, int doctorId) throws PatientNotFoundException;
	
	public Patient getPatient(int patientId) throws PatientNotFoundException;
	
	public void registerPatientWithDiffDoctor(int PatientId, int doctorId) throws PatientNotFoundException,DoctorNotFoundException;
	
}
