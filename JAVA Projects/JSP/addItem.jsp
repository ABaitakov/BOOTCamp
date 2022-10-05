<html>
<head>
    <title>Title</title>
    <%@include file="import.jsp"%>
</head>
<body>
  <%@include file="Navbar.jsp"%>
  <div class="container">
    <div class="row">
      <div class="col-8 mx-auto mb-5">
          <%
            String success = request.getParameter("success");
            if(success!=null) {
          %>
              <div class="alert alert-success alert-dismissible fade show" role="alert">
                  <strong>ITEM successfully added!</strong>
                  <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
              </div>
          <%
              }
          %>
          <form action="/addItem" method="post">
            <div class="form-group mb-2">
              <label class="mb-1">NAME OF PRODUCT:</label>
              <input type="text" name="item_name" class="form-control mb-1">
              <label class="mb-1">PRICE OF PRODUCT (IN KZT):</label>
              <input type="number" name="item_price" class="form-control mb-1">
              <label class="mb-1">AMOUNT:</label>
              <input type="number" name="item_amount" class="form-control mb-1">
              <button class="btn btn-success mt-1">ADD ITEM</button>
            </div>
          </form>
      </div>
    </div>
  </div>
</body>
</html>
