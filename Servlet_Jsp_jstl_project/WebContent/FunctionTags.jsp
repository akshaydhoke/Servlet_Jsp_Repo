<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Function Tags</title>
</head>
<body>

	<c:set var="str1" value="Welcome"></c:set>

	<c:if test="${fn:contains(str1, 'Welcome')}">
		<p>Found Welcome</p>
	</c:if>

	<c:set var="str2" value="akshay-dhoke"></c:set>
	<c:set var="str3" value="${fn:split(str2,'-')}"></c:set>
	
    <p> Split String : ${str3}  </p>
	<c:forEach var="i" begin="0" end="3"  >  
	<p> ${ str3[i] } </p>
    </c:forEach>
    
    


</body>
</html>