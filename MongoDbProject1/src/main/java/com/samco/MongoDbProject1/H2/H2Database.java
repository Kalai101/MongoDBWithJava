package com.samco.MongoDbProject1.H2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class H2Database {
	public static void main (String args[]) throws ClassNotFoundException {
		Connection connection = null;
		Statement stmt = null;
		ResultSet rs = null;
		Class.forName("org.h2.Driver");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		String id = sc.nextLine();
		
		try {
			connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/db1", "sa", "");
			stmt = connection.createStatement();
			String sql = "select * from employee where EMPID =" + id;
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("EMPID"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
