package day24_Practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxAndMin {

    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>
                (Arrays.asList(1, 1, -2, -2, -2, 3, 4, 5, 6, 7, 8, 8, 8, 8));

        nums.removeIf(p -> p == Collections.min(nums));
        int secondMin = Collections.min(nums);

        nums.removeIf(p -> p == Collections.max(nums));
        int SecondMax = Collections.max(nums);

        System.out.println("secondMin = " + secondMin);
        System.out.println("SecondMax = " + SecondMax);




    }
}
