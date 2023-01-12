package day14_Practices;

public class RetriveTheDigits {

    public static void main(String[] args) {

        String str = "mn@#123Ab!";
        String letters = "";
        String digits = "";
        String chars = "";

        for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i)>= 48 && str.charAt(i)<= 57 ) {
            digits+=str.charAt(i);
        }
        else if (str.charAt(i)>=65 && str.charAt(i)<=90 || str.charAt(i)>=97 && str.charAt(i)<=122) {
            letters+=str.charAt(i);
        }
        else {
            chars+=str.charAt(i);
        }

        }
        System.out.println("letters "+letters);
        System.out.println("digits "+digits);
        System.out.println("special chars "+chars);
    }
}
