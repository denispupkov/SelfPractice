package day16_Practices;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {
String yesNoAnswer = "yes";
String roomAnswer = "";
        Scanner scan = new Scanner(System.in);

        while (yesNoAnswer.equalsIgnoreCase("yes")) {

            System.out.println("We have King Bed, Queen Bed and single Bed");
            System.out.println("Which bedroom do you want to reserve?");
            roomAnswer = scan.nextLine();

            while (!(roomAnswer.equalsIgnoreCase("King bed") ||
                    (roomAnswer.equalsIgnoreCase("Queen Bed")) ||
                    roomAnswer.equalsIgnoreCase("Single Bed"))) {
                System.out.println("Invalid entry. Please answer King bed, Queen bed or single bed");
                roomAnswer = scan.nextLine();
            }
            System.out.println("How many nights?");
            int nights = scan.nextInt();

            while (nights < 1) {
                System.out.println("Invalid entry. Please re-enter");
                nights = scan.nextInt();
            }
            System.out.println("Would you like to reserve another room? Yes/No");
            yesNoAnswer = scan.next();

            while (!(yesNoAnswer.equalsIgnoreCase("yes") ||
                    (yesNoAnswer.equalsIgnoreCase("no")))) {
                System.out.println("Invalid entry. Please answer Yes or No");
                yesNoAnswer = scan.next();
            }
            if (yesNoAnswer.equalsIgnoreCase("no")) {
                System.out.println("Your total price is " +
                        (roomAnswer.equalsIgnoreCase("King Bed")? 120 * nights:
                                (roomAnswer.equalsIgnoreCase("Queen Bed")? 100 * nights: 80 * nights)));
                break;
            }
            scan.nextLine();
        }
    }
}