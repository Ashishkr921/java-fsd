<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
	<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>User Details</title>
	</head>
	<body>
	${requestScope.obj }
		<h2>User Login Page</h2>
		<form action="signIn" method="post">
			<label>Email ID</label>
			<input type="email" name="email">
			
			<label>Password</label>
			<input type="password" name="password">
			
			<input type="Submit" value="Submit">
			<input type="Reset" value="Reset">
		</form>
		
		<br />
		<p>New user? Then Pls click<a href ="signUp.jsp">here</a></p>
	</body>
</html>
