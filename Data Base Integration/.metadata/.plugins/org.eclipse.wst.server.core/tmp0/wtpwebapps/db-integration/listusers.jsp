<jsp:include page="include/header.jsp"></jsp:include>
<%@ page import = "java.util.List" %>
<%@ page import = "com.mandar.entity.User" %>
<br>
<br>
<br>
<br>

<h1>List Users</h1>

<table border="1">

<thead>

<th>User ID</th>
<th>Username</th>
<th>Email</th>

</thead>


<%

List<User> listUsers =  (List) request.getAttribute("listUsers");

for(User _user: listUsers){
	
	out.print("<tr>");
	out.print("<td>" + _user.getUser_id() + "</td>");
	out.print("<td>" + _user.getUsername() + "</td>");
	out.print("<td>" + _user.getEmail() + "</td>");
	out.print("</tr>");
	
}

%>

</table>

<br>
<br>
<br>
<br>

<jsp:include page="include/footer.jsp"></jsp:include>