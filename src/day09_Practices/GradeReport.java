package day09_Practices;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        int score = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your score");
        score = scan.nextInt();

        if (score<=100 && score>0 ) {
            if (score>91) {
                System.out.println("Your score is A");
            }
            else if ( score>=80 && score<=91 ) {
                System.out.println("Your score is B");
            }
            else if (score<=79 && score>=70) {
                System.out.println("Your score id C");
            }
            else if (score<=69 && score>=60) {
                System.out.println("Your score is D");

            } else {
                System.out.println("Your score is F");
            }


        }
        else {
            System.out.println("Wrong grade");
        }
    }
}
