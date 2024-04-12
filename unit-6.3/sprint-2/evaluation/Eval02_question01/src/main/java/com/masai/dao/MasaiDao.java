package com.masai.dao;

import java.util.List;

import com.masai.exception.EmployeeNotFoundException;
import com.masai.exception.PaySlipNotFoundException;
import com.masai.model.Employee;
import com.masai.model.PaySlip;

public interface MasaiDao {
	
	public Employee createEmployee(Employee employee);
	
	public void createPaySlip(PaySlip paySlip, int empId) throws EmployeeNotFoundException;
	
	public PaySlip getPayslipByMonth(String month) throws PaySlipNotFoundException;
	
	public PaySlip getPayslipByID(int payslipId) throws PaySlipNotFoundException;
	
	public void createEmployeePaySlips(List<PaySlip> payslips, int empID) throws EmployeeNotFoundException;

}
