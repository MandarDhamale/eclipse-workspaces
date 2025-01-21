<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>

	<form action="<%=request.getContextPath()%>/SiteController" method="post">

		username: <input type="text" name="username" required="required"><br>
		password: <input type="password" name="password" required="required"><br> 
		<input type="submit" value="login">

	</form>
	
</body>
</html>