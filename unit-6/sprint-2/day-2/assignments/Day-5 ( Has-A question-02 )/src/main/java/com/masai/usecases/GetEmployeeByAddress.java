package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.dao.EmployeeDaoImpl;
import com.masai.entity.Employee;
import com.masai.exception.EmployeeException;

public class GetEmployeeByAddress {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter address");
		String address = input.nextLine();
		
		EmployeeDao dao = new EmployeeDaoImpl();
		
		try {
			List<Employee> list = dao.getEmployeesByAddress(address);
			
			for(Employee emp : list) {
				System.out.println(emp);
			}
		} catch (EmployeeException e) {

			System.out.println(e.getMessage());
		}
		
		input.close();
	}

}
