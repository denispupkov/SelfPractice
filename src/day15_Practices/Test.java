package day15_Practices;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("Would you like to reserve a room?(yes/no)");
        String doYouWantReservation=input.nextLine();

        while (!(doYouWantReservation.equalsIgnoreCase("yes")||
                doYouWantReservation.equalsIgnoreCase("no"))) {
            System.out.println("Invalid entry.Re-enter(yes/no)");
            doYouWantReservation = input.nextLine();
        }

        if(doYouWantReservation.equalsIgnoreCase("no")){
            System.out.println("Have a nice day!");
        }else{
            System.out.println("What type of room you want to reserve?:");
            String typeOfRoom = input.nextLine();
            while (!(typeOfRoom .equalsIgnoreCase("King Bed")||
                    typeOfRoom .equalsIgnoreCase("Queen Bed")||typeOfRoom .equalsIgnoreCase("Single Bed"))) {
                System.out.println("Invalid type of room.Re-enter type of room");
                typeOfRoom = input.nextLine();
            }
            input.close();
            System.out.println((typeOfRoom.equalsIgnoreCase("King Bed")? "King Bed ==> 120$"
                    :(typeOfRoom .equalsIgnoreCase("Queen Bed"))?"Queen Bed ==> 100$"
                    :"single Bed ==> 80$"));
        }
    }
}


