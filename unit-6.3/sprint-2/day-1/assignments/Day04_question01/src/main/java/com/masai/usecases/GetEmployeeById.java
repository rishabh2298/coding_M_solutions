package com.masai.usecases;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.exception.EmployeeException;

public class GetEmployeeById {

	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		
		try {
			System.out.println(dao.getEmployeeById(153));
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
