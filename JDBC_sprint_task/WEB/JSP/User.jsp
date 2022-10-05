<%@ page import="SPRINT_TASK.db.Users" %>
<%@ page import="SPRINT_TASK.db.dbManager" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BITLAB SHOP</title>
     <%@include file="Import.jsp"%>
</head>
<body>
  <%@include file="Nav.jsp"%>
    <div class="row mt-5">
      <div class="col-8 mx-auto">
        <%
        String error = request.getParameter("error");
        if(error!=null) {
      %>
        <div class="alert alert-danger alert-dismissible fade show" role="alert">
          <strong>EMAIL OR PASSWORD INCORRECT!</strong>
          <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
        </div>
        <%
          }
        %>
        <form action="/user" method="post">
          <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Email:</label>
            <div class="col-sm-10">
              <input class="form-control" type="text" placeholder="email" name="u_email">
            </div>
          </div>
          <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Password:</label>
            <div class="col-sm-10">
              <input class="form-control" type="password" placeholder="password" name="u_password">
            </div>
          </div>
          <button class="btn btn-success mt-3 p-2">SIGN IN</button>
        </form>
      </div>
    </div>
</body>
</html>
