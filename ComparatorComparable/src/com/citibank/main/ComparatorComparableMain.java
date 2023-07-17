package com.citibank.main;

import java.util.Arrays;
import java.util.Comparator;

import com.citibank.domain.CompareByEmployeeId;
import com.citibank.domain.Employee;

public class ComparatorComparableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,5,3,1,8};
		for (int i : numbers) {
			System.out.println(i);
		}
		System.out.println("----------------------");
		Arrays.sort(numbers);
		for (int i : numbers) 
			System.out.println(i);
		System.out.println("----------------------");
		
		Employee employee1 = new Employee(101,"F", 1000);
		Employee employee2 = new Employee(105,"C", 2000);
		Employee employee3 = new Employee(103,"D", 3000);
		
		Employee[] employees = {employee1, employee2, employee3};
		
		for (Employee employee : employees) {
			System.out.println(employee);		
		}
		Arrays.sort(employees);
		for (Employee employee : employees) {
			System.out.println(employee);		
		}
		System.out.println("----------------------");
		System.out.println("Compare employee by employeeID");
		CompareByEmployeeId compareByEmployeeId = new CompareByEmployeeId();
		Arrays.sort(employees, compareByEmployeeId);
		for (Employee employee : employees) {
			System.out.println(employee);
		}
//		Comparator compareByName = new Comparator() {
//			@Override
//			public int compare(Employee e1, Employee e2) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		};
		Comparator<Employee> byName = (e1, e2) -> e1.getName().compareTo(e2.getName());
		Arrays.sort(employees, byName) ;
	
	}
}
