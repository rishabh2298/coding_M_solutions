package com.masai.dao;

import javax.persistence.EntityManager;

import com.masai.model.Employee;
import com.masai.util.DBUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void save(Employee employee) {
		
		EntityManager em = DBUtil.provideConnection();
		
		em.getTransaction().begin();
		
		if(employee!=null) {
			em.persist(employee);
			System.out.println("Employee added successfully...");
		}
		else {
			System.out.println("fail to add employee....");
		}
		
		em.getTransaction().commit();
		
		em.close();
	}

	@Override
	public String getAddressOfEmployee(int empId) {

		EntityManager em = DBUtil.provideConnection();
		
		em.getTransaction().begin();

		Employee employee = em.find(Employee.class, empId);
		
		if(employee!=null) {
			
			return ("Employee address with id "+empId+" is = "+employee.getAddress());
		}
		
		em.getTransaction().commit();
		
		em.close();

		return "No such employee with this ID exist";
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {

		String message = "No such employee with this Id exist........";
		
		EntityManager em = DBUtil.provideConnection();
		
		em.getTransaction().begin();
		
		Employee employee = em.find(Employee.class, empId);
		
		if(employee!=null) {
			
			int salary = employee.getSalary() + bonus;
			
			employee.setSalary(salary);
			
			em.merge(employee);
			
			message = "Bounus is added to employee with id="+empId;
		}
		
		em.getTransaction().commit();
		
		em.close();
		
		return message;
	}

	@Override
	public boolean deleteEmployee(int empId) {

		boolean flag = false;
		
		EntityManager em = DBUtil.provideConnection();
		
		em.getTransaction().begin();
		
		Employee employee = em.find(Employee.class, empId);
		
		if(employee!=null) {
			
			em.remove(employee);
			
			flag = true;
		}
		
		em.getTransaction().commit();
		
		em.close();
		
		return flag;
	}

}
