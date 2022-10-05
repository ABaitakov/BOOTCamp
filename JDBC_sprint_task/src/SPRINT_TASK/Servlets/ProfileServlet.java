package SPRINT_TASK.Servlets;

import SPRINT_TASK.db.Users;
import SPRINT_TASK.db.dbManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/Profile")
public class ProfileServlet extends HomeServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Users user = dbManager.getUser(id);
        request.setAttribute("user",  user);
        request.getRequestDispatcher("/JSP/Profile.jsp").forward(request, response);
    }


}
