package day20_Practices;

public class CountEvenAndOddNumbers {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 9, 9, 9};
        int even = 0;
        int odd = 0;
        for (int each : arr) {

            if (each % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }

            }
        System.out.println(even+" even numbers");
        System.out.println(odd+" odd numbers");
        }
    }
