package day09_Practices;

import java.util.Scanner;

public class HowManyPeople {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int people = 0;
        System.out.println("How many people are you live with?");
        people = scan.nextInt();

        if (people > -1) {
            if (people < 3) {
                System.out.println("Live with less than 3 people");
            } else if (people >= 3 && people <= 6) {
                System.out.println("Live with 3 - 6 people");
            } else {
                System.out.println("Live with more than 6 people");
            }
        } else {
            System.out.println("The number can't be negative");
        }
    }
}
