<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Input yourname </h1>

<form action="/result" method="post">

<input type="text" name="name">
<input type="submit" >

</form>


<hr>
<c:if test="${userName!=null}">
	<h3> Hello ${userName}</h3>
</c:if>




</body>
</html>