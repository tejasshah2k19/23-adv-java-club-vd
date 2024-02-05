package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");
		
		//session is created by server - we can not create 
		//we can access it and we can store value inside session 
		
		//how we can access session 
		HttpSession session = request.getSession();
		
		//set data inside session 
		session.setAttribute("name", name);
		
		
		request.getRequestDispatcher("SessionData.jsp").forward(request, response);
		
		
	}

}
