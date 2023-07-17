package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Application;
import com.citibank.domain.Employee;

public class ArrayMainNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Employee employee1 = new Employee(101,"Emp1", 100.00);
//		Employee employee2 = new Employee(102,"Emp2", 100.00);
//		Employee employee3 = new Employee(103,"Emp3", 100.00);
//		Employee employee4 = new Employee(104,"Emp4", 100.00);
//		Employee employee5 = new Employee(105,"Emp5", 100.00);
//		Employee [] emp = new Employee[5];
//		emp[0] = employee1;
//		emp[1] = employee2;
//		emp[2] = employee3;
//		emp[3] = employee4;
//		emp[4] = employee5;
		Employee [] emp = new Employee[5];
		emp[0] =  new Employee(101,"Emp1", 100.00);
		emp[1] = new Employee(102,"Emp2", 100.00);
		emp[2] = new Employee(103,"Emp3", 100.00);
		emp[3] = new Employee(104,"Emp4", 100.00);
		emp[4] = new Employee(105,"Emp5", 100.00);
		Application app = new Application(emp);
//		Application app = new Application();
//		app.setEmployee(emp);
		app.displayAllEmployees();
	}

}
