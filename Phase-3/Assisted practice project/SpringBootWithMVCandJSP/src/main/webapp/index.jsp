<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Hello World!</h2>
	
	<form action="checkUser" method="post">
		<label>Email ID</label>
			<input type="email" name="email"><br />
			
			<label>Password</label>
			<input type="password" name="password"><br />
			
			<input type="Submit" value="Submit">
			<input type="Reset" value="Reset">
	</form>
</body>
</html>