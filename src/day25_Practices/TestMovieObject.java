package day25_Practices;

import java.time.LocalDate;

public class TestMovieObject {

    public static void main(String[] args) {

    Movie movie1 = new Movie("USA","Java Developer: Zero To Hero",
            LocalDate.of(2021,4,18),"Kuzzat Altay");

    String[] casts = {"Ozzy", "Ali", "Muhtar"};
    movie1.addCasts(casts);
       movie1.addCast("Dana");
       movie1.addCast("Arstan");
       movie1.addCast("Taylor");
       movie1.addCast("Kemal");
       movie1.addCast("Aynur");

        System.out.println(movie1);


    }
}
