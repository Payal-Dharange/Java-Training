package com.citibank.main;

import com.citibank.domain.Employee;

public class EmployeeMain {
	static int x = 10;
	public static void main(String[] args) {
		System.out.println(x);
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Emp1", 100.00);
		Employee emp2 = new Employee("Emp2", 100.00);
		Employee emp3 = new Employee("Emp3", 100.00);
		Employee emp4 = new Employee("Emp4", 100.00);
		Employee emp5 = new Employee("Emp5", 100.00);
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		System.out.println(emp4.toString());
		System.out.println(emp5.toString());
	}
	

}
