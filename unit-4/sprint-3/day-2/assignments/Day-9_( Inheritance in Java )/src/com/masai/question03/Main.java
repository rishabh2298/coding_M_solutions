package com.masai.question03;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee();
		
		employee.name = "Arjit Singh";
		employee.age = 35;
		employee.phoneNumber = "98302 77744";
		employee.address = "Address 1, Mumbai";
		employee.salary = 50000.984;
		employee.specialisation = "Backend engineer";
		employee.department = "Cyber Security";

		System.out.println("Employee Name : "+ employee.name);
		System.out.println("Employee Age : "+ employee.age);
		System.out.println("Employee phone Number : "+ employee.phoneNumber);
		System.out.println("Employee Address : "+ employee.address);
		employee.printSalary();
		System.out.println("Employee Salary : "+ employee.salary);
		System.out.println("Employee Specialisation : "+ employee.specialisation);
		System.out.println("Employee Department : "+ employee.department);
		System.out.println();

		Manager manager = new Manager();
		
		manager.name = "A.R. Raheman";
		manager.age = 45;
		manager.phoneNumber = "700034 78787";
		manager.address = "Address 2, Mumbai";
		manager.salary = 80000.333;
		manager.specialisation = "Full Stack Developer";
		manager.department = "Security Department";

		System.out.println("Manager Name : "+ manager.name);
		System.out.println("Manager Age : "+ manager.age);
		System.out.println("Manager phone Number : "+ manager.phoneNumber);
		System.out.println("Manager Address : "+ manager.address);
		manager.printSalary();
		System.out.println("Manager Salary : "+ manager.salary);
		System.out.println("Manager Specialisation : "+ manager.specialisation);
		System.out.println("Manager Department : "+ manager.department);		
		
	}

}
