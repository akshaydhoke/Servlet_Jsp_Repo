<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Core Tags</title>
</head>
<body>

	<c:out value="Welcome Akshay !!!"></c:out>
	
	<c:set var="salary" scope="session" value="${ 20000*5 }"></c:set>

    <c:if test="${salary>90000}">
    
   <p> Salary is ::   <c:out value="${salary}"></c:out> </p>
    
    </c:if>
    
    
    <c:forEach var="j" begin="0" end="10"> <c:out value="${ j }"></c:out>  </c:forEach>
    
    
    
    
</body>
</html> 