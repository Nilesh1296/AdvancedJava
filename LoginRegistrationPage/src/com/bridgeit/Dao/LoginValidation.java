package com.bridgeit.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginValidation 
{
	static Connection con = null;
	static ConnectionEstablishment connect = new ConnectionEstablishment();
	public static boolean validate(String username,String password) throws ClassNotFoundException, SQLException
	{
		boolean status=false;
		 con = connect.getConnectionEstablish();
		 String query ="select * from registration where username=? and password =? ";
		 PreparedStatement pstmt = con.prepareStatement(query);
		 pstmt.setString(1,username);
		 pstmt.setString(2,password);
		 ResultSet rs = pstmt.executeQuery();
		 
		 status=rs.next();
		return status;
		
	}
}
