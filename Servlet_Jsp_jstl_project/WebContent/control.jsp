<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>control page</title>
</head>
<body>
	<h1>Welcome to control page</h1>

  <%--  <c:forEach items="${studes}" var="s">
   
    ${s}<br/>
   
   </c:forEach>
   
   --%>
 
   
   <c:forEach var="s" begin="1" end="4">
   
   Item <c:out value=""  />
   
   </c:forEach>
   

</body>
</html>