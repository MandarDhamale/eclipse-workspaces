<jsp:include page="include/header.jsp"></jsp:include>
<html lang="en">
<body> 

<br><br><br>
<h1 class="text-center">Add User Page</h1>

<div class="container mt-4">
  <form action="<%= request.getContextPath() %>/site" method="post">
    <div class="form-group mb-2">
      <label for="username" class="form-label">User Name</label>
      <input type="text" class="form-control form-control-sm w-50" name="username" id="username" required="required">
    </div>
    <div class="form-group mb-2">
      <label for="email" class="form-label">Email</label>
      <input type="email" class="form-control form-control-sm w-50" name="email" id="email" required="required">
    </div>
    
    <input type="hidden" name="form" value="addUserOperation">
    
    <button type="submit" class="btn btn-primary btn-sm w-50 mt-3">Add User</button>
  </form>
</div>

<br><br>

</body>
</html>
<jsp:include page="include/footer.jsp"></jsp:include>
