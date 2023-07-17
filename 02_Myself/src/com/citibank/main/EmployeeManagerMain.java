package com.citibank.main;

import com.citibank.domain.*;

public class EmployeeManagerMain {

	public static void main(String[] args) {
		System.out.println("Main Start");
		Manager manager = new Manager();
		Employee employee = new Employee();
		manager.giveTask();
		int value = employee.doTask();
		System.out.println("Returned " + value + value);
		System.out.println("Main End");
	}
}
