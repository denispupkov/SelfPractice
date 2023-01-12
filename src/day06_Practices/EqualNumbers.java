package day06_Practices;

public class EqualNumbers {

    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 2;
        int n3 = 3;

        if (n1==n2 && n2==n3) {
            System.out.println("All equal");
        }
        else if (n1==n2 && n2 !=n3) {
            System.out.println("n1 and n2 are equal ");
        }
        else if (n2==n3 && n1!=n2) {
            System.out.println("n2 and n3 are equal");
        }
        else if (n3==n1 && n3!=n2) {
            System.out.println("n3 and n1 are equal");
        }
        else {
            System.out.println("None of them are equal");
        }

    }
}
