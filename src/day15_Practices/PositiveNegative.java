package day15_Practices;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Enter any number");
            int answer = scan.nextInt();
            if (answer>0) {
                positive++;
            }
            else if (answer<0) {
                negative++;
            }
            else {
                continue;
            }
        }
        System.out.println("positive = " + positive);
        System.out.println("negative = " + negative);
    }
}
