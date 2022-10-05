package kz.bitlab.db;

import java.util.ArrayList;

public class DBManager {

    private static ArrayList<Films> Film = new ArrayList<>();
    private static int id = 9;

    static {
        Film.add(new Films(1, "Titanic", "Film about ship", "tragedy", 1997, 186, 9.3));
        Film.add(new Films(2, "Britannic", "Film about ship", "tragedy", 1999, 127, 6.3));
        Film.add(new Films(3, "Olympic", "Film about ship", "tragedy", 2002, 153, 7.12));
        Film.add(new Films(4, "Lusitania", "Film about ship", "tragedy", 1982, 97, 9.0));
        Film.add(new Films(5, "Costa Concordia", "Film about ship", "action", 2020, 112, 6.1));
        Film.add(new Films(6, "Interstellar", "Film about space", "fantasy", 2018, 176, 8.5));
        Film.add(new Films(7, "Inception", "Film about dreams", "fantasy", 2016, 118, 8.4));
        Film.add(new Films(8, "Passengers", "Film about space", "fantasy", 2019, 123, 8.9));
    }


    public static void addFilm(Films film){
        film.setId(id);
        id++;
        Film.add(film);


    }
    public static ArrayList<Films> getFilms(){
        return Film;
    }
}
