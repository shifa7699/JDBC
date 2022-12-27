package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertJdbc {
	public static void main(String[] args) {
		try {
			//Register driver step no 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection step no 2
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/shifa_schema","root","shifa7699");
			//create statement step no 3
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("insert into future_emp values(11,'Neha','Opt_MGR','COM',10,18000)");
			System.out.println("inserted successfully");
			conn.close(); //step no 5
		}catch(Exception e)
		{
			System.out.println(e);
		} 
	}
}
