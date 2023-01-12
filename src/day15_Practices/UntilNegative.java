package day15_Practices;

import java.util.Scanner;

public class UntilNegative {

    public static void main(String[] args) {
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");
        int num = scan.nextInt();
        sum+=num;

        while (num>=0) {
            System.out.println("Enter another number");
            num = scan.nextInt();
            sum+=num;
        }
        System.out.println(sum);
    }
}
