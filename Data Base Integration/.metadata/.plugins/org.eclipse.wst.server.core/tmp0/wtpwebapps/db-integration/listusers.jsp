<jsp:include page="include/header.jsp"></jsp:include>
<%@ page import = "java.util.List" %>
<%@ page import = "com.mandar.entity.User" %>
<br><br><br><br>

<h1 class="text-center mb-4">List Users</h1>

<div class="container">
  <table class="table table-striped table-bordered table-sm">
    <thead class="thead-dark">
      <tr>
        <th>User ID</th>
        <th>Username</th>
        <th>Email</th>
        <th>Update</th>
      </tr>
    </thead>
    <tbody>
      <%
        List<User> listUsers = (List) request.getAttribute("listUsers");
        for(User _user: listUsers) {
      %>
        <tr>
          <td><%= _user.getUser_id() %></td>
          <td><%= _user.getUsername() %></td>
          <td><%= _user.getEmail() %></td>
          <td>
            <a href="<%= request.getContextPath() %>/site?page=updateuser" class="btn btn-link">
              <i class="bi bi-pencil"></i> <!-- Pencil icon -->
            </a>
          </td>
        </tr>
      <%
        }
      %>
    </tbody>
  </table>
</div>

<br><br>

<jsp:include page="include/footer.jsp"></jsp:include>
