package day15_Practices;

import java.util.Scanner;

public class LoginFunction {

    public static void main(String[] args) {

        String savedUsername = "Cydeo";
        String savedPassword = "Cydeo123";

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {


            System.out.println("Enter your username");
            String userName = scan.nextLine();
            System.out.println("Enter your password");
            String password = scan.nextLine();


            if (userName.equals(savedUsername) && password.equals(savedPassword)) {
                System.out.println("Logged In");
                break;
            } else if (!(userName.equals(savedUsername) && password.equals(savedPassword))) {
                System.out.println("Your credentials don't match");
            } else if (!(userName.equals(savedUsername) || (!password.equals(savedPassword)))) {

            }
            if (i >= 2) {
                System.out.println("Your account is locked");
                break;
            }
        }

    }
}



