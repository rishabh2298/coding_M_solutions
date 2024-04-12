package com.masai.usecases;

import javax.persistence.EntityManager;

import com.masai.entity.Employee;
import com.masai.util.DBUtil;

public class AddEmployeeDetails {
	
	public static void main(String[] args) {
		
		EntityManager em = DBUtil.providEntityManager();
		
		em.getTransaction().begin();
		
		Employee emp1 = new Employee("Raj", "Marine Drive Mumbai", 10000);
		Employee emp2 = new Employee("Kishore", "Andheri Mumbai", 20000);
		Employee emp3 = new Employee("Ajay", "Kalkapara Durg", 13000);
		Employee emp4 = new Employee("Rajesh", "Kormangla Banglore", 23000);
		Employee emp5 = new Employee("Hari", "Chennai", 7000);
		
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		em.persist(emp4);
		em.persist(emp5);
		
		em.getTransaction().commit();
		
		em.close();
		
	}

}
