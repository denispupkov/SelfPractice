package day11_Practices;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String str1 = scan.nextLine();

        System.out.println("Enter first word");
        String str2 = scan.nextLine();

        if (str1.charAt(str1.length()-1)==str2.charAt(0)) {
            System.out.println(str1+str2.substring(1));
        }
        else {
            System.out.println(str1+str2);
        }
    }
}
