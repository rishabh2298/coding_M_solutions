package com.masai.dao;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.util.EMUtil;

import jakarta.persistence.EntityManager;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public Employee saveEmployee(Employee employee) throws EmployeeException {

		EntityManager em = EMUtil.provideEntityManager();
		
		if(employee==null) throw new EmployeeException("Please fill all data of Employee......");
		
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
		
		if(employee==null) throw new EmployeeException("Employee with this Id doesn't Exist.......");
		
		em.getTransaction().commit();
		
		em.close();
		
		return employee;
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {

		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		Employee employee = em.find(Employee.class, empId);
		
		if(employee==null) throw new EmployeeException("Employee with this Id doesn't Exist...........");
		
		em.remove(employee);
		System.out.println("Employee data this id deleted successfully.........");
		
		em.getTransaction().commit();
		
		em.close();
		
		return employee;
	}

	@Override
	public Employee updateEmployeeSalary(int empId, int salary) throws EmployeeException {

		EntityManager em = EMUtil.provideEntityManager();

		em.getTransaction().begin();
		
		Employee employee = em.find(Employee.class, empId);
		
		if(employee==null) throw new EmployeeException("No such Employee Exist with this Id......");
		
		employee.setSalary(salary);
		
		em.getTransaction().commit();
		
		em.close();
		
		return null;
	}

}
