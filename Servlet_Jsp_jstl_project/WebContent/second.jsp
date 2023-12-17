<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>second page</title>
</head>
<body>
<h1>Welcome Second page</h1>

<%

session.setAttribute("name","akshay");

Cookie c=new Cookie("lname","Dhoke");
response.addCookie(c);

%>


<c:out value="hello akshay"></c:out>



<a href="third.jsp"> Third page</a>

</body>
</html>