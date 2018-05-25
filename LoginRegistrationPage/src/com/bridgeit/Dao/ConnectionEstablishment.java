package com.bridgeit.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEstablishment 
{
	public Connection  getConnectionEstablish() throws ClassNotFoundException, SQLException
	 {
		 Class.forName("com.mysql.jdbc.Driver"); 
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/nilesh","root","root");  
		 return con;
	 }
}
