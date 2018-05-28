package com.bridgeit.filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Registrationfilter implements Filter {

    
    public Registrationfilter() {
       
    }

	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException
	{ 
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phonenumber = request.getParameter("phonenumber");
		String address = request.getParameter("address");
		
		System.out.println("hi");
		if((!username.equals(""))&&(!password.equals(""))&&(!phonenumber.equals(""))&&(!address.equals("")))
		{
			System.out.println("hiiii");
			chain.doFilter(request, response);
		}
		else
		{
			System.out.println("else");
			out.println("<center>Please enter the correct username </center>");
    	 	RequestDispatcher rd = request.getRequestDispatcher("/Registration.html");
    	 	rd.include(request,response);
			
		}
//		String numberletter = "/^[0-9A-Za-z]+$/";
//		String number = "/^[0-9]+$/";
//		String letter ="/^[A-Za-z]+$/";
//		if(!username.matches(numberletter))
//		{
//			out.println("<center>Please enter the correct username </center>");
//		 	RequestDispatcher rd = request.getRequestDispatcher("/Registration.html");
//		 	rd.forward(request,response);
//		}
//		else if(!password.matches(numberletter))
//		{
//			out.println("<center>Please enter the correct correct password </center>");
//			RequestDispatcher rd = request.getRequestDispatcher("/Registration.html");
//			rd.forward(request,response);
//		}
//else if(!phonenumber.matches(number))
//		{
//			out.println("<center>Please enter the correct correct phonenumber </center>");
//			RequestDispatcher rd = request.getRequestDispatcher("/Registration.html");
//			rd.forward(request,response);
//		}
//		else if(!address.matches(letter))
//		{
//			out.println("<center>Please enter the correct correct address </center>");
//			RequestDispatcher rd = request.getRequestDispatcher("/Registration.html");
//			rd.forward(request,response);
//		}
//		else
//		{
//			chain.doFilter(request, response);
//		}
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException
	{
		
	}

}
