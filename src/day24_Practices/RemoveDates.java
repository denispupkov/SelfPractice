package day24_Practices;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDates {

    public static void main(String[] args) {

        ArrayList<LocalDate> dates = new ArrayList<>();

        LocalDate date1 = LocalDate.of(2014,10,10);
        LocalDate date2 = LocalDate.of(2016,8,21);
        LocalDate date3 = LocalDate.of(2022,9,30);
        LocalDate date4 = LocalDate.of(2016,8,14);
        LocalDate date5 = LocalDate.of(2010,1,31);


        LocalDate august_15_2016 = LocalDate.of(2016,8,15);

        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MMMM-dd-YYYY");

        dates.addAll(Arrays.asList(date1,date2,date3,date4,date5));

        dates.removeIf(p -> p.isBefore(august_15_2016));
        System.out.println(dates);

        }


    }

