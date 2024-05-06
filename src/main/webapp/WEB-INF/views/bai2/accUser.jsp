<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3>Save account to cookies</h3>

<form action="/SaveAccountCookie" method="post">
<label> username :</label> <input type="text" name="username">
<br>
<label> Password :</label> <input type="password" name="password">
<br>
<input type="submit">
</form>

</body>
</html>