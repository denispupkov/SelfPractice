package day22_Practices;

public class LettersDigitsAndChars {

    public static void main(String[] args) {

    String str = "Wooden Spoon!";
    String letters = "";
    String digits = "";
    String specialCharacters = "";

        char [] ch  = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                letters+=ch[i];
            }
            else if (Character.isDigit(ch[i])) {
                digits+=ch[i];
            }
            else {
                specialCharacters+=ch[i];
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialCharacters = " + specialCharacters);

    }
}
