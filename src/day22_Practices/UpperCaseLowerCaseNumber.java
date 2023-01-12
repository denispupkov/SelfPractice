package day22_Practices;

import java.util.Arrays;

public class UpperCaseLowerCaseNumber {

    public static void main(String[] args) {

    String str = "JAVA java";
    str=str.replace(" ","");
    int upper = 0;
    int lower = 0;
    char [] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
           if ( Character.isUpperCase(ch[i]  ))  {
               upper++;
           }
           else {
               lower++;
           }

        }
        System.out.println("upper = " + upper);
        System.out.println("lower = " + lower);

        if (upper==lower) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }

}
