package day08_Practices;

public class BiggerNum {

    public static void main(String[] args) {

        int n1 = 6;
        int n2 = 6;
        int n3 = 6;
        String result = "";


        result = (n1>=n2 && n1 > n3 || n1>n2 && n1 >= n3)?"n1 is bigger":(n2>=n1 && n2>n3 || n2>n1 && n2>=n3)?"n2 is bigger"
                :(n3>=n1 && n3>n2 || n3>n1 && n3>=n2)? "n3 is bigger":"n1 and n2 and n3 are equal";
        System.out.println(result);

    }
}
