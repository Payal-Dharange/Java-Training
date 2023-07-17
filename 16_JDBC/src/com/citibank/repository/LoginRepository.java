package com.citibank.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginRepository {
	private String username = "root";
	private String pwd = "Root123$";
	private String url = "jdbc:mysql://localhost:3306/citibankdb";
	private String query;
	private int repeatcount = 0;
	private ResultSet resultSet;
	
	//connect database
	private Connection connection;
	//write-store and execute query
	private PreparedStatement preparedStatement;

	public String getSingleEmployee(String loginId, String password) {
		query = "select * from login_details where login_id = ? and password = ?";
		try {
			connection = DriverManager.getConnection(url, username, pwd);
			if (connection != null) {
				preparedStatement = connection.prepareStatement(query);
				preparedStatement.setString(1, loginId);
				preparedStatement.setString(2, password);
				resultSet = preparedStatement.executeQuery();
				
				if(resultSet.next()) {
					String userName = resultSet.getString("user_name");
					repeatcount = 0;
					System.out.println(repeatcount);
					return userName;
				}else {
					repeatcount += 1;
					System.out.println(repeatcount);
				}
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				preparedStatement.close();
				resultSet.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public int getRepeatCount() {
		return repeatcount;
	}

}
