package day04_Practices;

public class SwapTwoVariables1 {

    public static void main(String[] args) {

        int x = 10;
        int y = 15;
        int z = 0;

        z = x;
        x = y;
        y = z;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
