package day06_Practices;

public class Test {
    public static void main(String[] args) {
        String result = "";

        for (int n = 1; n < 21; n++) {

            if (n%2 == 0) {
                result+="Codity";
            }
            if (n%3 == 0) {
                result+="Test";
            }
            if (n%5 == 0) {
                result+= "Coders";
            }
            else {
                result+=n+"\n";
            }
            System.out.println(result);
            result = "";
        }


    }
}





