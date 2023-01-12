package day23_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSpecificElementFromArrayList {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList
                ("John", "Ahmed", "Daniel", "Ahmed", "James", "Muhammed"));

        list.removeAll(Arrays.asList("Ahmed"));

        System.out.println(list);

    }
}
