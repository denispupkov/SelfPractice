package Test;

public class PrimeNumbers {
    public static void main(String[] args) {

        System.out.println(checkPrimeNumber(5));

    }

    public static boolean checkPrimeNumber (int number) {
        boolean isPrime=true;

        for (int divisor = 2; divisor < number; divisor++) {
            if (number%divisor==0) {
                isPrime=false;
                break;
            }
        }

        return isPrime;

    }

}
