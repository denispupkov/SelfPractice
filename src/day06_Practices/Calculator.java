package day06_Practices;

public class Calculator {

    public static void main(String[] args) {

        double n1 = 10;
        double n2 = 20;
        char mathOperator = '*';
        double result = 0;

        if (mathOperator=='+') {
            result = n1+n2;
        }
        else if (mathOperator == '-') {
            result = n1-n2;
        }
        else if (mathOperator=='*') {
            result = n1*n2;
        }
        else if (mathOperator == '/') {
            result = n1/n2;
        }
        else {
            System.out.println("Invalid operator");
        }
        System.out.println(result);
    }
}
