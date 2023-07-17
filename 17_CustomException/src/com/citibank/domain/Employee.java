package com.citibank.domain;

import com.citibank.exception.InvalidEmployeeSalaryException;

public class Employee {
	private int employeeId;
	private String name;
    private double salary;
    
    public Employee() {
		// TODO Auto-generated constructor stub
	}

//	public Employee(int employeeId, String name, double salary) {
	public Employee(int employeeId, String name, double salary) throws InvalidEmployeeSalaryException {
		super();
		this.employeeId = employeeId;
		this.name = name;
		if (salary < 0)
			throw new InvalidEmployeeSalaryException();
		else 
			this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

//	public void setSalary(double salary) {
	public void setSalary(double salary) throws InvalidEmployeeSalaryException {
		if (salary < 0)
			throw new InvalidEmployeeSalaryException();
		else 
			this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", salary=" + salary + "]";
	}
    
    

}
