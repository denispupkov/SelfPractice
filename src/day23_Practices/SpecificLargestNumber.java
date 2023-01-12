package day23_Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SpecificLargestNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,7,8,8));

        int nthLargest = 5;
        for (int i = 0; i <=nthLargest; i++) {
            list.remove(Collections.max(list));
        }
        System.out.println(Collections.max(list));

    }
}
