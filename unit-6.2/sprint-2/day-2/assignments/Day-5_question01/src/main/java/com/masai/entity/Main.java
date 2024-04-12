package com.masai.entity;

import javax.persistence.EntityManager;

import com.masai.util.EMUtil;

public class Main {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee("Harish", "Male", 20000);
		Employee employee2 = new Employee("Pankaj", "Male", 15000);
		Employee employee3 = new Employee("Malini", "Female", 16000);
		Employee employee4 = new Employee("Shalini", "Female", 8000);
		
		employee1.getEmpAddresses().add(new Address("MP", "Indore", "121212", "HOME"));
		employee1.getEmpAddresses().add(new Address("MH", "Mumbai", "232323", "OFFICE"));
		
		employee2.getEmpAddresses().add(new Address("Bihar", "Patna", "676767", "HOME"));
		employee2.getEmpAddresses().add(new Address("Karnatka", "Banglore", "229992", "OFFICE"));
		
		employee3.getEmpAddresses().add(new Address("Jammu & Kashmir", "Jammu", "001011", "HOME"));
		employee3.getEmpAddresses().add(new Address("T.N.", "Chennai", "009099", "OFFICE"));
		
		employee4.getEmpAddresses().add(new Address("C.G.", "Raipur", "649444", "HOME"));
		employee4.getEmpAddresses().add(new Address("Telangana", "Hydrabad", "123234", "OFFICE"));
		
		
		
		EntityManager em = EMUtil.providEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(employee1);
		em.persist(employee2);
		em.persist(employee3);
		em.persist(employee4);
		
		em.getTransaction().commit();
		
		em.close();
		
		
		
		
//		mysql> select * from employee;
//		+-------+--------+---------+--------+
//		| empId | gender | name    | salary |
//		+-------+--------+---------+--------+
//		|     1 | Male   | Harish  |  20000 |
//		|     2 | Male   | Pankaj  |  15000 |
//		|     3 | Female | Malini  |  16000 |
//		|     4 | Female | Shalini |   8000 |
//		+-------+--------+---------+--------+
//		4 rows in set (0.00 sec)
//		
//		
//
//		mysql> select * from emp_address;
//		+--------+----------+---------+-----------------+--------+
//		| EMP_ID | city     | pincode | state           | type   |
//		+--------+----------+---------+-----------------+--------+
//		|      1 | Mumbai   | 232323  | MH              | OFFICE |
//		|      1 | Indore   | 121212  | MP              | HOME   |
//		|      2 | Banglore | 229992  | Karnatka        | OFFICE |
//		|      2 | Patna    | 676767  | Bihar           | HOME   |
//		|      3 | Jammu    | 001011  | Jammu & Kashmir | HOME   |
//		|      3 | Chennai  | 009099  | T.N.            | OFFICE |
//		|      4 | Raipur   | 649444  | C.G.            | HOME   |
//		|      4 | Hydrabad | 123234  | Telangana       | OFFICE |
//		+--------+----------+---------+-----------------+--------+
//		8 rows in set (0.59 sec)
		
		
	}

}
