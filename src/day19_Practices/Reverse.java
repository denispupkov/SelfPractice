package day19_Practices;

import java.util.Arrays;

public class Reverse {

    public static void main(String[] args) {

        int [] array = {1,2,3,4,5};
        int [] reversedArray = new int[5];

        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length-1-i] = array[i];

        }
        System.out.println(Arrays.toString(reversedArray));

    }
}
