<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>set property</title>
</head>
<body>

<jsp:useBean id="user" class="com.mandar.User" scope="request"></jsp:useBean>
<jsp:setProperty property="firstName" name="user" value="Virat"/> 
<br>
<jsp:setProperty property="lastName" name="user" value="Kohli"/> 

Values updated - Virat Kohli

<br>

First Name: <jsp:getProperty property="firstName" name="user"/> 
<br>
Last Name: <jsp:getProperty property="lastName" name="user"/> 

<%
	request.getRequestDispatcher("getProperty.jsp").forward(request, response);
%>

</body>
</html>