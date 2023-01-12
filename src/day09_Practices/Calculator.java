package day09_Practices;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first number");
        int num1 = scan.nextInt();

        System.out.println("Enter your math operator");
        char operator = scan.next().charAt(0);

        System.out.println("Enter your second operator");
        int num2 = scan.nextInt();

        if (operator=='+') {
            System.out.println(num1+num2);
        }
        else if (operator=='-') {
            System.out.println(num1-num2);
        } else if (operator=='*') {
            System.out.println(num1*num2);

        }else if (operator=='/'){
            System.out.println(num1/num2);
        }
        else {
            System.out.println("Invalid operator");
        }


    }
}
