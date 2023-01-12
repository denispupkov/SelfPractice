package day15_Practices;

import java.util.Scanner;

public class DivisibleBy {

    public static void main(String[] args) {

        String by15 = "";
        String by5 = "";
        String by3 = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter ending number");
        int endingNumber = scan.nextInt();

        for (int i = 1; i <= endingNumber; i++) {
            if (i%5==0 && i%3==0) {
                by15+=i+" ";
            }
            else if (i%3==0) {
                by3+=i+" ";
            }
            else if (i%5==0) {
                by5+=i+" ";
            }
        }
        System.out.println("Divisible by 15: "+by15);
        System.out.println("Divisible by 5: "+by5);
        System.out.println("Divisible by 3: "+by3);


    }
}
