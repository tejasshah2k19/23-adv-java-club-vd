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
		
		String regExAlpha = "[a-zA-Z]+";		
		
		//+ => min:1 max:n { length } 
		
		String regExEmail = "[a-zA-Z0-9]+@[a-zA-Z]+.[a-zA-Z]{2,4}"; //min 2 and max 3 
			//krishna123shah@gmail.com 
		 	//aaaaaaa@gmail.com
		//validation 
		boolean isError = false; // no error 
		if(firstName == null || firstName.trim().length() == 0 ) {
			isError = true; 
			request.setAttribute("firstNameError","Please Enter FirstName");
		}else if(firstName.matches(regExAlpha) == false) {
			isError = true; 
			request.setAttribute("firstNameError","Please Enter Valid FirstName");
			
		}
		
		
		if(email == null || email.trim().length() == 0 ) {
			isError = true; 
			request.setAttribute("emailError","Please Enter Email"); 
		}else if(email.matches(regExEmail) == false) {
			isError = true; 
			request.setAttribute("emailError","Please Enter Valid Email"); 
		}
		
		if(password == null || password.trim().length() == 0) {
			isError = true; 
			request.setAttribute("passwordError","Please Enter Password"); 
		}
		
		request.setAttribute("firstNameValue",firstName);
		request.setAttribute("emailValue",email);
 		
		
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
