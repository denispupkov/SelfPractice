package day11_Practices;

import java.util.Scanner;

public class StartWithX {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String str = scan.nextLine();
        str = str.toLowerCase();
        String result = "";

        if (str.startsWith("x") || str.startsWith("X") ) {
            result = str.replaceFirst("x","a");
        }
        else {
            result = str;
        }
        System.out.println(result);
        scan.close();
    }

}
