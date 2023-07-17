package com.citibank.domain;

import java.util.Objects;

public class Employee {
	{
		System.out.println("Non Static block");
	}
	static {
		System.out.println("Static Block");
	}
	public static int employeeId1 = 101;
	public int employeeId;
	private double salary;
	private String name;
	public Employee() {
		// TODO Auto-generated constructor stub
		System.out.println("const");
	}
	public Employee(String name, double salary) {
		this.employeeId = employeeId1;
		this.salary = salary;
		this.name = name;
		employeeId1 = employeeId1 + 1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(employeeId, name, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", salary=" + salary + ", name=" + name + "]";
	}
	
	
}
