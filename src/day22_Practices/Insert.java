package day22_Practices;

import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {

        //int [] nums  = {1,2,3,4,5};
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(insert(arr, 2, 100)));
        System.out.println(Arrays.toString(insert(arr, 4, 500)));


    }

    public static int[] insert(int[] arr, int index, int element) {

        int[] newArr = new int[arr.length + 1];
        int k = 0;
        for (int i = 0; i < index; i++) {
            newArr[k++] = arr[i];

        }
        newArr[index] = element;
        k += 1;
        for (int i = index; i < newArr.length - 1; i++) {
            newArr[k++] = arr[i];
        }
        return newArr;
    }

    public static double[] insert(double[] arr, int index, double element) {

        double[] newArr = new double[arr.length + 1];
        int k = 0;
        for (int i = 0; i < index; i++) {
            newArr[k++] = arr[i];

        }
        newArr[index] = element;
        k += 1;
        for (int i = index; i < newArr.length - 1; i++) {
            newArr[k++] = arr[i];
        }
        return newArr;

    }

    public static char[] insert(char[] arr, int index, char element) {

        char[] newArr = new char[arr.length + 1];
        int k = 0;
        for (int i = 0; i < index; i++) {
            newArr[k++] = arr[i];

        }
        newArr[index] = element;
        k += 1;
        for (int i = index; i < newArr.length - 1; i++) {
            newArr[k++] = arr[i];
        }
        return newArr;

    }

    public static String[] insert(String[] arr, int index, String element) {

        String[] newArr = new String[arr.length + 1];
        int k = 0;
        for (int i = 0; i < index; i++) {
            newArr[k++] = arr[i];

        }
        newArr[index] = element;
        k += 1;
        for (int i = index; i < newArr.length - 1; i++) {
            newArr[k++] = arr[i];
        }
        return newArr;
    }
}


