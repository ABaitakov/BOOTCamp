package kz.bitlab.servlets;
    import kz.bitlab.db.DBManager;
    import kz.bitlab.db.Films;

    import javax.servlet.ServletException;
    import javax.servlet.ServletOutputStream;
    import javax.servlet.annotation.WebServlet;
    import javax.servlet.http.HttpServlet;
    import javax.servlet.http.HttpServletRequest;
    import javax.servlet.http.HttpServletResponse;
    import java.io.IOException;
    import java.io.PrintWriter;
    import java.util.ArrayList;


@WebServlet(value = "/home")

    public class HomeServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            ArrayList<Films> Film = DBManager.getFilms();
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.print("<form action = '/addfilm' method = 'post'><br><br>");
            out.print("NAME:<input type = 'text' name = 'film_name'><br><br>");
            out.print("DESCRIPTION:<input type = 'text' name = 'film_description'><br><br>");
            out.print("GENRE:<select name = 'film_genre'>");
            out.print("<option>tragedy</option>");
            out.print("<option>comedy</option>");
            out.print("<option>fantasy</option>");
            out.print("<option>action</option>");
            out.print("<option>drama</option><br><br>");
            out.print("</select>");
            out.print("YEAR:<input type = 'number' max = '2022' min = '1904' name = 'film_year'><br><br>");
            out.print("DURATION:<input type = 'number' max = '1000' min = '0' name = 'film_duration'><br><br>");
            out.print("RATING:<input type = 'text' name = 'film_rating'><br><br>");
            out.print("<button>ADD FILM</button><br><br>");
            out.print("</form><br><br><br>");
            out.print("<table cellpadding = '15px'>");
            out.print("<thead>");
            out.print("<tr>");
            out.print("<th>ID</th>");
            out.print("<th>NAME</th>");
            out.print("<th>DESCRIPTION</th>");
            out.print("<th>GENRE</th>");
            out.print("<th>YEAR</th>");
            out.print("<th>DURATION</th>");
            out.print("<th>RATING</th>");
            out.print("<th>DETAILS</th>");
            out.print("</tr>");
            out.print("</thead>");
            out.print("<tbody>");
            for (Films f: Film){
                out.print("<tr>");
                out.print("<td>"+f.getId()+"</td>");
                out.print("<td>"+f.getName()+"</td>");
                out.print("<td>"+f.getDescription()+"</td>");
                out.print("<td>"+f.getGenre()+"</td>");
                out.print("<td>"+f.getYear()+"</td>");
                out.print("<td>"+f.getDuration()+"</td>");
                out.print("<td>"+f.getRating()+"</td>");
                out.print("<td><a href='#'>DETAILS</a></td>");
                out.print("</tr>");
            }
            out.print("</tbody>");
            out.print("</table>");
        }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        }
    }

