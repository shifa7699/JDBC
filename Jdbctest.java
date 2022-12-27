package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Jdbctest {
	public static void main(String[] args) {
		try {
			//Register driver step no 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection step no 2
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/shifa_schema","root","shifa7699");
			//create statement step no 3
			Statement stmt = conn.createStatement();
			//execute query fetch data from database step no 4
			ResultSet rs= stmt.executeQuery("select *from future_emp");
			//iteration
			while(rs.next())  {
				System.out.println(rs.getInt(1)+"\t "+rs.getString(5)+"\t "+rs.getString(4)+"\t "+rs.getString(3));
			}
			//close database connection step no 5
			conn.close();
			
		}catch (Exception e)  {
			System.out.println(e);
		}
	}

}
