package com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.UserBean;
import com.dao.PUserDao;

@WebServlet("/PRegistrationServlet")
public class PRegistrationServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		String age = request.getParameter("age");

		UserBean user = new UserBean();
		user.firstName = firstName;
		user.email = email;
		user.password = password; 
		user.age = Integer.parseInt(age); 

		PUserDao.users.add(user);

		response.sendRedirect("PHome.jsp");
	}

}


