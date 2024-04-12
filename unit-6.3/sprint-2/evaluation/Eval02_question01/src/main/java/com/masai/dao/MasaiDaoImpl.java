package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.exception.EmployeeNotFoundException;
import com.masai.exception.PaySlipNotFoundException;
import com.masai.model.Employee;
import com.masai.model.PaySlip;
import com.masai.util.EMUtil;

public class MasaiDaoImpl implements MasaiDao {

	@Override
	public Employee createEmployee(Employee employee) {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		Employee savedEmployee = em.merge(employee);
		em.getTransaction().commit();
		
		em.close();
		
		return savedEmployee;
	}

	@Override
	public void createPaySlip(PaySlip paySlip, int empId) throws EmployeeNotFoundException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Employee employee = em.find(Employee.class, empId);
		
		if(employee==null) throw new EmployeeNotFoundException("This Employee does not Exist");
		
		employee.getPaySlips().add(paySlip);
		
		System.out.println("Pay slip added successfully....");
		
		em.getTransaction().commit();
		
		em.close();
		
	}

	@Override
	public PaySlip getPayslipByMonth(String month) throws PaySlipNotFoundException {

		EntityManager em = EMUtil.provideEntityManager();
		
		String jpql = "select p from PaySlip p where p.month = :required_month";
		
		Query query = em.createQuery(jpql);
		query.setParameter("required_month", month);
		
		List<PaySlip> paySlips = query.getResultList();
		
		if(paySlips.isEmpty()) throw new PaySlipNotFoundException("Pay slip for this month doesn't exist");

		em.close();
		
		return paySlips.get(0);
		
	}

	@Override
	public PaySlip getPayslipByID(int payslipId) throws PaySlipNotFoundException {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		PaySlip paySlip = em.find(PaySlip.class, payslipId);
		
		if(paySlip==null) throw new PaySlipNotFoundException("PaySlip with this Id doesn't exist");
		
		em.getTransaction().commit();
		
		em.close();
		
		return paySlip;
	}

	@Override
	public void createEmployeePaySlips(List<PaySlip> payslips, int empID) throws EmployeeNotFoundException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Employee employee = em.find(Employee.class, empID);
		
		if(employee==null) throw new EmployeeNotFoundException("Employeen with this id is not exist");

		// it will add all payslips at once
		employee.getPaySlips().addAll(payslips);
		
		System.out.println("All payslips added to employee");
		
		em.getTransaction().commit();
		
		em.close();
		
	}

}






