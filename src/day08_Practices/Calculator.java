package day08_Practices;

public class Calculator {

    public static void main(String[] args) {
        double n1 = 2.0;
        double n2 = 3.0;
        char mathOperator = '=';
        double result = 0.00;

        switch (mathOperator) {
            case '+':
                result = n1+n2;
                break;
            case '-':
                result = n1-n2;
                break;
            case '*':
                result = n1*n2;
                break;
            case '/':
                result = n1/n2;
                break;

            default:
                System.out.println("Invalid Operator");


        }
        System.out.println("n1 = "+n1+", n2 = "+n2+" mathOperator = '"+mathOperator+"'\n Output: "+result);

    }
}


