package com.citibank.domain;

import java.util.Objects;

public class Employee {
	private int employeeid;
	private String name;
	private double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeid, String name, double salary) {
		super();
		this.employeeid = employeeid;
		this.name = name;
		this.salary = salary;
		System.out.println(employeeid + name + salary);
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("in HashCode");
		return Objects.hash(employeeid, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in Equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeid == other.employeeid && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	
}
