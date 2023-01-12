package day24_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class CountryNames {

    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>(Arrays.asList
                ("Egypt","Japan","New Zealand","Bangladesh","Tibet","Brazil","Puerto Rico","Netherlands"));

                countries.removeIf(p -> p.length()>=10);

        System.out.println(countries);
            }
        }


