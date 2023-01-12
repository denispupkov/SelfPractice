package day06_Practices;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 2, b = 3, c = 1;

        if (a>b && a<c && b<c || a<b && a>c && b>c) {
            System.out.println(a+" median number");
        }
        if (a<b && a<c && b<c || a>b && a>c && b>c) {
            System.out.println(b+" median number");
        }
        if (a<b && a<c && b>c || a>b && a>c && b<c) {
            System.out.println(c+" median number");
        }


    }
}
