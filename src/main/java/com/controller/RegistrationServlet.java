package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
		throws IOException,ServletException
	{

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		//validation 
		boolean isError = false; // no error 
		if(firstName == null || firstName.trim().length() == 0 ) {
			isError = true; 
		}
		
		if(email == null || email.trim().length() == 0 ) {
			isError = true; 
		}
		
		if(password == null || password.trim().length() == 0) {
			isError = true; 
		}
		
		if(isError == true) {
			//goto Registration.jsp 
			//navigate 
			//servlet -- jsp 
			RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
			rd.forward(request,response); // IOException , ServletException 
		}else {
			//goto Home.jsp 
			RequestDispatcher rd = request.getRequestDispatcher("Home.jsp");
			rd.forward(request,response); // IOException , ServletException 

		}
		

		
	}
}
