package day14_Practices;

public class Palindrome {

    public static void main(String[] args) {

        String str = "Redivider";
        boolean b = false;
        for (int i = 0; i < str.length()/2; i++) {

            if (str.toLowerCase().charAt(i)==str.toLowerCase().charAt(str.length()-1-i)) {
                b = true;
            }
            else {
                b = false;
            }
        }
        System.out.println(b);

    }
}
