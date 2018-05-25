package com.bridgeit.LoginRegistration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.Dao.LoginValidation;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    
    public Login() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		boolean status;
		PrintWriter pw=response.getWriter();
		
		String username =request.getParameter("username");
		String password =request.getParameter("password");
		try {
			status =LoginValidation.validate(username, password);
			pw.println(status);
			if(status==true)
			{
				pw.println("login successfully");
				
			}
			else
			{
				pw.println("not a valid user");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
