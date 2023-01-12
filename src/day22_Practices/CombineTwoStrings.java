package day22_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class CombineTwoStrings {

    public static void main(String[] args) {

        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};

        System.out.println(combineTwoArrays(arr1,arr2));
    }

    public static ArrayList <String> combineTwoArrays (String [] arr1, String [] arr2) {
        ArrayList <String> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {

            list.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            list.add(arr2[i]);
        }
        return list;
    }
}
