<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- Static method -->
	<h1>Hello - Files in JSP</h1>
	<hr>
	<%@ include file='file1.txt' %>
	<br>
<!-- Dynamic method -->
	<jsp:include page='file2.txt' />

</body>
</html>