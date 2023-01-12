package day11_Practices;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String str1 = scan.nextLine();

        System.out.println("Enter first word");
        String str2 = scan.nextLine();

        System.out.println(str1.substring(1)+str2.substring(1));

        }
    }

