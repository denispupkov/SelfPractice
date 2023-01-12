package day20_Practices;

public class UniqueElementsOfArray {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 3, 3, 4, 4, 5, 6, 6, 6, 0};
        int count = 0;

        for (int each1 : arr) {
            count = 0;
            for (int each2 : arr) {

                if (each1 == each2) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(each1 + " ");
            }
        }
    }
}