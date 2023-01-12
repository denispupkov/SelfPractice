package day22_Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxMinFromArrayList {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        int max = list.get(0);
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {

            if (max < list.get(i)) {
                max = list.get(i);
            }
            if (min > list.get(i)) {
                min = list.get(i);
            }

        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);

    }
}
