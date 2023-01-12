package day11_Practices;

import java.util.Scanner;

public class emailTask2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email");
        String email = scan.nextLine();
        String firstName = email.substring(0,email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        firstName = firstName.replace(firstName.charAt(0),firstName.toUpperCase().charAt(0));
        lastName = lastName.replace(lastName.charAt(0),lastName.toUpperCase().charAt(0));

        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Domain: "+domain);

    }
}
