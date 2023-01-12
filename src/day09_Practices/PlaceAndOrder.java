package day09_Practices;

import java.util.Scanner;

public class PlaceAndOrder {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the product name");
        String productName = scan.nextLine();
        System.out.println("Enter the price");
        double price = scan.nextDouble();
        System.out.println("Enter the quantity");
        int quantity = scan.nextInt();
        System.out.println("Enter First Name");
        String firstName = scan.next();

        System.out.println(firstName+", your order for "+quantity+" "+productName+" has been placed." +
                "Your total is "+quantity*price+".");
    }
}
