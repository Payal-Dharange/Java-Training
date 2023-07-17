package com.citibank.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.citibank.domain.Employee;

public class EmployeeRepository {
	private String username = "root";
	private String password = "Root123$";
	private String url = "jdbc:mysql://localhost:3306/citibankdb";
	private String query;
	private int resultcount;
	private boolean result;
	private ResultSet employeeResults;
	
	//List of employees in table
	private List<Employee> employeeList =  new ArrayList<>();
	//connect database
	private Connection connection;
	//write-store and execute query
	private PreparedStatement preparedStatement;
	
	public boolean addNewEmployee(Employee employee) {
		query = "insert into employee_details value (?,?,?,?,?)";
		try {
			connection = DriverManager.getConnection(url, username, password);
			if (connection != null) {
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, employee.getEmployeeId());
				preparedStatement.setString(2, employee.getFirstName());
				preparedStatement.setString(3, employee.getLastName());
				preparedStatement.setString(4, employee.getEmail());
				preparedStatement.setDouble(5, employee.getSalary());
				
				resultcount = preparedStatement.executeUpdate();
				
				if (resultcount > 0)
					return true;
				else
					return false;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}
	
	public List<Employee> getAllEmployee() {
		query = "select * from employee_details";
		try {
			connection = DriverManager.getConnection(url, username, password);
			if (connection != null) {
				preparedStatement = connection.prepareStatement(query);
				employeeResults = preparedStatement.executeQuery();
				while(employeeResults.next()) {
					int employeeId = employeeResults.getInt("employee_id");
					String firstName = employeeResults.getString("first_name");
					String lastName = employeeResults.getString("last_name");
					String email = employeeResults.getString("email");
					double salary = employeeResults.getDouble("salary");
					Employee employee = new Employee(employeeId, firstName, lastName, email, salary);
					employeeList.add(employee);
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close();
				employeeResults.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return employeeList;
	}
	public Employee getSingleEmployee(int employeeId) {
		query = "select * from employee_details where employee_id = ?";
		try {
			connection = DriverManager.getConnection(url, username, password);
			if (connection != null) {
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, employeeId);
				employeeResults = preparedStatement.executeQuery();
				
				if(employeeResults.next()) {
					int empId = employeeResults.getInt("employee_id");
					String firstName = employeeResults.getString("first_name");
					String lastName = employeeResults.getString("last_name");
					String email = employeeResults.getString("email");
					double salary = employeeResults.getDouble("salary");
					Employee employee = new Employee(empId, firstName, lastName, email, salary);
					return employee;				
			}
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public boolean updateSingleEmployee(int employeeId, double salary) {
		query = "update employee_details set salary = ? where employee_id = ?";
		try {
			connection = DriverManager.getConnection(url, username, password);
			if (connection != null) {
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(2, employeeId);
				preparedStatement.setDouble(1, salary);
				resultcount = preparedStatement.executeUpdate();
				
				if (resultcount > 0)
					return true;
				else
					return false;
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean deleteSingleEmployee(int employeeId) {
		query = "delete from employee_details where employee_id = ?";
		try {
			connection = DriverManager.getConnection(url, username, password);
			if (connection != null) {
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setInt(1, employeeId);
				resultcount = preparedStatement.executeUpdate();
				
				if (resultcount > 0)
					return true;
				else
					return false;
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

}
