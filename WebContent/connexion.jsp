<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/style.css" rel="stylesheet" type="text/css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Connexion</title>
</head>
<body>
	<h1 style="color:red">Welcome to the E-Library</h1>
	<div class="log_in">
		<h2>Log In</h2>
		<form action="ControllerServlet" method="POST">
			Login: <input type="text" name="login" /> Password: <input
				type="password" name="password" /><input type="submit"
				value="Connect" />
		</form>
	</div>

	<div class="register">
		<h2>Register</h2>
		<form action="ControllerServlet" method="POST">
			First Name : <input type="text" name="FirstName"/>
			Last Name : <input type="text" name="LastName"/>
			Login: <input type="text" name="login" /> Password: <input
				type="password" name="password" /><input type="submit"
				value="Connect" />
		</form>
	</div>


</body>
</html>