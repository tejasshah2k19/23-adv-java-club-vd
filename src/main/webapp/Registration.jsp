<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>


<form action="RegistrationServlet" method="post">
	FirstName : <input type="text"  name="firstName" value="${firstNameValue}" />
		<font color="red">${firstNameError}</font>
	 <Br><br>  
	Email :   <input type="text" name="email" value="${emailValue}" />
	<font color="red">${emailError}</font>
	<br><br> 
	Password :  <input type="password"  name="password"/>
	<font color="red">${passwordError}</font>
	<br><br> 
 	
	<button type="submit">Signup</button>	

</form>

</body>
</html>