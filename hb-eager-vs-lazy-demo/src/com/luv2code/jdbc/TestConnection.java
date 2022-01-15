package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
	
	private String jdbc = "jdbc:mysql://localhost:3306/hb-03-one-to-many?useSSL=false&serverTimezone=UTC";
	private String user = "hbstudent";
	private String pass = "hbstudent";
	
	public static void main(String[] args) {
		TestConnection testConnection = new TestConnection();
		testConnection.testConnection();
		
	}
	
	private void testConnection() {
		System.out.println("Connecting to DB: " + jdbc);
		try {
			Connection connection = DriverManager.getConnection(jdbc, user, pass);
			System.out.println(connection);
			System.out.println("Connection sucessfull");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
