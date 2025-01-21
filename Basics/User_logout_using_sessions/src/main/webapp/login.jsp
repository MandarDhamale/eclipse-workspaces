<jsp:include page="include/header.jsp">
<jsp:param value="Login Page" name="titlePage"/>
</jsp:include>

<br>

<br>

<br>

<br>

	<form action="<%=request.getContextPath()%>/SiteController" method="post">
		<div class="form-group">
			username: <input type="text" name="username" required="required"><br>
			password: <input type="password" name="password" required="required"><br> 
			<input type="hidden" name="action" value="authenticate">
			<button class="btn btn-success" type="submit" value="login">Login</button>
		</div>
	</form>
	
	<br> 
	<%= request.getSession().getAttribute("username") %>
	
<jsp:include page="include/footer.jsp"></jsp:include>
	