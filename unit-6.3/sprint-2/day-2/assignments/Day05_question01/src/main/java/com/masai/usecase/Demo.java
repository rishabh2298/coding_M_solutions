package com.masai.usecase;

import com.masai.model.Address;
import com.masai.model.Employee;
import com.masai.util.EMUtil;

import jakarta.persistence.EntityManager;

public class Demo {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Address add1 = new Address("M.H.", "Pune", "111 333", "Home");
		Address add2 = new Address("T.N.", "Chennai", "332 111", "Home");
		Address add3 = new Address("Oddisa", "Bhubneshwar", "232 222", "Home");
		Address add4 = new Address("Bihar", "Patna", "333 444", "Home");
		
		Address officeAddress = new Address("MH", "Mumbai", "223 331", "Office");
		
		
		
		Employee emp1 = new Employee();
		
		emp1.setName("Hari");
		emp1.setGender("Male");
		emp1.setSalary(24000);
		emp1.getAddresses().add(add1);
		emp1.getAddresses().add(officeAddress);
		
		

		Employee emp2 = new Employee();
		
		emp2.setName("Raju");
		emp2.setGender("Male");
		emp2.setSalary(55000);
		emp2.getAddresses().add(add2);
		emp2.getAddresses().add(officeAddress);
		
		

		Employee emp3 = new Employee();
		
		emp3.setName("Pinky");
		emp3.setGender("Female");
		emp3.setSalary(36050);
		emp3.getAddresses().add(add3);
		emp3.getAddresses().add(officeAddress);
		
		
		

		Employee emp4 = new Employee();
		
		emp4.setName("Anshu");
		emp4.setGender("Female");
		emp4.setSalary(37890);
		emp4.getAddresses().add(add4);
		emp4.getAddresses().add(officeAddress);
		
		
		
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		em.getTransaction().begin();
		
		em.persist(emp1);
		em.persist(emp2);
		
		em.getTransaction().commit();
		
		em.close();
		
		
		
		
		
		EntityManager em2 = EMUtil.provideEntityManager();
		
		
		em2.getTransaction().begin();
		
		em2.persist(emp3);
		em2.persist(emp4);
		
		em2.getTransaction().commit();
		
		em2.close();
		
	}

}
