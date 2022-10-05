package kz.bitlab.servlets;

import kz.bitlab.db.DBManager;
import kz.bitlab.db.Films;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/addfilm")
public class AddFilmServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         String name = request.getParameter("film_name");
         String description = request.getParameter("film_description");
         String genre = request.getParameter("film_genre");
         int year = Integer.parseInt(request.getParameter("film_year"));
         int duration = Integer.parseInt(request.getParameter("film_duration"));
         double rating = Double.parseDouble(request.getParameter("film_rating"));

        System.out.println(name+" "+description+" "+genre+" "+year+" "+duration+" "+rating);

        Films films = new Films();
        films.setName(name);
        films.setDescription(description);
        films.setGenre(genre);
        films.setYear(year);
        films.setDuration(duration);
        films.setRating(rating);

        DBManager.addFilm(films);
        response.sendRedirect("/");

    }
}
