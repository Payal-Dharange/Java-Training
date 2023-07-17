package com.citibank.repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.citibank.domain.Employee;

public class EmployeeRepository {
//	private List<Employee> employee =  new ArrayList<>();
	private Set<Employee> employee =  new HashSet<>();
	
	public boolean addNewEmployee(Employee employee) {
		(this.employee).add(employee);
		return true;
	}
//	public List<Employee> getAllEmployee(){
	public Set<Employee> getAllEmployee(){
		return employee;
	}
	public Employee getSingleEmployee(int empId) {
		for (Employee employee2 : employee) {
			if((employee2.getEmployeeid()) == empId)
				return employee2;
		}
		return null;
	}
	public boolean updateSingleEmployee(int empId, double newSal) {
		for (Employee employee2 : employee) {
			if((employee2.getEmployeeid()) == empId) {
				employee2.setSalary(newSal);
				return true;
			}
		}
		return false;
	}
	public boolean deleteSingleEmployee(int empId) {
		Employee employee = getSingleEmployee(empId);
			if(employee != null) {
				this.employee.remove(employee);
				return true;
			}
		return false;
	}
}

