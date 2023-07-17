package com.citibank.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "root";
		String password = "Root123$";
		String driverClass = "com.mysql.cj.jdbc.Driver";
		String connectionURL = "jdbc:mysql://localhost:3306/citibankdb";
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(connectionURL, username, password);
			if (connection != null)
				System.out.println("Connection Successful");
			else
				System.out.println("Connection Failed");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
			
		
		
	}

}
