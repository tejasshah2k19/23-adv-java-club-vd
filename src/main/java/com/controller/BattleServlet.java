package com.controller;

import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/BattleServlet")
public class BattleServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse repsonse)
	{

		
		String a = request.getParameter("aCard");//"10,20,30"
		String b = request.getParameter("bCard");//20,30,40 
		
		
		
		ArrayList<Integer> aCard = new ArrayList<Integer>();
		ArrayList<Integer> bCard = new ArrayList<Integer>();
		
		//aCard => a 
		//bCard => b 
		
		
		//battle 
		
		
				
		
	}
}
