package day16_Practices;

public class PrintAlphabets {

    public static void main(String[] args) {

        for ( char ch1 = 'A'; ch1 < 'F'; ch1++) {
            System.out.println(" ");
            for (char ch2 = 'a'; ch2 <= 'z'; ch2++) {
                System.out.print(ch1);
               System.out.print(ch2+" ");



            }
        }

    }
}
