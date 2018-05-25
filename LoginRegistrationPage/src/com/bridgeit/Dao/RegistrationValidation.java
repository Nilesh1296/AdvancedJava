package com.bridgeit.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationValidation
{
	static Connection con = null;
	static ConnectionEstablishment connect = new ConnectionEstablishment();
 
 public static void insertRecord(String username,String password,String phonenumber,String address) throws ClassNotFoundException, SQLException
 {
      
	 con = connect.getConnectionEstablish();
	 String query = "insert into registration values(?,?,?,?)";
	 PreparedStatement pstmt = con.prepareStatement(query);
	 pstmt.setString(1,username);
	 pstmt.setString(2,password);
	 pstmt.setString(3,phonenumber);
	 pstmt.setString(4,address);
	 int i=pstmt.executeUpdate();
		 
		 System.out.println("inserted successfully");
		

	 
 }
}
