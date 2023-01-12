package day09_Practices;

import java.util.Scanner;

public class StockMarket {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many total shares you have already?");
        int totalShares = scan.nextInt();

        System.out.println("How much total value in the stock market is?");
        double totalValue = scan.nextDouble();

        scan.nextLine();

        System.out.println("Enter the name of the company with the most shares");
        String companyName = scan.nextLine();

        System.out.println("Your total stock market holding is $"+totalValue+
                " which is made up of "+totalShares+". "+companyName+" is your company holdings");
    }
}
