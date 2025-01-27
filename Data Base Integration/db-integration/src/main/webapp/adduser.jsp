<jsp:include page="include/header.jsp"></jsp:include>
<html>
<body> 
<br>
<br>
<br>
<h1>Add user page</h1>

<form action="<%= request.getContextPath() %>/site" method="post">

 <div class="form-group">
User name: <input type="text" name="username" required="required"><br>
Email: <input type="email" name="email" required="required">

<input type="hidden" name="form" value="addUserOperation">
<input type="submit" value="Add user">
</div>

</form>

<br>
<br>

</body>
</html>
<jsp:include page="include/footer.jsp"></jsp:include>