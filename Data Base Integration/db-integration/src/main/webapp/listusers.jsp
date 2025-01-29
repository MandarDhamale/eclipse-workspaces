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
        <th>Delete</th>
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
            <a href="<%= request.getContextPath() %>/site?page=updateuser&user_id=<%= _user.getUser_id()%>&username=<%= _user.getUsername() %>&email=<%= _user.getEmail() %>" class="btn btn-link">
              <i class="bi bi-pencil"></i> <!-- Pencil icon -->
            </a>
          </td>
          <td>
            <a href="<%= request.getContextPath() %>/site?page=deleteuser&user_id=<%= _user.getUser_id()%>" class="btn btn-link" onclick="return confirm('Are you sure you want to delete the user <%= _user.getUsername() %>?');">
              <i class="bi bi-trash text-danger"></i> <!-- Trash icon in red -->
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
