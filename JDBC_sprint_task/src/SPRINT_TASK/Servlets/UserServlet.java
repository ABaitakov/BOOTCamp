package SPRINT_TASK.Servlets;

import SPRINT_TASK.db.Users;
import SPRINT_TASK.db.dbManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(value = "/user")
public class UserServlet extends HomeServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/JSP/User.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("u_email");
        String password = request.getParameter("u_password");
        String redirect = "/user?error";

        ArrayList<Users> users = dbManager.getUsers();
        for (Users u : users) {
            if (u!=null){
                if (email.equals(u.getEmail()) && password.equals(u.getPassword())) {
                    redirect = "/Profile?id=" + u.getId();
                    break;
                }
            }
        }
        response.sendRedirect(redirect);
    }
}
