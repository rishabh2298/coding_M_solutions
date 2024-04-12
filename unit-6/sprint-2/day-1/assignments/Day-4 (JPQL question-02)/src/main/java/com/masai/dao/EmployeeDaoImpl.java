package com.masai.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entity.Employee;
import com.masai.exception.EmployeeException;
import com.masai.util.EMUilt;

public class EmployeeDaoImpl implements EmployeeDao {

	public Employee registerEmployee(Employee employee) throws EmployeeException {

		EntityManager entityManager = EMUilt.provideConnection();
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(employee);
		
		Query query = entityManager.createNamedQuery("findEmployeeByNameAndSalary");
		query.setParameter("empName", employee.getName());
		query.setParameter("empSalary", employee.getSalary());
		
		Employee employee2 = (Employee)query.getSingleResult();
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		
		if(employee2==null) {
			throw new EmployeeException("Employee Registration fails.......");
		}
		
		return employee2;
	}

	public Employee getEmployeeById(int empId) throws EmployeeException {

		EntityManager entityManager = EMUilt.provideConnection();
		
		entityManager.getTransaction().begin();
		
		Query query = entityManager.createNamedQuery("findEmployeeById");
		query.setParameter("id", empId);
		
		Employee employee = (Employee)query.getSingleResult();
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		
		if(employee==null) {
			throw new EmployeeException("No employee with this Id exist........");
		}
		
		return employee;
	}

	public Employee deleteEmployeeById(int empId) throws EmployeeException {

		EntityManager entityManager = EMUilt.provideConnection();
		
		entityManager.getTransaction().begin();
		
		Employee employee = entityManager.find(Employee.class, empId);
		
//		Query query = entityManager.createNamedQuery("deleteEmployeeById");
//		query.setParameter("id", empId);
		
		if(employee!=null) {
			entityManager.remove(employee);
		}
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
		
		if(employee==null) {
			throw new EmployeeException("Employee with this Id does not exist");
		}
		
		return employee;
	}

	public Employee updateEmployee(Employee employee) throws EmployeeException {

		EntityManager eManager = EMUilt.provideConnection();
		
		eManager.getTransaction().begin();
		
		try {
			Employee employee2 = getEmployeeById(employee.getEmpId());
			
			eManager.merge(employee);
			
		} catch (Exception e) {
			
			throw new EmployeeException("No such Employee exist");
		}
		
		eManager.getTransaction().commit();
		
		eManager.close();
		
		return employee;
	}

}
