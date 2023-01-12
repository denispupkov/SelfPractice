package day22_Practices;

import java.util.Arrays;

public class Swap {

    public static void main(String[] args) {

        int [] arr1 = {10,20,30,40,50};
        String [] str = {"Java","Cydeo","API","SQL","Selenium"};
        System.out.println(Arrays.toString(swap(arr1,2,4)));
        System.out.println(Arrays.toString(swap(str,0,1)));


    }

    public static int [] swap (int [] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
return arr;
    }
    public static double [] swap (double [] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static char [] swap (char [] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static String [] swap (String [] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
