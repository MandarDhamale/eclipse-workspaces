<jsp:include page="include/header.jsp"></jsp:include>
<html lang="en">
<body> 

<br><br><br>
<h1 class="text-center">Update User Page</h1>

<div class="container mt-4">
  <form action="<%= request.getContextPath() %>/site" method="post">
    <div class="form-group mb-2">
      <label for="userId" class="form-label">User ID</label>
      <input type="text" class="form-control form-control-sm w-50" name="user_id" id="user_id" value="${param.user_id}" readonly>
    </div>
    <div class="form-group mb-2">
      <label for="username" class="form-label">User Name</label>
      <input type="text" class="form-control form-control-sm w-50" name="username" id="username" value="${param.username}" required="required">
    </div>
    <div class="form-group mb-2">
      <label for="email" class="form-label">Email</label>
      <input type="email" class="form-control form-control-sm w-50" name="email" id="email" value="${param.email}" required="required">
    </div>


    <input type="hidden" name="form" value="updateUserOperation">
    
    <button type="submit" class="btn btn-primary btn-sm w-50 mt-3">Update User</button>
  </form>
</div>

<br><br>

</body>
</html>
<jsp:include page="include/footer.jsp"></jsp:include>
