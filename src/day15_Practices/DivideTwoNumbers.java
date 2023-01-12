package day15_Practices;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;
        char operator = '*';
        int count = 0;
        int result = 0;

        if (num1>0 && num2>0 && operator == '/') {
            while (num1>=num2) {
                num1-=num2;
                count++;
            }
        }
        else if (num1>0 && num2>0 && operator == '*') {
            for (int i = 0; i < num2; i++) {
                count += num1;
            }
        }

        System.out.println(count);
    }

}
