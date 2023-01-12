package day24_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndLastCharacters {

    public static void main(String[] args) {

        ArrayList<String> elements = new ArrayList<>
                (Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        elements.removeIf(p -> p.substring(0,1).equalsIgnoreCase(p.substring(p.length()-1)));

        System.out.println(elements);


    }
}
