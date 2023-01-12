package day19_Practices;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0, 0, 7};

        int temp = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i]==0) {

                for (int j = i; j <array.length ; j++) {

                    if (array[j]>0) {

                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                        break;

                    }

                }
                }

            }
        System.out.println(Arrays.toString(array));
            }

        }


