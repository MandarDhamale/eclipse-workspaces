<jsp:include page="include/header.jsp">
<jsp:param value="Home Page" name="titlePage"/>
</jsp:include>
<h2><%= "Hello World!" %></h2>

<a href="<%= request.getContextPath() %>/SiteController?action=login"><h1>Log in -> </h1></a>

<jsp:include page="include/footer.jsp"></jsp:include>
