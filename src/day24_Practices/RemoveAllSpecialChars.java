package day24_Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveAllSpecialChars {

    public static void main(String[] args) {

        ArrayList <Character> list = new ArrayList<>(Arrays.asList
                ('$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));

        list.removeIf(p -> !Character.isLetterOrDigit(p));

        System.out.println(list);


    }
}
