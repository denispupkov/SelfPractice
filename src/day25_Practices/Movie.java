package day25_Practices;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country;
    public String title;
    public String genre;
    public LocalDate releaseDate;
    public String director;
    public ArrayList<String> casts = new ArrayList<>();

    public Movie(String country, String title, LocalDate releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast (String newCast) {
        casts.add(newCast);
    }

    public void addCasts (String[] newCasts) {
        casts.addAll(Arrays.asList(newCasts));
    }


    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", casts number=" + casts.size() +
                '}';
    }
}
