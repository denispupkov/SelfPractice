package day11_Practices;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your email");
        String email1 = scan.nextLine();
        String email2 = "";

        if (email1.contains("_")) {
           email2 = email1.substring(email1.indexOf("_")+1,email1.indexOf("@"))+"_";
           email2+= email1.substring(0,email1.indexOf("_"));
           email2+= email1.substring(email1.indexOf("@"));
        }
        else {
            System.out.println(email1);
        }
        System.out.println(email2);




    }
}
