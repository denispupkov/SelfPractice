package day16_Practices;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String grade = "";
        String answer = "yes";

        while (answer.equalsIgnoreCase("yes")) {
            System.out.println("Enter your score");

            int score = scan.nextInt();

            if (score < 0 || score > 100) {
                System.out.println("Invalid Entry");
                System.exit(1);
            }
            grade = (score >= 90 && score <= 100) ? "A" : (score >= 80 && score <= 89) ? "B" : (score >= 70 && score <= 79) ? "C"
                    : (score >= 60 && score <= 69) ? "D" : "F";
            System.out.println(grade);

            System.out.println("Would you like to continue? Yes/No");
            answer = scan.next();

            while (!(answer.equalsIgnoreCase("yes") ||
                    answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid Entry. Please re-enter");
                answer = scan.next();
            }
            if (answer.equalsIgnoreCase("no")) {
                System.out.println("Thank you for using Cydeo Grade Calculator");
                answer="no";
            }

        }
    }
}
