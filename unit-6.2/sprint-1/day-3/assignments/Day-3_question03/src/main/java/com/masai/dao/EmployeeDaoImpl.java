package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.entity.Employee;
import com.masai.util.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	public void save(Employee emp) {
		
		EntityManager em = EMUtil.providEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(emp);
		
		System.out.println("Employee Data saved successfully");
		
		em.getTransaction().commit();
		
		em.close();
		
	}

	public String getAddressOfEmployee(int empId) {
		
		EntityManager em = EMUtil.providEntityManager();
		
		em.getTransaction().begin();
		
		Employee employee = em.find(Employee.class, empId);
		
		if(employee==null) return "No such Employee found";
		
		em.getTransaction().commit();
		
		em.close();
		
		return "Employee address = "+employee.getAddress();
	}

	public String giveBonusToEmployee(int empId, int bonus) {

		EntityManager em = EMUtil.providEntityManager();
		
		em.getTransaction().begin();
		
		Employee employee = em.find(Employee.class, empId);
		
		if(employee==null) return "No such Employee Found";
		
		employee.setSalary(employee.getSalary()+bonus);
		
		em.getTransaction().commit();
		
		em.close();
		
		return "Bonus is added successfully";
	}

	public boolean deleteEmployee(int empId) {
		
		EntityManager em = EMUtil.providEntityManager();
		
		em.getTransaction().begin();
		
		Employee employee = em.find(Employee.class, empId);
		
		if(employee==null) return false;
		
		em.remove(employee);
		
		em.getTransaction().commit();
		
		em.close();
		
		return true;
	}

}
