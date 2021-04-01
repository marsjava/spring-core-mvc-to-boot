<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>First web page</title>
</head>
<body>
<h1>Welcome to Spring Boot Web App.</h1>
<form action="addProduct" method="post">
	<label>Enter the Product ID: </label><input type="text" name="pid" />
	<label>Enter the Product Name: </label><input type="text" name="pname" />
	<input type="submit">
</form>
</body>
</html>