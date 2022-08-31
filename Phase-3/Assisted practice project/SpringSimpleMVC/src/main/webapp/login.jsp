<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
		<h2>User Login Page</h2>
		<form action="CheckUser" method="post">
			<label>Email ID</label>
			<input type="email" name="email">
			
			<label>Password</label>
			<input type="password" name="password">
			
			<input type="Submit" value="Submit">
			<input type="Reset" value="Reset">
		</form>
	</body>
</html>