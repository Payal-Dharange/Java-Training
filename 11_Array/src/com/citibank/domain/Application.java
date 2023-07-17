package com.citibank.domain;

public class Application {
	private Employee[] employee= new Employee[5];
	public Application() {
		// TODO Auto-generated constructor stub
	}
	
	public Application(Employee[] employee) {
		super();
		this.employee = employee;
	}

	public Employee[] getEmployee() {
		return employee;
	}

	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}
	public void displayAllEmployees(){
		for(Employee i : employee) {
			System.out.println("in display");
			System.out.println(i);
		}
	}
}
