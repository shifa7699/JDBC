package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class ScannerJdbc {
	public static void main(String[] args) {
	//User Input
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Employee Id : "); //Employee Id
	String emp_id=sc.next();
	System.out.println("Enter Employee Name : "); //Employee name
	String Ename=sc.next();
	System.out.println("Enter Designation : "); //Employee Designation
	String designation=sc.next();
	System.out.println("Enter Department : "); //Employee Department
	String dept=sc.next();
	System.out.println("Enter Working hours : "); //Employee Working Hours
	String working_hour = sc.next();
	System.out.println("Enter the salary : "); //Employee Salary
	String Salary = sc.next();

	try {
			//Register driver step no 1
			Class.forName("com.mysql.cj.jdbc.Driver");
			//get connection step no 2
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/shifa_schema","root","shifa7699");
			//create statement step no 3
			PreparedStatement stm;
			//Inserting data in database table
			String sql = "insert into future_emp values(?,?,?,?,?,?)"; 
			stm = conn.prepareStatement(sql);
			stm.setString(1,emp_id);
			stm.setString(2, Ename);
			stm.setString(3, designation);
			stm.setString(4, dept);
			stm.setString(5, working_hour);
			stm.setString(6, Salary);
			stm.execute();
			System.out.println("Inserted Successfully");
	} catch(Exception e) {
		System.out.println(e);
	}
	}
}