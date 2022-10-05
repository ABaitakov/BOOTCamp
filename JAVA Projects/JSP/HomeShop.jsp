<%@ page import="java.util.ArrayList" %>
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
            <div class="row mt-5">
                <div class="col-12 mx-auto" >
                    <table class="table">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>NAME</th>
                                <th>PRICE</th>
                                <th>AMOUNT</th>
                                <th>DETAILS</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                ArrayList<Item> items = (ArrayList<Item>) request.getAttribute("tovary");
                                if (items!=null) {
                                    for (Item I : items) {
                            %>
                                <tr>
                                    <td>
                                        <%
                                            out.print(I.getId());
                                        %>
                                    </td>
                                    <td>
                                        <%
                                            out.print(I.getName());
                                        %>
                                    </td>
                                    <td>
                                        <%
                                            out.print(I.getPrice());
                                        %>
                                    </td>
                                    <td>
                                        <%
                                            out.print(I.getAmount());
                                        %>
                                    </td>
                                    <td>
                                        <a href="/Details?id=<%=I.getId()%>" class="btn btn-info btn-sm">DETAILS</a>
                                    </td>
                                </tr>
                            <%
                                    }
                                }
                            %>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
