package kz.tasks.servlets;

import kz.tasks.DB.DBStaff;
import kz.tasks.DB.Staff;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(value = "/task")
public class Task extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ArrayList <Staff> staff = DBStaff.getStaff();

        out.print("<table cellpadding = '10px' style='border: 1px solid gray' >");
        out.print("<thead>");
        out.print("<tr>");
        out.print("<th>NAME</th>");
        out.print("<th>SURNAME</th>");
        out.print("<th>DEPARTMENT</th>");
        out.print("<th>SALARY</th>");
        out.print("</tr>");
        out.print("<tbody");
        for (Staff chel : staff) {
            out.print("<tr>");
            out.print("<td>"+chel.getName()+"</td>");
            out.print("<td>"+chel.getSurname()+"</td>");
            out.print("<td>"+chel.getDepartment()+"</td>");
            out.print("<td>"+chel.getSalary()+"</td>");
            out.print("</tr>");
        }
        out.print("</tbody");
        out.print("</thead>");
        out.print("</table>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
