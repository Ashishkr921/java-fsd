<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
		<h2>User Sign Up Page</h2>
		<form action="signUp" method="post">
			<label>Email ID</label>
			<input type="email" name="email">
			
			<label>Password</label>
			<input type="password" name="password">
			
			<input type="Submit" value="Submit">
			<input type="Reset" value="Reset">
		</form>
		
		<br />
		<p>Already have an account? The pls click <a href="loginDB.jsp">here</a></p>
	</body>
</html>
</body>
</html>