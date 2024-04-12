package com.masai.usecase;

import javax.persistence.EntityManager;

import com.masai.entity.Address;
import com.masai.entity.Employee;
import com.masai.util.EMUtil;

public class Main {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.providEntityManager("Employee");
		
		em.getTransaction().begin();
		
		Employee emp1 = new Employee();
		
		emp1.setName("Ram");
		emp1.setGender("male");
		emp1.setSalary(10000);
		emp1.setHomeAddress(new Address("MP","Indore", "123456"));
		emp1.setOfficeAddress(new Address("MH", "Mumbai", "222222"));
		
		Employee emp2 = new Employee();
		
		emp2.setName("Lakshaman");
		emp2.setGender("male");
		emp2.setSalary(8000);
		emp2.setHomeAddress(new Address("CG", "Raipur", "654321"));
		emp2.setOfficeAddress(new Address("MH", "Mumbai", "222222"));
		
		Employee emp3 = new Employee();
		
		emp3.setName("Rani");
		emp3.setGender("female");
		emp3.setSalary(12000);
		emp3.setHomeAddress(new Address("UP", "Banda", "545454"));
		emp3.setOfficeAddress(new Address("MH", "Mumbai", "222222"));
		
		Employee emp4 = new Employee();
		
		emp4.setName("Shital");
		emp4.setGender("female");
		emp4.setSalary(5000);
		emp4.setHomeAddress(new Address("Bihar", "Patna", "343434"));
		emp4.setOfficeAddress(new Address("MH", "Mumbai", "222222"));
		
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		em.persist(emp4);
		
		em.getTransaction().commit();
		
		em.close();
	}

}
