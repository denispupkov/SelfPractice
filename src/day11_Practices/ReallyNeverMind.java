package day11_Practices;

import java.util.Scanner;

public class ReallyNeverMind {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String str = scan.nextLine();
        String result = "";

        if (str.endsWith("ly")) {
            System.out.println("Really??");
        }
        else {
            System.out.println("never Mind");
        }

    }
}
