package day11_Practices;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String str = scan.nextLine();
        String result = "";
        str = str.toLowerCase();

        result = str.replaceAll("x","a");



        System.out.println(result);

        }
        }



