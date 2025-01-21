<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>
<h1> Hello JSP</h1>
<br/>
<%! int x = 10; %>
<strong>Value of x is <%= x %> </strong>

<br/>

<%= new Integer(50) %>
<br/>

<%= new String("Mandar") %>
<br/>

<%= 50*2 %>
<br/>

<%= 25>3 %>
<br/>

<%! String message(){
	return "Hello from message()";
	}%>
<%= message() %>

<%

	int a = 10;
	out.print("Value of a: " + a);
	out.print(a);
	response.sendRedirect("https://www.google.com");

%>

<%-- Comments in JSP --%>



</body>
</html>