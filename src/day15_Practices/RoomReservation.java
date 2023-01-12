package day15_Practices;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {
        String yesNoAnswer = "";
        String roomType = "";

        Scanner scan = new Scanner(System.in);

        System.out.println("Do you want to reserve a room?");
        yesNoAnswer = scan.next();
        scan.nextLine();

        while (!(yesNoAnswer.equalsIgnoreCase("yes") ||
                (yesNoAnswer.equalsIgnoreCase("no")))) {
            System.out.println("Please re-enter. Do you want to reserve a room?");
            yesNoAnswer = scan.next();
        }
            if (yesNoAnswer.equalsIgnoreCase("yes")) {
                System.out.println("What type of room do you want to reserve? King/Queen/Single?");
                roomType = scan.nextLine();

                while (!(roomType.equalsIgnoreCase("king") ||
                        roomType.equalsIgnoreCase("queen") ||
                        roomType.equalsIgnoreCase("single"))) {
                    System.out.println("Please re-enter. What type of room do you want to reserve? King/Queen/Single?");
                    roomType = scan.nextLine();
                }
                if (roomType.equalsIgnoreCase("king")) {
                    System.out.println("The price for the "+roomType.toUpperCase()+" bed is $120");
                }
                else if (roomType.equalsIgnoreCase("queen")) {
                    System.out.println("The price for the "+roomType.toUpperCase()+" bed is $100");
                }
                else {
                    System.out.println("The price for the "+roomType.toUpperCase()+" bed is $80");
                }
            } else if (yesNoAnswer.equalsIgnoreCase("no")) {
                System.out.println("Have a nice day!");

            }
                }
            }





