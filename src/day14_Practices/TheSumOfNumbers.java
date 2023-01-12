package day14_Practices;

import java.util.Scanner;

public class TheSumOfNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the ending point number");
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            sum+=i;
        }
        System.out.println(sum);
    }
}
