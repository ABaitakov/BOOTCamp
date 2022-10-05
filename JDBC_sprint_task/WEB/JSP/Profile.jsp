<%@ page import="SPRINT_TASK.db.dbManager" %>
<%@ page import="SPRINT_TASK.db.Users" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BITLAB SHOP</title>
     <%@include file="Import.jsp"%>
</head>
<body>
  <%@include file="Nav.jsp"%>
  <%
      Users user = (Users) request.getAttribute("user");

  %>
    <div class="row mt-5">
      <div class="col-8 mx-auto text-center">
        <h5>Hello, <%=user.getFullName()%></h5>
        <p>This is your profile page</p>
      </div>
    </div>
</body>
</html>
