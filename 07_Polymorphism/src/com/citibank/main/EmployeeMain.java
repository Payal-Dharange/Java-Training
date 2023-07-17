package com.citibank.main;

import com.citibank.domain.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String();
		String p = new String();
		System.out.println(s.equals(p));
		Employee emp = new Employee();
		Employee emp1 = new Employee();
		System.out.println(emp.equals(emp1));
		Employee employee = new Employee(101,"PD", 100.00);
		Employee employee2 = new Employee(101,"PD", 100.00);
		System.out.println(employee.toString());
		System.out.println("Hashcode of Employee1 - " + employee.hashCode());
//		System.out.println(employee2.toString());
//		System.out.println("Hashcode of Employee2 - " + employee2.hashCode());
//		employee2 = employee;
		System.out.println("Hashcode of Employee2 - " + employee2.hashCode());
		employee2 = employee;
		System.out.println("Hashcode of Employee2 - " + employee2.hashCode());
		System.out.println(emp);
		System.out.println(emp.hashCode());
	}

}
