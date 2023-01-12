package day15_Practices;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = 0;

        System.out.println("Enter String");
        String answer = scan.nextLine();
        System.out.println("Enter a char");
        char ch = scan.next().charAt(0);

        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i)==ch) {
                count ++;
            }

        }
        System.out.println(count);
    }
}
