<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome</title>
</head>
<body>
	 
	<%
	
String name = request.getParameter("uname");
out.println("Welcome " + name );
	
	%>
	
</body>
</html>