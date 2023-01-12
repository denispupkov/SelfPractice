package day11_Practices;

import java.util.Scanner;

public class PrintInRegularFormat {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name");
        String str1 = scan.nextLine();

        System.out.println("Enter last name");
        String str2 = scan.nextLine();

        str1 = str1.toLowerCase();
        str1 = str1.replace(str1.charAt(0),str1.toUpperCase().charAt(0));

        str2 = str2.toLowerCase();
        str2 = str2.replace(str2.charAt(0),str2.toUpperCase().charAt(0));

        System.out.println(str1+" "+str2);
    }
}
