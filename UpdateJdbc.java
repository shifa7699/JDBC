package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateJdbc {
	public static void main(String[] args) {
		try {
			//Register driver step no 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection step no 2
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/shifa_schema","root","shifa7699");
			//create statement step no 3
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("Update future_emp set Ename='Sneha'  where emp_id=8"); //update
			//delete record
			stmt.executeUpdate("delete from future_emp where emp_id=9");
			//execute query fetch data from database
			ResultSet rs= stmt.executeQuery("select * from future_emp");
			//Iteration
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getDouble(6));
				}
			//close database connection step no 5
			conn.close();
	} catch(Exception e)  {
		System.out.println(e);
	}
	}
}
