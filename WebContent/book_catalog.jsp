<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Catalog Book</title>
</head>
<body>
	<jsp:useBean id="books" class="model.BookBean">
		 <jsp:setProperty name = "title" property = "title" value = "Zara"/>
         <jsp:setProperty name = "author" property = "author" value = "Ali"/>
	</jsp:useBean>


	<ul>
		<li><jsp:getProperty name="author" property="author" /></li>

	</ul>
</body>
</html>