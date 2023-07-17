package com.citibank.main;

import com.citibank.domain.Employee;
import com.citibank.exception.InvalidEmployeeSalaryException;

public class CustomExceptionMain {

	public static void main(String[] args) {
		// Create a obejct of Employee class - call the param constructor
		try {
			Employee employee = new Employee(101,"Payal",-100);
			System.out.println(employee);
			} catch (InvalidEmployeeSalaryException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());		
		}
		System.out.println("----------------------");
		Employee employee2 = new Employee();
		try {
			employee2.setSalary(-1000);
			System.out.println(employee2);
		} catch (InvalidEmployeeSalaryException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
//		Employee employee = new Employee(101,"Payal",-100);
		
	}
}
