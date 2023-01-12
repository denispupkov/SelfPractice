package day16_Practices;

public class printTriangleShape {

    public static void main(String[] args) {

     //   String str = "  ";
       // for (int i = 0; i < 10; i++) {
       //     System.out.println(str+=" * ");
      //  }


        String str1 = "* ";

        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(str1);
            }
            System.out.println();
        }


    }
}
