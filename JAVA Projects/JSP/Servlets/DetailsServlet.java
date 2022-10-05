package kz.JSP.Servlets;

import kz.JSP.DB.DBManager;
import kz.JSP.DB.Item;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(value = "/Details")
public class DetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Item item = DBManager.getItem(id);

        if (item!=null) {
            request.setAttribute("item", item);
            request.getRequestDispatcher("/JSP/Details.jsp").forward(request, response);
        }else {
            request.getRequestDispatcher("/JSP/404.jsp").forward(request, response);
        }
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
