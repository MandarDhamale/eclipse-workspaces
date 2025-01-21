<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>

<h1>Home</h1>

<p><a href="<% request.getContextPath(); %>/JspExercise/Controller?page=login">Login</a></a></p>
<p><a href="<% request.getContextPath(); %>/JspExercise/Controller?page=signup">Sign up</a></a></p>
<p><a href="<% request.getContextPath(); %>/JspExercise/Controller?page=about">About</a></a></p>


</body>
</html>