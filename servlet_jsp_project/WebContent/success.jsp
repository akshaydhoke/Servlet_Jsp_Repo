<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page import="com.Servlets.Bean"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>

	<%
	Bean bean = (Bean) request.getAttribute("bean");

	out.print("<h5>");
	out.print(" Welcome : " + bean.getUname());
	out.print("</h5>");
	%>

</body>
</html>