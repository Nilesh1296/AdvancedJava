package com.bridgeit.LoginRegistration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bridgeit.Dao.RegistrationValidation;

/**
 * Servlet implementation class Registration
 */

public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       RegistrationValidation valid = new RegistrationValidation();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);

		PrintWriter pw=response.getWriter();
		String username =request.getParameter("username");
		String password =request.getParameter("password");
		String phonenumber =request.getParameter("phonenumber");
		String address = request.getParameter("address");
		
			try {
				valid.insertRecord(username, password, phonenumber, address);
				pw.println("successfully inserted");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}

}
