package day24_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAllDigits {

    public static void main(String[] args) {

        ArrayList <Character> list = new ArrayList<>(Arrays.asList
                ( '$', 'A', 'B', '1', '2', 'C', 'D', '@', '!', '3', '4'));
        ArrayList <Character> newList = new ArrayList<>();

        Character [] arr = list.toArray(new Character[0]);

        for (int i = 0; i < arr.length; i++) {


            if (!Character.isDigit(arr[i])) {
                newList.add(arr[i]);
            }
        }

        System.out.println(newList);
    }
}
