package day16_Practices;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String answer = "yes";

        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Enter the length of the rectangle");
            double length = scan.nextDouble();

            if (length <= 0) {
                System.err.println("Invalid entry for the length of the Rectangle");
                System.exit(1);
            }

            System.out.println("Enter the width of the rectangle");
            double width = scan.nextDouble();

            if (width <= 0) {
                System.err.println("Invalid entry for the width of the Rectangle");
                System.exit(1);
            }

            System.out.println("The area of the rectangle is " + length * width);
            System.out.println("The Perimeter of the rectangle is " + 2 * (length + width));

            System.out.println("Do you want to calculate another rectangle? Yes/No");
            answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") ||
                    answer.equalsIgnoreCase("no"))) {
                System.out.println("Please re-entry your answer");
                answer = scan.next();

                if (answer.equalsIgnoreCase("no")) {
                    System.out.println("Thank you for using Cydeo Rectangle");
                }
            }
        }
    }
}
