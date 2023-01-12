package day16_Practices;

import java.util.Scanner;

public class AreaAndPerimeter {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String answer = "yes";

        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Enter the radius of circle");

            double r = scan.nextDouble();
            if (r <= 0) {
                System.err.println("Invalid Entry for the radius of a circle");
                System.exit(1);
            }
            System.out.println("Diameter of the circle is " + r * 2);
            System.out.println("Area of the circle is " + Math.PI * Math.pow(r, 2));
            System.out.println("Perimeter of the circle is " + 2 * Math.PI * r);

            System.out.println("Would you like to calculate another circle? Yes/No");
            answer = scan.next();
            while (!(answer.equalsIgnoreCase("No") ||
                    answer.equalsIgnoreCase("Yes"))) {
                System.out.println("Wrong Answer. Please re-enter");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Circle");
                answer="no";
            }

        }
    }
}
