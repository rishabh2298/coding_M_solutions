package com.masai.dao;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.util.EMUtil;

import jakarta.persistence.EntityManager;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {

		EntityManager em = EMUtil.provideEntityManager();
		
		if(employee==null) throw new EmployeeException("please fill all employee details....");
		
		em.getTransaction().begin();
		
		Employee savedEmployee = em.merge(employee);
		
		em.getTransaction().commit();
		
		em.close();
		
		return savedEmployee;
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Employee employee = em.find(Employee.class, empId);
		
		if(employee==null) throw new EmployeeException("No such employee exist with this Id");
		
		em.getTransaction().commit();
		
		em.close();
		
		return employee;
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Employee employee = em.find(Employee.class, empId);
		
		if(employee==null) throw new EmployeeException("No such employee with this Id exist.....");
		
		em.remove(employee);
		System.out.println("Employee deleted succussfully...");
		
		em.getTransaction().commit();
		
		em.close();
		
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {

		EntityManager em = EMUtil.provideEntityManager();
		
		if(employee==null) throw new EmployeeException("Please fill complete data");
		
		em.getTransaction().begin();
		
		Employee updatedEmployee = em.merge(employee);
		
		em.getTransaction().commit();
		
		em.close();
		
		return updatedEmployee;
	}

}
