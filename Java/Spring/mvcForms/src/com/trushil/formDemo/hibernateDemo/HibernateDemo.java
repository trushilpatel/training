package com.trushil.formDemo.hibernateDemo;

import java.sql.Connection;
import java.sql.DriverManager;


public class HibernateDemo {

	public static void main(String[] args) {
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/online_shows?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String pass = "1234";
		

		try {
			System.out.println("connection to database");

			Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);

			System.out.println("Successfully connected to the database");
			
			myConn.close();
		} catch (Exception e){
			System.out.println(e);
		}
	
	}
}
