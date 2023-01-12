package day09_Practices;

import java.util.Scanner;

public class CentsToDollars {

    public static void main(String[] args) {

        int cents = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter cents");
        cents = scan.nextInt();

        if ((cents/100)>0) {
            System.out.println(cents+" cents equal to: "+cents/100+" dollars and "+cents%100+" cents");
        }
        else {
            System.out.println(cents+" cents equal to: "+cents%100+" cents");
        }

    }
}
