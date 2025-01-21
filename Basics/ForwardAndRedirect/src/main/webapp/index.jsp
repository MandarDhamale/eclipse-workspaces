<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Home page</title>
</head>
<body>

<%
    //request.getRequestDispatcher("forward.jsp").forward(request, response);
%>


<%

// Redirect to redirect.jsp before sending any content
response.sendRedirect("forward.jsp");

%>

</body>
</html>
