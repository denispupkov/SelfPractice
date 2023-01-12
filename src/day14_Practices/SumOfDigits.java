package day14_Practices;

public class SumOfDigits {

    public static void main(String[] args) {

        String str = "A1B2C5JJ7FFFdd23";
        int num = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i)-48 > 0 && str.charAt(i)-48 <= 9) {
                char ch = str.charAt(i);
                num += ch - 48;
            }
        }
        System.out.println(num);
    }
}
