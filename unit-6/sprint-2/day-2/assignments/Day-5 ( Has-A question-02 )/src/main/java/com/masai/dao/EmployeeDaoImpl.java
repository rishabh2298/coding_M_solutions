package com.masai.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entity.Employee;
import com.masai.exception.EmployeeException;
import com.masai.util.DBUtil;

import antlr.TokenWithIndex;
import antlr.debug.NewLineEvent;

public class EmployeeDaoImpl implements EmployeeDao {

	public List<Employee> getAllEmployees() throws EmployeeException {

		EntityManager em = DBUtil.providEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createQuery("Select e from Employee e");
		
		List<Employee> list = null;
		
		try {
			list = (List<Employee>)query.getResultList();
			
		} catch (Exception e) {
			throw new EmployeeException(e.getMessage());
		}
		
		if(list.isEmpty()) {
			throw new EmployeeException("List is Empty");
		}
		
		em.getTransaction().commit();
		
		em.close();
		
		return list;
	}

	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {
		
		EntityManager em = DBUtil.providEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createNamedQuery("GetEmployeeByAddress");
		query.setParameter("empAddress", address);
		
		List<Employee> list = (List<Employee>)query.getResultList();
		
		if(list.size()==0) {
			throw new EmployeeException("No Employee with this address exist");
		}
		
		em.getTransaction().commit();
		
		em.close();
		
		return list;
	}

	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException {

		EntityManager em = DBUtil.providEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createNamedQuery("SalaryInRange");
		query.setParameter("start", startSalary);
		query.setParameter("end", endSalary);
		
		List<Employee> list = (List<Employee>)query.getResultList();
		
		if(list.size()==0) {
			throw new EmployeeException("No such employee with salary in given range exist");
		}
		
		em.getTransaction().commit();
		
		em.close();
		
		return list;
	}

	public Object getEmployeeEmployeeNameAndSalary(int empId) throws EmployeeException {

		EntityManager em = DBUtil.providEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createNamedQuery("GetEmployeeById");
		query.setParameter("id", empId);
		
		Object employee = (Employee)query.getSingleResult();
		
		if(employee==null) {
			throw new EmployeeException("No such employee with this Id exist");
		}
		
		em.getTransaction().commit();
		
		em.close();
		
		return employee;
	}

	public int getEmployeeSalaryById(int empId) throws EmployeeException {

		EntityManager em = DBUtil.providEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createNamedQuery("GetEmployeeById");
		query.setParameter("id", empId);
		
		Employee emp = (Employee)query.getSingleResult();
		
		if(emp==null) {
			throw new EmployeeException("No such employee with this Id exist");
		}
		
		em.getTransaction().commit();
		
		em.close();
	
		return emp.getSalary();
	}

}
