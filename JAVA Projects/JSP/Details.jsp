<%@ page import="kz.JSP.DB.Item" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BITLAB SHOP</title>
    <%@include file="import.jsp"%>
</head>
<%@include file="Navbar.jsp"%>
<body>
    <div class="container">
        <div class="row mx-auto">
            <div class="col-12">
                <%
                    Item item = (Item) request.getAttribute("item");
                    if (item!=null) {
                %>
                    <form action="/">
                        <div class="form-group mb-2">
                            <label class="mb-1">NAME OF PRODUCT:</label>
                            <input type="text" placeholder="<%=item.getName()%>" class="form-control mb-1" readonly>
                            <label class="mb-1">PRICE OF PRODUCT:</label>
                            <input type="number" placeholder="<%=item.getPrice()%>" readonly class="form-control mb-1">
                            <label class="mb-1">AMOUNT:</label>
                            <input type="number" placeholder="<%=item.getAmount()%>" class="form-control mb-1" readonly>
                            <button class="btn btn-secondary mt-1 text-light">BACK</button>
                        </div>
                    </form>
                <%
                    }
                %>
            </div>
        </div>
    </div>
</body>
</html>
