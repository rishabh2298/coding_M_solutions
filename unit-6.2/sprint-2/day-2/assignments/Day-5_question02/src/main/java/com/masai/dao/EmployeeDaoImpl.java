package com.masai.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.masai.entity.Employee;
import com.masai.exception.EmployeeException;
import com.masai.util.EMUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	public List<Employee> getAllEmployees() throws EmployeeException {
		
		EntityManager em = EMUtil.providEntityManager();
		
		em.getTransaction().begin();
		
		List<Employee> list = (List<Employee>)em.createQuery("Select e from employee e").getResultList();
		
		if(list.isEmpty()) throw new EmployeeException("There is no employee in database");
		
		em.getTransaction().commit();
		
		em.close();
		
		return list;
	}

	public List<Employee> getEmployeesByAddress(String address) throws EmployeeException {
		
		EntityManager em = EMUtil.providEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createNamedQuery("find employee by address");
		query.setParameter("empAddress", address);
		
		List<Employee> list = (List<Employee>)query.getResultList();
		
		if(list.isEmpty()) throw new EmployeeException("No such employee with this address exist");
		
		em.getTransaction().commit();
		
		em.close();
		
		return list;
	}

	public List<Employee> getAllEmployeeWithRangeSalary(int startSalary, int endSalary) throws EmployeeException {
		
		EntityManager em = EMUtil.providEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createNamedQuery("get employee between salary in range",Employee.class);
		query.setParameter("start", startSalary);
		query.setParameter("end", endSalary);
		
		List<Employee> list = (List<Employee>)query.getResultList();
		
		if(list.isEmpty()) throw new EmployeeException("Not such employee exsit within salary range of +"+startSalary+" to "+endSalary);
		
		em.getTransaction().commit();
		
		em.close();
		
		return list;
	}

	public Object[] getEmployeeNameAndSalary(int empId) throws EmployeeException {

		EntityManager em = EMUtil.providEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createNamedQuery("get employee by id",Employee.class);
		query.setParameter("id", empId);
		
		List<Employee> list = (List<Employee>)query.getResultList(); 
		
		if(list.isEmpty()) throw new EmployeeException("No such employee exist");
		
		em.getTransaction().commit();
		
		em.close();
		
		Object[] objects = new Object[list.size()];

		for(int i=0; i<list.size(); i++) {
			
			Object[] obj = new Object[2];
			
			obj[0] = list.get(i).getName();
			obj[1] = list.get(i).getSalary();
			
			objects[i] = obj; 
		}
		
		return objects;
	}

	public int getEmplooyeeSalaryById(int empId) throws EmployeeException {
		
		EntityManager em = EMUtil.providEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createNamedQuery("get employee by id",Employee.class);
		query.setParameter("id", empId);
		
		List<Employee> list = (List<Employee>)query.getResultList(); 
		
		if(list.isEmpty()) throw new EmployeeException("No such employee exist");
		
		em.getTransaction().commit();
		
		em.close();
		
		return list.get(0).getSalary();
	}

}
