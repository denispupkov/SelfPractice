package day11_Practices;

import java.util.Scanner;

public class TipCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double totalPerPerson = 0.00;
        double totalTip = 0.00;
        double totalToPay = 0.00;

        System.out.println("Split or No Split (Yes or No)?");
        String isSplit = scan.nextLine();
        System.out.println("Enter the number of people");
        int numberOfPeople = scan.nextInt();
        System.out.println("Enter the check amount");
        double checkAmount = scan.nextDouble();
        scan.nextLine();
        System.out.println("Service quality: Poor/Fair/Good/Great/Excellent");
        String serviceQuality = scan.nextLine();
        double tipPerPerson = 0.00;


        if (isSplit.equalsIgnoreCase("Yes")) {
            totalToPay = checkAmount+(checkAmount*serviceQuality(serviceQuality));
            totalTip = checkAmount*serviceQuality(serviceQuality);
            totalPerPerson = (checkAmount+(checkAmount*serviceQuality(serviceQuality)))
                    /numberOfPeople;
            tipPerPerson = totalTip/numberOfPeople;

        }
        else if (isSplit.equalsIgnoreCase("No")) {
            totalToPay = checkAmount+(checkAmount*serviceQuality(serviceQuality));
            totalTip = checkAmount*serviceQuality(serviceQuality);
            totalPerPerson = checkAmount+(checkAmount*serviceQuality(serviceQuality));
            tipPerPerson = totalTip;
        }
        else {
            System.out.println("Incorrect answer. Use /Yes/ or /No/ only");
        }


        System.out.println("Number of people entered "+numberOfPeople);
        System.out.println("Total to pay: "+totalToPay);
        System.out.println("Total tip: "+totalTip);
        System.out.println("Total per person: "+totalPerPerson);
        System.out.println("Tip per person: "+tipPerPerson);

    }
    public static double serviceQuality (String str) {
        double percent;
        if (str.equalsIgnoreCase("Poor")) {
            percent = 0.05;
        }
        else if (str.equalsIgnoreCase("Fair")) {
            percent = 0.1;
        }
        else if (str.equalsIgnoreCase("Good")) {
            percent = 0.15;
        }
        else if (str.equalsIgnoreCase("Great")) {
            percent = 0.2;
        }
        else if (str.equalsIgnoreCase("Excellent")) {
            percent = 0.25;
        }
        else {
            return 0.05;
        }
        return percent;
    }
}
