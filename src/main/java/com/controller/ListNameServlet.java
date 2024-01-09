package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;

@WebServlet("/ListNameServlet")
public class ListNameServlet extends HttpServlet {

	// data access object

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userName = request.getParameter("userName");

		UserDao.list.add(userName);// static

		request.setAttribute("list", UserDao.list);

		RequestDispatcher rd = request.getRequestDispatcher("ListName.jsp");
		rd.forward(request, response);
	}
}
