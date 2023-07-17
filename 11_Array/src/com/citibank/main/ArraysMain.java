package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Employee;

public class ArraysMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size of Array");
		int size = new Scanner(System.in).nextInt();
		Employee [] emp = new Employee[size];
		emp[0] =  new Employee(101,"Emp1", 100.00);
		emp[1] = new Employee(102,"Emp2", 100.00);
		emp[2] = new Employee(103,"Emp3", 100.00);
		emp[3] = new Employee(104,"Emp4", 100.00);
		emp[4] = new Employee(105,"Emp5", 100.00);
		for(Employee i : emp) {
			System.out.println(i);
		}
		
	}

}
