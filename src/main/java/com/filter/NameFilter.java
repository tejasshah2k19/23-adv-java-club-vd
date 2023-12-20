package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/NameServlet") // servlet url 
public class NameFilter implements Filter {

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
			
		String userName = request.getParameter("userName");
		
		if(userName == null || userName.trim().length() == 0 ) {
			//go back
			request.setAttribute("nameError","Please Enter UserName");
			RequestDispatcher rd = request.getRequestDispatcher("Name.jsp");
			rd.forward(request,response);
		}else {
			//go ahead 
			chain.doFilter(request,response);	//next Filter , servlet   
			
		}
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		
	}
 

}
