<%@ page import="java.util.ArrayList" %>
<%@ page import="SPRINT_TASK.db.Items" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BITLAB SHOP</title>
<%@include file="Import.jsp"%>
</head>
<body>
<%@include file="Nav.jsp"%>
  <div class="container-fluid">
      <div class="row mx-auto mt-4">
          <div class="col-4 mx-auto"  style="justify-content: center">
              <h2>Welcome to BITLAB SHOP</h2>
              <div class="col-11 mx-auto"  style="justify-content: center">
                  <p>Electronic devices with high quality and service</p>
              </div>
          </div>
      </div>
      <div class="row mx-auto mt-5" style="justify-content: center; display: flex">
          <%
              ArrayList<Items> items =(ArrayList<Items>) request.getAttribute("tovary");
              if (items!=null) {
                  for (Items I : items) {

          %>
          <div class="col-3 m-3">
              <div class="card" style="width: 18rem;">
                  <div class="card-body">
                      <h5 class="card-title"><%=I.getName()%></h5>
                      <h4 class="card-title" style="color: #20c997"><%=I.getPrice()%> $</h4>
                      <p class="card-text"><%=I.getDescription()%></p>
                      <a href="#" class="btn btn-success mx-auto w-100">Buy Now</a>
                  </div>
              </div>
          </div>
          <%
                  }
              }
          %>
      </div>
  </div>
</body>
</html>
