package day09_Practices;

import java.util.Scanner;

public class MilesToKm {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter miles:");
        double miles = scan.nextDouble();

        System.out.println(miles+" miles equal to "+miles*1.609+" kilometers");


    }
}
