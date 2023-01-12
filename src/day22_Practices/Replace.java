package day22_Practices;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {
        int [] nums  = {1,2,3,4,5};


        System.out.println(Arrays.toString(replace(nums,0,100)));

    }

    public static int [] replace (int [] arr, int index, int newElement) {
         arr[index] = newElement;

         return arr;
         
    }
    public static double [] replace (double [] arr, int index, double newElement) {
        arr[index] = newElement;

        return arr;

    }

    public static char [] replace (char [] arr, int index, char newElement) {
        arr[index] = newElement;

        return arr;

    }
    public static String [] replace (String [] arr, int index, String newElement) {
        arr[index].equals( newElement);

        return arr;

    }
    
}
