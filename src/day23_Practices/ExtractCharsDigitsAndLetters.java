package day23_Practices;

import java.util.ArrayList;

public class ExtractCharsDigitsAndLetters {

    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> letters = new ArrayList<>();

        char[] ch = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                digits.add(str.charAt(i));
            }
            if (Character.isLetter(str.charAt(i))) {
                letters.add(str.charAt(i));
            }
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                chars.add(str.charAt(i));
            }
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("chars = " + chars);
    }
}
