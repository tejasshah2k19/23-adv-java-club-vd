<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>Demo Jsp</h2>

	int a; 
	<br><br>
	<%
		
		int a=10; 
		int b =20; 
		int c = a+b;
	%>
	<%=c %>
	<Br><BR>
	

	<%
		for(int i=1;i<=5;i++){
	%>		
			Royal
	<% 		 
		}
	%>

	<br><br> 
	
	
	
	<%
		for(int j=1;j<=5;j++){

			out.println("Royal");
		}

	%>











	
</body>
</html>