package kz.JSP.Servlets;

import kz.JSP.DB.DBManager;
import kz.JSP.DB.Item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/addItem")
public class AddItemServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/JSP/addItem.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("item_name");
        int price = Integer.parseInt(request.getParameter("item_price"));
        int amount = Integer.parseInt(request.getParameter("item_amount"));

        Item it = new Item(0, name, price, amount);
        DBManager.addItem(it);
        System.out.println(it);
        response.sendRedirect("/addItem?success");
    }
}
