package com.masai.question05.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.question05.db.DataBase;
import com.masai.question05.exception.EmployeeException;
import com.masai.question05.model.Employee;


public class DaoMethodsImpl implements DaoMethods {


	public String registerEmployee(Employee employee) throws EmployeeException {
		
		String message = "Employee's registration fails...";
		
		if(employee!=null) {

			EntityManager em = DataBase.getConnection();
			
			em.getTransaction().begin();
			
			em.persist(employee);
			
			message = "Registration successful...";
			
			em.getTransaction().commit();
			
			em.close();
		}
		else {
			throw new EmployeeException("Employee detials not completed....");
		}
		
		
		return message;
	}

	
	public Employee getEmployeeById(int empId) throws EmployeeException {

		EntityManager em = DataBase.getConnection();
		
		Employee employee = null;
		
		try {
			
			em.getTransaction().begin();
			
			employee = em.find(Employee.class, empId);
			
			em.getTransaction().commit();
			
		} catch (Exception e) {
			
			throw new EmployeeException("This id doesn't exist.....");
		}
		
		return employee;
	}

}
