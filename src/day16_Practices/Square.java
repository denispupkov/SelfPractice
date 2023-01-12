package day16_Practices;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
        System.out.println("Enter the side of square");

        double side = scan.nextDouble();

        if (side<=0) {
            System.out.println("Invalid entry for the side of the square");
            System.exit(1);
        }

        System.out.println("The area of the square is "+side*side);
        System.out.println("The perimeter of the square is "+(4*side));

        System.out.println("Would you like to calculate another Square? Yes/No");
        String answer = scan.next();

        while (!(answer.equalsIgnoreCase("yes") ||
                answer.equalsIgnoreCase("no"))) {
            System.out.println("Invalid entry. Please re-enter");
            answer = scan.next();
        }
        if (answer.equalsIgnoreCase("no")) {
            System.out.println("Thank you for using Cydeo Square");
            break;
        }

    }
}
    }
