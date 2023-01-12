package day06_Practices;

public class CharacterIdentity {

    public static void main(String[] args) {

        char ch = '}';

        if (ch>=32 && ch<=47 || ch>=58 && ch<=64 || ch>=91 && ch<=96 || ch>=123 && ch<=126) {
            System.out.println("Special Character");
        }
        else if (ch>=48 && ch<=57) {
            System.out.println("Digit");
        }
        else if (ch>=65 && ch<=90 || ch>=97 && ch<=122) {
            System.out.println("Alphabetic Character");
        }
        else {
            System.out.println("Wrong Character");
        }
    }
}
