package com.jdbc;
//CRUD Operation---> Create Read Update Delete
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CRUD_Eg {  //Main class
	public static void main(String[] args) { //Main method
		try {
			//Step 1 to register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Step 2 to Get Connection
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/shifa_schema","root","shifa7699");
			//Step 3 to create statement
			Statement stm = con.createStatement(); 
			//Insertion
			stm.executeUpdate("insert into CUSTOMER values('A07','Shifa','Iqbal','SA',9780758, '22-Mar-01',900.50)");
			//Update table
			stm.executeUpdate("Update CUSTOMER set Fname='Neha' where Cust_id='A05'");
			//Delete record
			stm.executeUpdate("delete from Customer where Cust_id='A02'");
			//execute query fetch data from database
			ResultSet rs= stm.executeQuery("select * from CUSTOMER");
			//Iteration
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getDouble(7));
				}
				con.close();
		}catch (Exception e)  {
			System.out.println(e);
		}
	}
}
