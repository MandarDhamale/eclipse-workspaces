<html>
<head>
<%@ page import="com.mandar.Hello, java.util.Date" %>
</head>
<body>
<h2><%= "Hello World!" %></h2>
<%= new Hello().demo() %>
<br>
<% out.print(new Date()); %>
</body>
</html>
