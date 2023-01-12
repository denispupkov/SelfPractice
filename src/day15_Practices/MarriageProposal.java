package day15_Practices;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        System.out.println("Will you marry me?");
        String answer = scan.next();


        while (!(answer.equalsIgnoreCase("yes") ||
                answer.equalsIgnoreCase("no"))) {
            System.out.println("Invalid answer, please re-enter");
            System.out.println("Will you marry me?");
            answer=scan.next();
        }

        if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Congrats.");
            } else if (answer.equalsIgnoreCase("no")) {
                System.out.println("Goodbye");
            } else if ((!answer.equalsIgnoreCase("yes") ||
                    answer.equalsIgnoreCase("no"))) {
                System.out.println("Invalid answer, please re-enter");



        }
    }
}



