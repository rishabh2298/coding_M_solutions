package com.masai.usecases;

import java.util.List;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entity.Employee;
import com.masai.exception.EmployeeException;

public class GetAllEmployees {
	
	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			List<Employee> list = dao.getAllEmployees();
			
			for(Employee emp : list) {
				System.out.println(emp);
			}
			
		} catch (EmployeeException e) {
			
			System.out.println(e.getMessage());
		}
	}

}
